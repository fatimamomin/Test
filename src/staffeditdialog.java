/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.exolab.castor.types.Date;
public class staffeditdialog extends javax.swing.JDialog {

    /**
     * Creates new form staffeditdialog
     */
    
    
      String id;
      TableRowSorter<TableModel> sorter;
     ArrayList id_array=new ArrayList(0);
    ArrayList<String> getrow1=new ArrayList<String>();
    int table_counter=0;    
    TableModel model;
    String searchtext;
    DefaultTableModel dataModel;
     DB db=new DB ();
    public staffeditdialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
          loadInTable();
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        config2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Name");

        jLabel3.setText("Address");

        jLabel4.setText("Phone1");

        jLabel5.setText("Phone2");

        st5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Designation");

        jLabel9.setText("Date_of_Birth");

        jLabel10.setText("Date_of_joining");

        jButton2.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Pencil-icon.png")); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Misc-Delete-Database-icon.png")); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Button-Close-icon.png")); // NOI18N
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Actions-edit-clear-icon.png")); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
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
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(st3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton5)
                            .addGap(18, 18, 18)
                            .addComponent(jButton6))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3))))
                .addContainerGap(47, Short.MAX_VALUE))
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
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        config2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SerialNo", "Name", "Address", "phone1", "phone2", "designation", "date_of_Birth", "date_of_joining"
            }
        ));
        config2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                config2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(config2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   void update() {
  String name,add,ph1,ph2,desi,dob,doj;
  name=st2.getText();
  add=st3.getText();
  ph1=st4.getText();
   ph2=st5.getText();
  desi=st6.getText();
  dob=jTextField1.getText();
  doj=jTextField2.getText();
  try
  {
  db.update_data("update Staff set name=?,address=?,phone_1=?,phone_2=?,designation=?,dob=?,doj=? where Staff_Id="+id+"",new String[]{name,add,ph1,ph2,desi, dob, doj});
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
   
    void delete()
    {  try
    {
         ConItem cn1=new ConItem();
         //int ino=Integer.parseInt(st1.getText());
         String s=st2.getText();
         cn1.st=cn1.con.createStatement();
        cn1.stmt=cn1.con.prepareStatement("delete  from Staff where name=?");
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
    
      public void loadInTable(){
        //ConItem cn1=new ConItem();
        table_counter=1; //id_array
       
       //  String sql = "select  item_id, item_name,item_type,type,price,Quantity from item2 where type='veg'";
          String sql = "select Staff_Id,  name, address,phone_1,phone_2,designation,dob,doj from staff where STATUS='Active'";
            try{
                 ConItem cn1=new ConItem();
               // Connection con = (Connection) Action.getDBConnection();
              cn1. st = cn1. con.createStatement();
                cn1. rs = cn1.st.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel) config2.getModel();
                model.setRowCount(0);
                Object data[] = new Object[8];
                while(cn1.rs.next())
                {
                    id_array.add(cn1.rs.getObject("Staff_Id"));
                    data[0] = table_counter+"";
                    data[1] = cn1.rs.getObject("name");
                    data[2] =cn1. rs.getObject("address");
                    data[3] = cn1.rs.getObject("phone_1");
                  data[4] = cn1.rs.getObject("phone_2");
                  data[5] = cn1.rs.getObject("designation");
                  data[6] = cn1.rs.getObject("dob");
                  data[7] = cn1.rs.getObject("doj");
                  
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
     
       void delete2()
       {Object[] options = {"Yes","No"};
                          
                                 int n = JOptionPane.showConfirmDialog(null, "Are you sure to want a delete","Delete Conform", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
           
        if(n==JOptionPane.YES_OPTION)
                                {                                    
                                         int result = db.update_data("Update staff set status = ? where Staff_Id = ?", 
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
          
      
			
    private void st5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //update();
        update();
        loadInTable();
        //loadInTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       // delete();
        delete2();
        loadInTable();
    }//GEN-LAST:event_jButton3ActionPerformed

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
        jTextField1.setText("");
        jTextField2.setText("");

        //st2.setText("");
        // dt1.cleanup();
        //dt2.cleanup();
        //  dt1.setDateFormatString("");
        //dt2.setDateFormatString("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        String date = new DatePicker(new JFrame()).setPickedDate();
        jTextField1.setText(date);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // TODO add your handling code here:
        String date = new DatePicker(new JFrame()).setPickedDate();
        jTextField2.setText(date);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void config2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_config2MouseClicked
        // TODO add your handling code here:
        
          try
        {int sr=config2.getSelectedRow();
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
    cn1.rs=cn1.st.executeQuery("Select * from staff where Staff_Id="+id);
    
    if(cn1.rs.next())
    {
        st2.setText(cn1.rs.getString("name"));
           st3.setText(String.valueOf(cn1.rs.getString("address")));
             st4.setText(String.valueOf(cn1.rs.getInt("phone_1")));
              st5.setText(String.valueOf(cn1.rs.getInt("phone_2")));
                 st6.setText(String.valueOf(cn1.rs.getString("designation")));
               jTextField1.setText(String.valueOf(cn1.rs.getDate("dob")));
          jTextField2.setText(String.valueOf(cn1.rs.getDate("doj")));
    }
    
        
            

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_config2MouseClicked

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
            java.util.logging.Logger.getLogger(staffeditdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffeditdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffeditdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffeditdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                staffeditdialog dialog = new staffeditdialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable config;
    private javax.swing.JTable config1;
    private javax.swing.JTable config2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField st2;
    private javax.swing.JTextField st3;
    private javax.swing.JTextField st4;
    private javax.swing.JTextField st5;
    private javax.swing.JTextField st6;
    // End of variables declaration//GEN-END:variables
}
