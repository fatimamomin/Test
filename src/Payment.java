
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
//    public Payment(double total) {
//        initComponents();
//        jTextField3.setText(total+"");
//        j 
//   }
     String sp_id = null;
    String s_id  = null;
    String stype = null;
    String basic=null;
    String date= null;
    String ha = null;
    String ta = null;
    String pf = null;
    String esic=null;
//    FileInputStream fin;
 //   File file ;
    String gs = null;
    String deduction = null;
    String takehome = null;
    
    String dateString;
    int globalempid;
    ConItem cn1=new ConItem();
     DB db = new DB();
    public Payment() {
        initComponents();
         jDateChooser1.setDateFormatString("yyyy-MM-dd");
      //  jDateChooser1.setDateFormatString("yyyy-MM-dd");
       //global variable access 
     //   jTextField3.setText(String.valueOf(GlobalVariable.gpayment));
    
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
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Staff_Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Date");

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Staff_Type");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("BasicSalary");

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("HA");

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("TA");

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("PF");

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("ESIC");

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Deduction");

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("TakeHome");

        jTextField9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Actions-document-save-icon.png")); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Button-Add-icon.png")); // NOI18N
        jButton2.setText("CalculateSalary");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Button-Close-icon.png")); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Misc-New-Database-icon.png")); // NOI18N
        jButton4.setText("NewConfigAdd");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("GrossSalary");

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8)
                            .addComponent(jTextField9)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     void fillrec()
    {
        try
        {
            cn1=new ConItem();
            cn1.st=cn1.con.createStatement();
           // String itemname=t2.getText(); 
            
            cn1.rs=cn1.st.executeQuery("select name from staff where status='Active' ");
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
    
     
     void search()
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
jTextField2.setText(cn1.rs.getString("designation"));
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
        cn1.rs=cn1.st.executeQuery("select * from staff where name='" +s+"' And status= 'Active'");
        
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
    
     
       void search2()
    {try
    {
        ConItem cn1=new ConItem();
        cn1.st=cn1.con.createStatement();
      //  cn1.stmt=cn1.con.prepareStatement("update item4 set item_name=? where item_no=?");
        //t1.selectAll();
        //t1.setText("");
    //    int ino=Integer.parseInt(t1.getText());
       String s=(jTextField2.getText());
       // String s=String.valueOf(jComboBox1.getSelectedItem());
        cn1.rs=cn1.st.executeQuery("select * from config where c_type='" +s+"'");
        
        if(cn1.rs.next())
//                
        {
            
          //  t2.setText(String.valueOf(cn1.rs.getInt("item_id")));
//                
           jTextField3.setText(String.valueOf(cn1.rs.getInt("basicsalary")));
                jTextField4.setText(String.valueOf(cn1.rs.getDouble("ha")));
                  jTextField5.setText(String.valueOf(cn1.rs.getDouble("ta")));
                   jTextField6.setText(String.valueOf(cn1.rs.getDouble("pf")));
                    jTextField7.setText(String.valueOf(cn1.rs.getDouble("esic")));
//                                          jTextField6.setText(String.valueOf(cn1.rs.getDouble("da")));
//jTextField7.setText(String.valueOf(cn1.rs.getDouble("esic")));
//jTextField2.setText(cn1.rs.getString("designation"));
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
       
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        FinalConfig f=new FinalConfig();
        f.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
         jComboBox1.removeAllItems();
        fillrec();
    }//GEN-LAST:event_formWindowActivated

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        
         search();
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        search2();
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
         search2();
        
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       // double gross_salary=(jTextField3.getText())*(jTextField4.getText());
  //   String basic1=jTextField3.getText() ;
       int basic=Integer.parseInt(jTextField3.getText());
   double ha=Double.parseDouble(jTextField4.getText() )  ;
   double ta=Double.parseDouble(jTextField5.getText() )  ;
   double pf=Double.parseDouble(jTextField6.getText() )  ;
double esic=   Double.parseDouble(jTextField7.getText() )  ;
double ta1=(basic*ta);
   double ga=((basic)+(basic*ha)+(basic*pf)+(basic*ta)-ta1);
   jTextField10.setText(ga+"");
   //jTextField3.setText(String.valueOf(GlobalVariable.gpayment));
double deduction=  GlobalVariable.gpayment; 
double deduction2=basic- deduction;
double takehome=ga-deduction2;
jTextField8.setText(deduction2+"");
jTextField9.setText(takehome+"");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try
     {
         
                
           java.util.Date dateFromDateChooser1 = jDateChooser1.getDate();
           System.out.println("dateFromDateChooser1="+dateFromDateChooser1);
 //dateString = String.format("%1$td-%1$tm-%1$tY", dateFromDateChooser1); 
dateString = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser1); 
     System.out.println(dateString);                       
        s_id=jComboBox1.getSelectedItem().toString();
            
           stype=jTextField2.getText();
            date = dateString;
            basic=jTextField3.getText(); 
           ha=jTextField4.getText();
          ta=jTextField5.getText();
            pf=jTextField6.getText();
            esic=jTextField7.getText();
             gs = jTextField10.getText();
    deduction = jTextField8.getText();
   takehome = jTextField9.getText();
   
   //code for empID
    findid();
   String empIdstr=String.valueOf(globalempid);
                System.out.println("empIdstr="+empIdstr);
                
                    {
                String sql="Insert into staffpayment(sa_id,stype,date,basic,ha,ta,pf,esic,gross_salary,deduction,takehome) values (?,?,?,?,?,?,?,?,?,?,?)";
                
                    int e = db.insert_data(sql,
                                                                    new String[]{empIdstr, stype,date,basic,
                                                                     ha,ta,pf,esic,gs,deduction,takehome
                                                                    });
                    
                      JOptionPane.showMessageDialog(this, "record inserted");   
                   
                    }  
                    
     }catch(Exception e)
  {
       e.printStackTrace();
   }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Payment(100).setVisible(true);
                new Payment().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
