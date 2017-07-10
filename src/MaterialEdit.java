
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
public class MaterialEdit extends javax.swing.JDialog {

    /**
     * Creates new form MaterialEdit
     */
    
    String id;
    
    ArrayList id_array=new ArrayList(0);
    ArrayList<String> getrow1=new ArrayList<String>();
    int table_counter=0;  
    
    
     String mname=null;
            String sname=null;
            String qty=null;
            String price=null;
            String totalamount=null;
            
           // String esic=null;
            
    DB db=new DB ();
    ConItem cn1=new ConItem();
    public MaterialEdit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
            
            cn1.rs=cn1.st.executeQuery("select supplier_name from supplier where status='Active' ");
                        if(cn1.rs.next())
            {do
            {
                jComboBox1.addItem(cn1.rs.getString("supplier_name")+" ");
                
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
 
  public void loadInTable(){
        //ConItem cn1=new ConItem();
    
        table_counter=1; //id_array
       
       //  String sql = "select  item_id, item_name,item_type,type,price,Quantity from item2 where type='veg'";
          //String sql = "select  Item_id, item_name,item_type,type,price,Quantity from item2 ";
           // String sql = "select  Item_id, itemname,itemtype,ftype,price,quantity from newitem where status='Active' ";
              String sql = "select  Material_Id, suppliername,Name,quantity,price,Total_amount from material where status='Active' ";
            try{
                 ConItem cn1=new ConItem();
               // Connection con = (Connection) Action.getDBConnection();
              cn1. st = cn1. con.createStatement();
                cn1. rs = cn1.st.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel) item1.getModel();
                model.setRowCount(0);
                Object data[] = new Object[6];
                while(cn1.rs.next())
                {
                    id_array.add(cn1.rs.getObject("Material_Id"));
                    data[0] = table_counter+"";
                    data[1] = cn1.rs.getObject("suppliername");
                    data[2] =cn1. rs.getObject("Name");
                    data[3] = cn1.rs.getObject("quantity");
                       data[4] = cn1.rs.getObject("price");
                  data[5] = cn1.rs.getObject("Total_amount");
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
  String suppliername,mname,qty,price,totalamount;
  
  suppliername=jComboBox1.getSelectedItem().toString();
  mname=jTextField1.getText();
  qty=jTextField2.getText();
  price=jTextField3.getText();
   totalamount=jTextField4.getText();
  //email=jTextField5.getText();
  //mno=jTextField6.getText();
 // dob=jTextField1.getText();
  //doj=jTextField2.getText();
  try
  {
  db.update_data("update material set suppliername=?,Name=?,quantity=?,price=?,Total_amount=?  where Material_Id="+id+"",new String[]{suppliername,mname,qty,price,totalamount});
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
                                         int result = db.update_data("Update material set status = ? where Material_Id = ?", 
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
            
    //       jTextField5.setText("");
      //     jTextField6.setText("");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        item1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MaterialName");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(43, 45, 100, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("SupplierName");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(43, 83, 96, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(43, 121, 100, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 150, 33, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TotalAmount");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 190, 91, 17);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(160, 40, 170, 20);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(160, 120, 170, 20);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(160, 150, 170, 20);

        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(160, 180, 170, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(160, 80, 170, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 240, 61, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(130, 240, 59, 25);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(200, 240, 75, 25);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(300, 240, 73, 23);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(210, 270, 65, 25);

        item1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "MaterialName", "SupplierName", "Quantity", "Price", "TotalAmount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:

        String a1,a2;
        a1=jTextField2.getText();
        a2=jTextField3.getText();
        int a=Integer.parseInt(a1);
        double b=Double.parseDouble(a2);
        Double c= a*b;
        String s=String.valueOf(c);
        Double s1=Double.parseDouble(s);
        jTextField4.setText(String.valueOf(s1));
    }//GEN-LAST:event_jTextField4FocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            //f_type=r;

            mname =jTextField1.getText();
            //sname = jTextField2.getText();

            sname =(jComboBox1.getSelectedItem()).toString();
            qty=jTextField2.getText();
            price=jTextField3.getText();
            totalamount=jTextField4.getText();
            // mno=jTextField6.getText();
            //esic=jTextField8.getText();

            int flagValidation = 0;
            String validation = null;

            //            if(f_type.equals(""))
            //            {
                //                validation = "\nPlease Enter config type ";
                //                flagValidation = 1;
                //            }

            if(sname.equals(""))
            {
                validation = validation + "\nPlease Enter  Supplier name";
                flagValidation = 1;
            }

            if(mname.equals(""))
            {
                validation = "\nPlease Enter Material Name ";
                flagValidation = 1;
            }
            if(qty.equals(""))
            {
                validation = "\nPlease Enter Quantity ";
                flagValidation = 1;
            }

            if(price.equals(""))
            {
                validation = "\nPlease Enter Price ";
                flagValidation = 1;
            }
            if(totalamount.equals(""))
            {
                validation = "\nPlease Enter  Total Amount ";
                flagValidation = 1;
            }

            //            if(mno.equals(""))
            //            {
                //                validation = "\nPlease Enter esic ";
                //                flagValidation = 1;
                //          }

            if(flagValidation == 1)

            {
                JOptionPane.showMessageDialog(null,validation,"Error",JOptionPane.ERROR_MESSAGE);
                return;
            }

            else
            {
                String sql="Insert into material(suppliername,Name,quantity,price,Total_amount,status) values (?,?,?,?,?,?)";

                int e = db.insert_data(sql,
                    new String[]{sname, mname,qty,
                        price, totalamount,"Active"
                    });
                    JOptionPane.showMessageDialog(this, "record inserted");

                }

            }catch(Exception e)
            {
                e.printStackTrace();
            }
loadInTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
                cn1.rs=cn1.st.executeQuery("Select * from material  where Material_Id="+id);
                if(cn1.rs.next())
                {  jComboBox1.setSelectedItem((cn1.rs.getString("suppliername")));
                    jTextField1.setText(cn1.rs.getString("Name"));
                    jTextField2.setText((cn1.rs.getString("quantity")));
                    jTextField3.setText((cn1.rs.getString("price")));
                    jTextField4.setText((cn1.rs.getString("Total_amount")));
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
         jTextField2.setText("");
          jTextField3.setText("");
           jTextField4.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(MaterialEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaterialEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaterialEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaterialEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MaterialEdit dialog = new MaterialEdit(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
