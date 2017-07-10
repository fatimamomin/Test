
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
public class customerEdit extends javax.swing.JDialog {

    /**
     * Creates new form customerEdit
     */
    
    String id;
    
    ArrayList id_array=new ArrayList(0);
    ArrayList<String> getrow1=new ArrayList<String>();
    int table_counter=0;  
    
    
      String name=null;
            String address=null;
            String city=null;
            String state=null;
            String phoneno=null;
              String email=null;
           // String esic=null;
            
    DB db=new DB ();
    ConItem cn1=new ConItem();
    public customerEdit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadInTable();
    }

    
     public void loadInTable(){
        //ConItem cn1=new ConItem();
    
        table_counter=1; //id_array
       
       //  String sql = "select  item_id, item_name,item_type,type,price,Quantity from item2 where type='veg'";
          //String sql = "select  Item_id, item_name,item_type,type,price,Quantity from item2 ";
           // String sql = "select  Item_id, itemname,itemtype,ftype,price,quantity from newitem where status='Active' ";
              String sql = "select  cid, cname,address,city,state,phoneno,email from customer where status='Active' ";
            try{
                 ConItem cn1=new ConItem();
               // Connection con = (Connection) Action.getDBConnection();
              cn1. st = cn1. con.createStatement();
                cn1. rs = cn1.st.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel) item1.getModel();
                model.setRowCount(0);
                Object data[] = new Object[7];
                while(cn1.rs.next())
                {
                    id_array.add(cn1.rs.getObject("cid"));
                    data[0] = table_counter+"";
                    data[1] = cn1.rs.getObject("cname");
                    
                    
                      data[2] = cn1.rs.getObject("address");
                    data[3] =cn1. rs.getObject("city");
                    data[4] = cn1.rs.getObject("state");
                       data[5] = cn1.rs.getObject("phoneno");
                  data[6] = cn1.rs.getObject("email");
                  //data[6] = cn1.rs.getObject("mobile_no");
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
     
     
     void update() {
  String cname,address,city,state,phoneno,email;
  
 // suppliername=jComboBox1.getSelectedItem().toString();
  cname=jTextField1.getText();
  address=jTextField2.getText();
  city=jTextField3.getText();
   state=jTextField4.getText();
   phoneno=jTextField5.getText();
   email=jTextField8.getText();
  //email=jTextField5.getText();
  //mno=jTextField6.getText();
 // dob=jTextField1.getText();
  //doj=jTextField2.getText();
  try
  {
  db.update_data("update customer set cname=?,address=?,city=?,state=?,phoneno=? ,email=? where cid="+id+"",new String[]{cname,address,city,state,phoneno,email});
  JOptionPane.showMessageDialog(this, "Updated successfully..");
  }//'"+s+"'
  catch(Exception e)
  {}
  //'"+name+"'
  
   /* String str="update expenses set description='"+txtexpname.getText()+"',amount='"+txtamount.getText()+"',date='"+jDateChooser.getDate()+"' where description='"+txtexpname.getText()+"'";
					//System.out.println(str);
					int u=st.executeUpdate(str);
					//int u=st.executeUpdate("update medicine set'"+inputText[3].getText()+"','"+inputText[4].getText()+"','"+inputText[5].getText()+"','"+inputText[6].getText()+"' where '"+inputText[1].getText()+"' and '"+ch.getSelectedItem()+"' and '"+inputText[7].getText()+"'");
					
					
					
                                        * 
					if(u>0)
					  {
					 JOptionPane.showMessageDialog(null,"Record is updated  succsefully","update expenses",JOptionPane.INFORMATION_MESSAGE);
					   
			dispose();		 }*/
			    	
    }
     
       void delete2()
       {Object[] options = {"Yes","No"};
                          
                                 int n = JOptionPane.showConfirmDialog(null, "Are you sure to want a delete","Delete Conform", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
           
        if(n==JOptionPane.YES_OPTION)
                                {                                    
                                         int result = db.update_data("Update customer set status = ? where cid = ?", 
                                                                          new String[]{"DEACTIVE",id});
                                         
                                         
                                           }
                         //                refreshTable();
                                
//                      if(n==JOptionPane.NO_OPTION)  
//                      {    
//                          this.dispose();
//                          
//                                
//                        }
        
        jTextField1.setText("");
         jTextField2.setText("");
          jTextField3.setText("");
           jTextField4.setText("");
            
         jTextField5.setText("");
         jTextField8.setText("");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        item1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CustomerDetail"));

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("City");

        jLabel4.setText("State");

        jLabel6.setText("Phone_No");

        jLabel7.setText("Email_id");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
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

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton2))
                    .addComponent(jButton5))
                .addGap(7, 7, 7)
                .addComponent(jButton6))
        );

        item1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "CustomerName", "Address", "City", "State", "Phone_no", "Email_Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        item1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(item1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        update();
         loadInTable();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
        {
            //f_type=r;

            name =jTextField1.getText();
            //sname = jTextField2.getText();

            //   sname =(jComboBox1.getSelectedItem()).toString();
            address=jTextField2.getText();
            city=jTextField3.getText();
            state=jTextField4.getText();
            phoneno=jTextField5.getText();
            email=jTextField8.getText();
            // mno=jTextField6.getText();
            //esic=jTextField8.getText();

            int flagValidation = 0;
            String validation = null;

            //            if(f_type.equals(""))
            //            {
                //                validation = "\nPlease Enter config type ";
                //                flagValidation = 1;
                //            }

            if(name.equals(""))
            {
                validation = validation + "\nPlease Enter  Customer name";
                flagValidation = 1;
            }

            if(address.equals(""))
            {
                validation = "\nPlease Enter Adderss ";
                flagValidation = 1;
            }
            if(city.equals(""))
            {
                validation = "\nPlease Enter City ";
                flagValidation = 1;
            }

            if(state.equals(""))
            {
                validation = "\nPlease Enter State ";
                flagValidation = 1;
            }
            if(phoneno.equals(""))
            {
                validation = "\nPlease Enter  Phone Number ";
                flagValidation = 1;
            }

            if(email.equals(""))
            {
                validation = "\nPlease Enter Email Address ";
                flagValidation = 1;
            }

            if(flagValidation == 1)

            {
                JOptionPane.showMessageDialog(null,validation,"Error",JOptionPane.ERROR_MESSAGE);
                return;
            }

            else
            {
                String sql="Insert into customer(cname,address,city,state,phoneno,email,status) values (?,?,?,?,?,?,?)";

                int e = db.insert_data(sql,
                    new String[]{name, address,city,
                        state, phoneno,email,"Active"
                    });
                    JOptionPane.showMessageDialog(this, "record inserted");

                }

            }catch(Exception e)
            {
                e.printStackTrace();
            }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void item1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item1MouseClicked
        // TODO add your handling code here:
        try
        {int sr=item1.getSelectedRow();
            // String id=getrow.add(sr).toString();

            //select * from item  where item_id=
            //  String id;
            //            id=id_array.get(sr).toString();
            //            ConItem cn1=new ConItem();
            //            cn1.st=cn1.con.createStatement();
            //            cn1.rs=cn1.st.executeQuery("Select * from config where c_id="+id);
            //
            //            if(cn1.rs.next())
            //            {
                //

                id=id_array.get(sr).toString();
                ConItem cn1=new ConItem();
                cn1.st=cn1.con.createStatement();
                //cn1.rs=cn1.st.executeQuery("Select * from staff where Staff_Id="+id);
                cn1.rs=cn1.st.executeQuery("Select * from customer  where cid="+id);
                if(cn1.rs.next())
                {  //jComboBox1.setSelectedItem((cn1.rs.getString("suppliername")));
                    jTextField1.setText(cn1.rs.getString("cname"));
                    jTextField2.setText((cn1.rs.getString("address")));
                    jTextField3.setText((cn1.rs.getString("city")));
                    jTextField4.setText((cn1.rs.getString("state")));
                     jTextField4.setText((cn1.rs.getString("state")));
                      jTextField5.setText((cn1.rs.getString("phoneno")));
                       jTextField8.setText((cn1.rs.getString("email")));
                    // jTextField5.setText((cn1.rs.getString("email_id")));
                    // jTextField6.setText(String.valueOf(cn1.rs.getInt("mobile_no")));
                    //               jTextField1.setText(String.valueOf(cn1.rs.getDate("dob")));
                    //          jTextField2.setText(String.valueOf(cn1.rs.getDate("doj")));
                }

            }catch(Exception e)
            {
                e.printStackTrace();
            }
    }//GEN-LAST:event_item1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        update();
        loadInTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        delete2();
         loadInTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
         jTextField1.setText("");
         jTextField2.setText("");
          jTextField3.setText("");
           jTextField4.setText("");
            
         jTextField5.setText("");
         jTextField8.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(customerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                customerEdit dialog = new customerEdit(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable item1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
