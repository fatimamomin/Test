/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */

import java.awt.Container;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.poi.poifs.property.Parent;
public class staffnew extends javax.swing.JInternalFrame {

    /**
     * Creates new form staffnew
     */
    
     ConItem cn1;
    String name=null;
            String address=null;
            String phone_1=null;
            String phone_2=null;
            String designation=null;
            String dob=null;
            String doj=null;
            String username=null;
            String password =null;
    DB db=new DB ();
    private Frame Parent;
    public staffnew() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        st2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        st3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        st4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        st5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        st6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField4 = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        st2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        st2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                st2KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Address");

        st3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        st3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                st3KeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Phone1");

        st4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        st4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                st4KeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Phone2");

        st5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        st5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st5ActionPerformed(evt);
            }
        });
        st5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                st5KeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Designation");

        st6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        st6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                st6KeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Date_of_Birth");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Date_of_joining");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Actions-document-save-icon.png")); // NOI18N
        jButton1.setText("Save/Add");
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
        jButton3.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Misc-Delete-Database-icon.png")); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Button-Close-icon.png")); // NOI18N
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Actions-edit-clear-icon.png")); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField1MouseEntered(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LoginDetail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("UserName");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Password");

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(st3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(st4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(st2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(st6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(st5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField4))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(st2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(st3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(st4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(st5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(st6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void st5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // add();
        try
        {

            //            java.util.Date dateFromDateChooser1 = dt1.getDate();
            //            System.out.println("dateFromDateChooser1="+dateFromDateChooser1);
            //            //dateString = String.format("%1$td-%1$tm-%1$tY", dateFromDateChooser1);
            //            dateString = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser1);
            //
            //            java.util.Date dateFromDateChooser = dt2.getDate();
            //            System.out.println("dateFromDateChooser1="+dateFromDateChooser1);
            //            //dateString = String.format("%1$td-%1$tm-%1$tY", dateFromDateChooser1);
            //            dateString2 = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser);

            name = st2.getText();
            address  =st3.getText() ;
            phone_1 = st4.getText();
            phone_2=st5.getText();
            designation= st6.getText();
            dob =jTextField1.getText();
            doj = jTextField4.getText();
            // String pf = null;
            username=jTextField2.getText();
            //password=jTextField3.getText();
            password=jPasswordField1.getText();
            int flagValidation = 0;
            String validation = null;

                        if(name.equals(""))
                        {
                                validation = "\nPlease Enter valid name ";
                                flagValidation = 1;
                            }
            
                        if(address.equals(""))
                        {
                                validation = validation + "\nPlease Enter  valid Adderss";
                                flagValidation = 1;
                            }
                        
                        if(phone_1.equals(""))
                        {
                                validation = validation + "\nPlease Enter  valid Phone_1";
                                flagValidation = 1;
                            }
                          if(phone_2.equals(""))
                        {
                                validation = validation + "\nPlease Enter  valid Phone_2";
                                flagValidation = 1;
                            }

                           if( designation.equals(""))
                        {
                                validation = validation + "\nPlease Enter  designation";
                                flagValidation = 1;
                            }
                            if( dob.equals(""))
                        {
                                validation = validation + "\nPlease select date";
                                flagValidation = 1;
                            }
                           
                             if( doj.equals(""))
                        {
                                validation = validation + "\nPlease Enter  select date of joining";
                                flagValidation = 1;
                            }
                              if( username.equals(""))
                        {
                                validation = validation + "\nPlease Enter  valid username";
                                flagValidation = 1;
                            }
                                  if( password.equals(""))
                        {
                                validation = validation + "\nPlease Enter  valid username";
                                flagValidation = 1;
                            }
                              
            if(flagValidation == 1)

            {
                JOptionPane.showMessageDialog(null,validation,"Error",JOptionPane.ERROR_MESSAGE);
                return;
            }

            else
            {
                String sql="Insert into Staff(name,address,phone_1,phone_2,designation,dob,doj,status) values (?,?,?,?,?,?,?,?)";

                int e = db.insert_data(sql,
                    new String[]{name, address,phone_1,
                        phone_2,designation,dob,doj,"Active"
                    });

                    //                String sql2="Insert into login(username,password,level) values (?,?,?)";
                    //
                    //                int e1 = db.insert_data(sql2,
                        //                    new String[]{username, password,"Staff"

                            //                    });

                    String staff="Staff";
                    cn1= new ConItem();
                    cn1.stmt=cn1.con.prepareStatement("insert into login values (?,?,?)");
                    cn1.stmt.setString(1, (jTextField2.getText()));
                    // cn1.stmt.setString(2, jTextField3.getText());
                    cn1.stmt.setString(2, jPasswordField1.getText());
                    cn1.stmt.setString(3, staff);
                    //                cn1.stmt.setString(4, (t3.getText()));
                    //                  cn1.stmt.setInt(5, Integer.parseInt(t4.getText()));
                    //                  cn1.stmt.setInt(6,Integer.parseInt (t5.getText()));
                    //                     cn1.stmt.setString(7,(t6.getText()));
                    //                       cn1.stmt.setInt(8,Integer.parseInt(t7.getText()));
                    //                       cn1.stmt.setInt(9,Integer.parseInt(t8.getText()));
                    int i=cn1.stmt.executeUpdate();
                    if(i==-1)
                    {
                        JOptionPane.showMessageDialog(this, "record not inserted");
                    }
                    //               else
                    //               {
                        //                 JOptionPane.showMessageDialog(this, "record inserted in login");
                        //
                        //               }

                    JOptionPane.showMessageDialog(this, "Record Inserted");

                }
                GlobalVariable.username=jTextField2.getText();
                //  GlobalVariable.password=jTextField3.getText();
                GlobalVariable.password=jPasswordField1.getText();
                userdialog d;
                d = new userdialog(Parent,true);
                d.setVisible(true);

            }  catch(Exception e)
            {
                e.printStackTrace();
            }
            //   JOptionPane.showMessageDialog(this, "record inserted");

            //              JOptionPane.showMessageDialog(null, "Data Saved","Error",JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //update();
//        staffeditdialog d=  staffeditdialog(parent,true);
//        d.setVisible(true);
        
         staffeditdialog  d;
        d = new staffeditdialog(Parent,true);
      d.setVisible(true);  
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        st2.setText("");
        st3.setText("");
        st4.setText("");
        st5.setText("");
        st6.setText("");
        //st2.setText("");
        //     dt1.cleanup();
        //    dt2.cleanup();
        //   dt1.setDateFormatString("");
        //  dt2.setDateFormatString("");
        
        jTextField1.setText("");
         jTextField4.setText("");
        
         jTextField2.setText("");
         jPasswordField1.setText("");
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        String date = new DatePicker(new JFrame()).setPickedDate();
        jTextField1.setText(date);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseEntered

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code here:

        String date = new DatePicker(new JFrame()).setPickedDate();
        jTextField4.setText(date);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //delete();
          staffeditdialog  d;
        d = new staffeditdialog(Parent,true);
      d.setVisible(true);  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void st2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_st2KeyReleased
        // TODO add your handling code here:
         int i = Validation.numvalid(st2.getText());
        if (i == 1) {
            st2.selectAll();
            st2.setText("");
        }    
    }//GEN-LAST:event_st2KeyReleased

    private void st3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_st3KeyReleased
        // TODO add your handling code here:
           int i = Validation.numvalid(st3.getText());
        if (i == 1) {
          st3.selectAll();
            st3.setText("");
        }    
    }//GEN-LAST:event_st3KeyReleased

    private void st4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_st4KeyReleased
        // TODO add your handling code here:
         int i = Validation.charvalid(st4.getText());
        if (i == 1) {
            st4.selectAll();
            st4.setText("");
        }  
        
        String l=st4.getText();
        if(l.length()> 11)
        {
            System.out.println("not allowed");
            JOptionPane.showMessageDialog(this, "length not greater than 10");
            st4.selectAll();
            st4.setText("");
        }
        
//          if(l.length()< 10)
//        {
//            System.out.println(" minimum not allowed");
//            JOptionPane.showMessageDialog(this, "please enter proper mobile no");
//            st4.selectAll();
//            st4.setText("");
//        }
//         if(s.length()>10)
//        {
//            JOptionPane.showMessageDialog(this, "not allowed");
//            jTextField1.selectAll();
//            jTextField1.setText("");
//            
//                   
//        }
    }//GEN-LAST:event_st4KeyReleased

    private void st5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_st5KeyReleased
        // TODO add your handling code here:
        int i = Validation.charvalid(st5.getText());
        if (i == 1) {
            st5.selectAll();
            st5.setText("");
        }    
        
          String l=st5.getText();
        if(l.length()> 11)
        {
            System.out.println("not allowed");
            JOptionPane.showMessageDialog(this, "length not greater than 10");
            st5.selectAll();
            st5.setText("");
        }
//         if(l.length()< 10)
//        {
//            System.out.println(" minimum not allowed");
//            JOptionPane.showMessageDialog(this, "Please Enter Proper Mobile_No");
//            st5.selectAll();
//            st5.setText("");
//        }
    }//GEN-LAST:event_st5KeyReleased

    private void st6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_st6KeyReleased
        // TODO add your handling code here:
          int i = Validation.numvalid(st6.getText());
        if (i == 1) {
          st6.selectAll();
            st6.setText("");
    }//GEN-LAST:event_st6KeyReleased
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField st2;
    private javax.swing.JTextField st3;
    private javax.swing.JTextField st4;
    private javax.swing.JTextField st5;
    private javax.swing.JTextField st6;
    // End of variables declaration//GEN-END:variables

    private staffeditdialog staffeditdialog(Container parent, boolean b) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}