
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */
public class Exp extends javax.swing.JFrame {

    /**
     * Creates new form Exp
     */
    
    String sid=null;
            String amount=null;
            String date=null;
           String name=null;
        int globalempid;
//            String pf=null;
//            String esic=null;
        
        
         String id;
      TableRowSorter<TableModel> sorter;
     ArrayList id_array=new ArrayList(0);
    ArrayList<String> getrow1=new ArrayList<String>();
    int table_counter=0;    
    TableModel model;
            
       ConItem    cn1=new ConItem();
           
    DB db=new DB ();
  //  String id;
//    public Expenses() {
//        initComponents();
//        jComboBox1.removeAllItems();
//          fillrec();
//          loadInTable();
    
    public Exp() {
        initComponents();
        jComboBox1.removeAllItems();
          fillrec();
          loadInTable();
    }
    
      void fillrec()
    {
        try
        {
            cn1=new ConItem();
            cn1.st=cn1.con.createStatement();
           // String itemname=t2.getText(); 
            
            cn1.rs=cn1.st.executeQuery("select name from staff ");
                        if(cn1.rs.next())
            {do
            {
                jComboBox1.addItem(cn1.rs.getString("name")+" ");
                
                            }while(cn1.rs.next());
            }
            else
            {
                System.out.println("no record is added");
                
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
       void findid()
    {
         {try
    {
      
        
        
        
        ConItem cn1=new ConItem();
        cn1.st=cn1.con.createStatement();
      //  cn1.stmt=cn1.con.prepareStatement("update item4 set item_name=? where item_no=?");
        //t1.selectAll();
        //t1.setText("");
    //    int ino=Integer.parseInt(t1.getText());
       // String s=(t1.getText());
        String s=String.valueOf(jComboBox1.getSelectedItem());
        cn1.rs=cn1.st.executeQuery("select * from staff where name='" +s+"'");
        
        if(cn1.rs.next())
//                
        {
            
          //  t2.setText(String.valueOf(cn1.rs.getInt("item_id")));
//                
//              jTextField2.setText(String.valueOf(cn1.rs.getInt("holidays")));
//                jTextField3.setText(String.valueOf(cn1.rs.getInt("working_hours")));
//                  jTextField4.setText(String.valueOf(cn1.rs.getInt("overtime")));
//                    jTextField9.setText(String.valueOf(cn1.rs.getInt("basic")));
//                     jTextField5.setText(String.valueOf(cn1.rs.getDouble("ha")));
//                                          jTextField6.setText(String.valueOf(cn1.rs.getDouble("da")));
//jTextField7.setText(String.valueOf(cn1.rs.getDouble("esic")));

globalempid=(cn1.rs.getInt("Staff_Id"));
            System.out.println("globalempid="+globalempid);
//jTextField6.setText(String.valueOf(cn1.rs.getDouble("ha")));


//
//                          t3.setText(cn1.rs.getString("type")); 
//                          t4.setText(String.valueOf(cn1.rs.getInt("price")));
//                          t5.setText(String.valueOf(cn1.rs.getInt("Quantity")));
//                          t6.setText(cn1.rs.getString("description"));
                  
                }
        
        else
        {
            System.out.println("no record found");
            
        }
    }catch(Exception e)
    {
        System.out.println(e);
       // e.setStackTrace(stackTrace);
       e.printStackTrace(); 
    } }
       
    }
       
         
   public void loadInTable(){
        //ConItem cn1=new ConItem();
        table_counter=1; //id_array
       
       //  String sql = "select  item_id, item_name,item_type,type,price,Quantity from item2 where type='veg'";
          String sql = "SELECT expid,  expname, sid,amount,DATE FROM expenses WHERE STATUS='Active' ";
            try{
                 ConItem cn1=new ConItem();
               // Connection con = (Connection) Action.getDBConnection();
              cn1. st = cn1. con.createStatement();
                cn1. rs = cn1.st.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                Object data[] = new Object[5];
                while(cn1.rs.next())
                {
                    id_array.add(cn1.rs.getObject("expid"));
                    data[0] = table_counter+"";
                    data[1] = cn1.rs.getObject("expname");
                    //data[2] =cn1. rs.getObject("");
                    
                    String stfid=cn1.rs.getString("sid");
                    data[3] = cn1.rs.getObject("amount");
                  data[4] = cn1.rs.getObject("date");
//                  data[5] = cn1.rs.getObject("designation");
//                  data[6] = cn1.rs.getObject("dob");
//                  data[7] = cn1.rs.getObject("doj");
                  
                 
                
                try
        {
         ResultSet   rs1=db.execute_query("select name from staff where Staff_Id=?",new String[]{stfid});
            while(rs1.next())
            {
                data[2]=rs1.getString("name");
            }
        }
                  catch(Exception e)
                  {
                      e.printStackTrace();
                  }
                  
                  
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
          
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Expenses Name");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setText("Employee Name");

        jLabel3.setText("Amount");

        jLabel4.setText("Date");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)))
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "serial No", "Expname", "StaffName", "Amount", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        int i = Validation.numvalid(jTextField1.getText());
        if (i == 1) {
            jTextField1.selectAll();
            jTextField1.setText("");
        }        // TODO add your
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // TODO add your handling code here:
        String date = new DatePicker(new JFrame()).setPickedDate();
        jTextField3.setText(date);
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try
        {

            sid=jTextField1.getText();
            amount=jTextField2.getText();
            date=jTextField3.getText();
            String ch=jComboBox1.getSelectedItem().toString();
            int flagValidation = 0;
            String validation = null;
            findid();
            String empIdstr=String.valueOf(globalempid);
            System.out.println("empIdstr="+empIdstr);
            //            if(name.equals(""))
            //            {
                //                validation = "\nPlease Enter valid name ";
                //                flagValidation = 1;
                //            }
            //
            //            if(address.equals(""))
            //            {
                //                validation = validation + "\nPlease Enter  valid time";
                //                flagValidation = 1;
                //            }

            if(flagValidation == 1)

            {
                JOptionPane.showMessageDialog(null,validation,"Error",JOptionPane.ERROR_MESSAGE);
                return;
            }

            else
            {
                String sql="Insert into expenses(expname,sid,amount,date,status,created_id) values (?,?,?,?,?,?)";

                int e = db.insert_data(sql,
                    new String[]{sid,empIdstr, amount,date,
                        "Active","786",
                    });

                    //                String sql2="Insert into login(username,password,level) values (?,?,?)";
                    //
                    //                int e1 = db.insert_data(sql2,
                        //                    new String[]{username, password,"Staff"

                            //                    });

                    JOptionPane.showMessageDialog(this, "Record Inserted");

                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }

            loadInTable();
            //  GlobalVariable
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        //update() ;
        loadInTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //delete2();
        loadInTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
             try
    {int sr=jTable1.getSelectedRow();
   // String id=getrow.add(sr).toString();
    
    //select * from item  where item_id=
        System.out.println(" table mouse operation is perform ");
    id=id_array.get(sr).toString();
  // int  id1=id_array.get(sr).toString();
    ConItem cn1=new ConItem();
    cn1.st=cn1.con.createStatement();
    cn1.rs=cn1.st.executeQuery("Select * from expenses where expid="+id);
    
    if(cn1.rs.next())
    {
        jTextField1.setText(cn1.rs.getString("expname"));
           jTextField2.setText(String.valueOf(cn1.rs.getDouble("amount")));
            jTextField3.setText(String.valueOf(cn1.rs.getDate("date")));
int staffid=           (cn1.rs.getInt("sid"));
        System.out.println("staffId="+staffid);
    }
    
        
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
