
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */
public class editsupplier extends javax.swing.JDialog {

    /**
     * Creates new form editsupplier
     */
    String id;
    
    ArrayList id_array=new ArrayList(0);
    ArrayList<String> getrow1=new ArrayList<String>();
    int table_counter=0;  
    DB db=new DB();
    
     String sname=null;
            String address=null;
            String city=null;
            String state=null;
            String email=null;
            String mno=null;
           // String esic=null;
            
   // DB db=new DB ();
    ConItem cn1=new ConItem();
    
    public editsupplier(java.awt.Frame parent, boolean modal) {
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
              String sql = "select  supplier_id, supplier_name,address,city,state,email_id,mobile_no from supplier where status='Active' ";
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
                    id_array.add(cn1.rs.getObject("supplier_id"));
                    data[0] = table_counter+"";
                    data[1] = cn1.rs.getObject("supplier_name");
                    data[2] =cn1. rs.getObject("address");
                    data[3] = cn1.rs.getObject("city");
                       data[4] = cn1.rs.getObject("state");
                  data[5] = cn1.rs.getObject("email_id");
                  data[6] = cn1.rs.getObject("mobile_no");
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
  String suppliername,address,city,state,email,mno;
  suppliername=jTextField1.getText();
  address=jTextField2.getText();
  city=jTextField3.getText();
   state=jTextField4.getText();
  email=jTextField5.getText();
  mno=jTextField6.getText();
 // dob=jTextField1.getText();
  //doj=jTextField2.getText();
  try
  {
  db.update_data("update supplier set supplier_name=?,address=?,city=?,state=?,email_id=? ,mobile_no=? where supplier_id="+id+"",new String[]{suppliername,address,city,state,email,mno});
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
                                         int result = db.update_data("Update supplier set status = ? where supplier_id = ?", 
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
           jTextField6.setText("");
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
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
        jLabel1.setText("Supplier Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(42, 33, 120, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Adress");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(42, 71, 90, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("City");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(42, 109, 70, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("State");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(42, 147, 80, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email_Id");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(42, 185, 80, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mobile_No");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(42, 228, 100, 17);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 30, 193, 23);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(190, 60, 193, 23);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(190, 100, 193, 23);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(190, 140, 193, 23);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(190, 180, 193, 23);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField6);
        jTextField6.setBounds(190, 220, 193, 23);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 260, 51, 23);

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 260, 51, 23);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(280, 260, 63, 23);

        jButton4.setText("Close");
        jPanel1.add(jButton4);
        jButton4.setBounds(350, 260, 59, 23);

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(250, 300, 57, 23);

        item1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "Supplier_Name", "Address", "City", "State", "Email_id", "Mobile_No"
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try
        {
            //f_type=r;

            sname =jTextField1.getText();
            address = jTextField2.getText();
            city=jTextField3.getText();
            state=jTextField4.getText();
            email=jTextField5.getText();
            mno=jTextField6.getText();
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
                validation = validation + "\nPlease Enter  item name";
                flagValidation = 1;
            }

            if(address.equals(""))
            {
                validation = "\nPlease Enter Item Name ";
                flagValidation = 1;
            }
            if(city.equals(""))
            {
                validation = "\nPlease Enter Price ";
                flagValidation = 1;
            }

            if(state.equals(""))
            {
                validation = "\nPlease Enter Quantity ";
                flagValidation = 1;
            }
            if(email.equals(""))
            {
                validation = "\nPlease Enter  Description ";
                flagValidation = 1;
            }

            if(mno.equals(""))
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
                String sql="Insert into supplier(supplier_name,address,city,state,email_id,mobile_no,status) values (?,?,?,?,?,?,?)";

                int e = db.insert_data(sql,
                    new String[]{sname, address,city,
                        state, email,mno,"Active"
                    });
                    JOptionPane.showMessageDialog(this, "record inserted");

                }

            }catch(Exception e)
            {
                e.printStackTrace();
            }

    }//GEN-LAST:event_jButton1ActionPerformed

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
                cn1.rs=cn1.st.executeQuery("Select * from supplier  where supplier_id="+id);
                if(cn1.rs.next())
                {
                    jTextField1.setText(cn1.rs.getString("supplier_name"));
                    jTextField2.setText((cn1.rs.getString("address")));
                    jTextField3.setText((cn1.rs.getString("city")));
                     jTextField4.setText((cn1.rs.getString("state")));
                    jTextField5.setText((cn1.rs.getString("email_id")));
                    jTextField6.setText(String.valueOf(cn1.rs.getInt("mobile_no")));
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
            
           jTextField5.setText("");
           jTextField6.setText("");
             
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
            java.util.logging.Logger.getLogger(editsupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editsupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editsupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editsupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try
                  {
                     UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
                  }
                         catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                editsupplier dialog = new editsupplier(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
