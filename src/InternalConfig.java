
//import Other.DB;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */
public class InternalConfig extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalConfig
     * 
     */
     ArrayList id_array=new ArrayList(0);
    ArrayList<String> getrow1=new ArrayList<String>();
    int table_counter=0;    
    
    
    //this variable for database 
    String c_type=null;
            String bs=null;
            String hs=null;
            String ha=null;
            String ta=null;
            String pf=null;
            String esic=null;
           String id;  
    DB db=new DB ();
    public InternalConfig() {
        initComponents();
         loadInTable();
        
    }
    
      public void loadInTable(){
        //ConItem cn1=new ConItem();
        table_counter=1; //id_array
       
       //  String sql = "select  item_id, item_name,item_type,type,price,Quantity from item2 where type='veg'";
          String sql = "select  c_id, c_type,basicsalary,hourlysalary,ha,ta,pf,esic from config where status='Active' ";
            try{
                 ConItem cn1=new ConItem();
               // Connection con = (Connection) Action.getDBConnection();
              cn1. st = cn1. con.createStatement();
                cn1. rs = cn1.st.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel) config8.getModel();
                model.setRowCount(0);
                Object data[] = new Object[8];
                while(cn1.rs.next())
                {
                    id_array.add(cn1.rs.getObject("c_id"));
                    data[0] = table_counter+"";
                    data[1] = cn1.rs.getObject("c_type");
                    data[2] =cn1. rs.getObject("basicsalary");
                    data[3] = cn1.rs.getObject("hourlysalary");
                  data[4] = cn1.rs.getObject("ha");
                  data[5] = cn1.rs.getObject("ta");
                  data[6] = cn1.rs.getObject("pf");
                  data[7] = cn1.rs.getObject("esic");
                  
                    model.addRow(data);
                    table_counter++;     
                }
                cn1.rs.close();
                cn1.st.close();
                 
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
      void update()
    {
        try
           
        {   ConItem cn1=new ConItem();
            cn1.st=cn1.con.createStatement();
            
            //int ino=Integer.parseInt(t1.getText());
            String s=(jTextField2.getText());
            
         cn1.stmt=cn1.con.prepareStatement("update config set basicsalary=?,hourlysalary=? ,ha=?,ta=?,pf=?,esic=?where c_type='"+s+"'");
            //cn1.stmt.setInt(1, Integer.parseInt(t1.getText()));
          
           cn1.stmt.setInt(1,Integer.parseInt(jTextField3.getText()));
             cn1.stmt.setDouble(2,Double.parseDouble(jTextField6.getText()));
              cn1.stmt.setDouble(3,Double.parseDouble(jTextField4.getText()));
               cn1.stmt.setDouble(4,Double.parseDouble(jTextField5.getText()));
                 cn1.stmt.setDouble(5,Double.parseDouble(jTextField7.getText()));
                   cn1.stmt.setDouble(6,Double.parseDouble(jTextField8.getText()));
                  // cn1.stmt.setDouble(7,Double.parseDouble(jTextField8.getText()));
                   
//          cn1.stmt.setString(2,t3.getText());
//         String p=(t4.getText());
//        // String  p2= new Integer(p).toString();
//         
//          cn1.stmt.setInt(3,Integer.parseInt(p));
//           String p2=(t5.getText());
//            cn1.stmt.setInt(4,Integer.parseInt(p2));
//          cn1.stmt.setString(5,t6.getText());
         // cn1.stmt.setInt(4,t5.getText().toString());
            //cn1.stmt.setString(5,t5.getText());       
           // p2 = (p);
   
            int i=cn1.stmt.executeUpdate();
            
            if(i==-1)
            {
                System.out.println("no record is updated" );
                 JOptionPane.showMessageDialog(this, "record not updated"); 
                 
                
            }
            else
            {
                System.out.println("record is updated");
                 JOptionPane.showMessageDialog(this, "record  updated"); 
            }
        }catch(Exception e)
                {
                   System.out.println(e);
                 e.printStackTrace();  
                }
        //loadInTable();
    }
      
         void delete2()
       {Object[] options = {"Yes","No"};
                          
                                 int n = JOptionPane.showConfirmDialog(null, "Are you sure to want a delete","Delete Conform", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
           
        if(n==JOptionPane.YES_OPTION)
                                {                                    
                                         int result = db.update_data("Update config set status = ? where c_id = ?", 
                                                                          new String[]{"DEACTIVE",id});
                                         
                                         
                                           }
                         //                refreshTable();
                                
//                      if(n==JOptionPane.NO_OPTION)  
//                      {    
//                          this.dispose();
//                          
//                                
//                        }
       }
          
      
       void delete()
    {  try
    {
         ConItem cn1=new ConItem();
         //int ino=Integer.parseInt(st1.getText());
         String s=jTextField2.getText();
         cn1.st=cn1.con.createStatement();
        cn1.stmt=cn1.con.prepareStatement("delete  from config where c_type=?");
       cn1.stmt.setString(1, s);
        int i=cn1.stmt.executeUpdate();
        if(i==-1)
        {
            System.out.println("not deleted");
             JOptionPane.showMessageDialog(this, "record is not deleted"); 
            
        }
        else
        {
            System.out.println("record is deleted");
             JOptionPane.showMessageDialog(this, "record is deleted"); 
        }
    
    }catch(Exception e)
    {
        System.out.println(e);
        e.printStackTrace();
        
    }
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this loadInTable(); code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        config8 = new javax.swing.JTable();

        setClosable(true);
        setTitle("ConfigDetails");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Staff_Type");

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Basic Salary");

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("HRA");

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("TA");

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(153, 153, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Hourly Salary");

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 153, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Pf");

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(153, 153, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Esic");

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Actions-document-save-icon.png")); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Pencil-icon.png")); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Button-Close-icon.png")); // NOI18N
        jButton3.setText("close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\data-remove-icon.png")); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2)
                                .addComponent(jTextField3)
                                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        config8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SerialNo", "Staff_Type", "Basic salary", "Hourly salary", "HA", "TA", "PF", "Esic"
            }
        ));
        config8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                config8MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(config8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 217, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
         int i = Validation.charvalid(jTextField7.getText());
        if (i == 1) {
            jTextField7.selectAll();
            jTextField7.setText("");
        }    
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            c_type=jTextField2.getText();

            bs=jTextField3.getText();
            hs = jTextField6.getText();
            ha=jTextField4.getText();
            ta=jTextField5.getText();
            pf=jTextField7.getText();
            esic=jTextField8.getText();

            int flagValidation = 0;
            String validation = null;

            if(c_type.equals(""))
            {
                validation = "\nPlease Enter config type ";
                flagValidation = 1;
            }

            if(bs.equals(""))
            {
                validation = validation + "\nPlease Enter  basic salary";
                flagValidation = 1;
            }

            if(hs.equals(""))
            {
                validation = "\nPlease Enter hourly salary ";
                flagValidation = 1;
            }
            if(ha.equals(""))
            {
                validation = "\nPlease Enter House Rent allownce ";
                flagValidation = 1;
            }

            if(ta.equals(""))
            {
                validation = "\nPlease Enter Tearness allownce ";
                flagValidation = 1;
            }
            if(pf.equals(""))
            {
                validation = "\nPlease Enter provident fund ";
                flagValidation = 1;
            }

            if(esic.equals(""))
            {
                validation = "\nPlease Enter esic ";
                flagValidation = 1;
            }

            if(flagValidation == 1)

            {
                JOptionPane.showMessageDialog(null,validation,"Error",JOptionPane.ERROR_MESSAGE);
                return;
            }

            else
            {
                String sql="Insert into config(c_type,basicsalary,hourlysalary,ha,ta,pf,esic,status) values (?,?,?,?,?,?,?,?)";

                int e = db.insert_data(sql,
                    new String[]{c_type, bs,hs,
                        ha,ta,pf,esic,"Active"
                    });

                    JOptionPane.showMessageDialog(this, "record inserted");

                }

            }catch(Exception e)
            {
                e.printStackTrace();
            }
            loadInTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        update();
        loadInTable();
    }//GEN-LAST:event_jButton2ActionPerformed

//     private void config8MouseClicked(java.awt.event.MouseEvent evt) {                                    
//        // TODO add your handling code here:
//          try
//    {int sr=config8.getSelectedRow();
//   // String id=getrow.add(sr).toString();
//    
//    //select * from item  where item_id=
//    String id;
//    id=id_array.get(sr).toString();
//    ConItem cn1=new ConItem();
//    cn1.st=cn1.con.createStatement();
//    cn1.rs=cn1.st.executeQuery("Select * from config where c_id="+id);
//    
//    if(cn1.rs.next())
//    {
//        jTextField2.setText(cn1.rs.getString("c_type"));
//           jTextField3.setText(String.valueOf(cn1.rs.getInt("basicsalary")));
//             jTextField6.setText(String.valueOf(cn1.rs.getDouble("hourlysalary")));
//               jTextField4.setText(String.valueOf(cn1.rs.getDouble("ha")));
//                 jTextField5.setText(String.valueOf(cn1.rs.getDouble("ta")));
//                 jTextField7.setText(String.valueOf(cn1.rs.getDouble("pf")));
//                  jTextField8.setText(String.valueOf(cn1.rs.getDouble("esic")));
//    }
//    
//        
//    }catch(Exception e)
//    {
//        e.printStackTrace();
//    }
//    }                                   

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
   //     delete();
        delete2();
        loadInTable();

    }//GEN-LAST:event_jButton4ActionPerformed
//
    private void config8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_config8MouseClicked
        // TODO add your handling code here
        
         // TODO add your handling code here:
          try
    {int sr=config8.getSelectedRow();
   // String id=getrow.add(sr).toString();
    
    //select * from item  where item_id=
   // String id;
    id=id_array.get(sr).toString();
    ConItem cn1=new ConItem();
    cn1.st=cn1.con.createStatement();
    cn1.rs=cn1.st.executeQuery("Select * from config where c_id="+id);
    
    if(cn1.rs.next())
    {
        jTextField2.setText(cn1.rs.getString("c_type"));
           jTextField3.setText(String.valueOf(cn1.rs.getInt("basicsalary")));
             jTextField6.setText(String.valueOf(cn1.rs.getDouble("hourlysalary")));
               jTextField4.setText(String.valueOf(cn1.rs.getDouble("ha")));
                 jTextField5.setText(String.valueOf(cn1.rs.getDouble("ta")));
                 jTextField7.setText(String.valueOf(cn1.rs.getDouble("pf")));
                  jTextField8.setText(String.valueOf(cn1.rs.getDouble("esic")));
    }
    
        
    }catch(Exception e)
    {
        e.printStackTrace();
    } 
    }//GEN-LAST:event_config8MouseClicked

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        int i =Validation.charvalid(jTextField3.getText());
        if (i == 1) {
            jTextField3.selectAll();
            jTextField3.setText("");
        }    
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextField2.setText("");
         jTextField3.setText("");
          jTextField4.setText("");
           jTextField5.setText("");
            jTextField6.setText("");
             jTextField7.setText("");
              jTextField8.setText("");
               //jTextField9.setText("");
               
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
         int i = Validation.charvalid(jTextField6.getText());
        if (i == 1) {
            jTextField6.selectAll();
            jTextField6.setText("");
        }    
        
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
          int i = Validation.charvalid(jTextField4.getText());
        if (i == 1) {
            jTextField4.selectAll();
            jTextField4.setText("");
        }    
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
         int i = Validation.charvalid(jTextField5.getText());
        if (i == 1) {
            jTextField5.selectAll();
            jTextField5.setText("");
        }    
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        // TODO add your handling code here:
         int i = Validation.charvalid(jTextField8.getText());
        if (i == 1) {
            jTextField8.selectAll();
            jTextField8.setText("");
        }    
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        // numvalid
                  int i = Validation.numvalid(jTextField8.getText());
        if (i == 1) {
            jTextField2.selectAll();
            jTextField2.setText("");
        }    
                 
    }//GEN-LAST:event_jTextField2KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable config8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
