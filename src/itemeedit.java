/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.*;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import java.awt.Container;
public class itemeedit extends javax.swing.JDialog {

    /**
     * Creates new form itemeedit
     */
    
     String id;
    
    ArrayList id_array=new ArrayList(0);
    ArrayList<String> getrow1=new ArrayList<String>();
    int table_counter=0;  
    DB db=new DB();
    public itemeedit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         loadInTable();
    }

    itemeedit(Container parent, boolean b) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

//    itemeedit(Container parent, boolean b) {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
public void loadInTable(){
        //ConItem cn1=new ConItem();
    
        table_counter=0; //id_array
       
       //  String sql = "select  item_id, item_name,item_type,type,price,Quantity from item2 where type='veg'";
          //String sql = "select  Item_id, item_name,item_type,type,price,Quantity from item2 ";
            String sql = "select  Item_id, itemname,itemtype,ftype,price,quantity from newitem where status='Active' ";
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
                    id_array.add(cn1.rs.getObject("Item_id"));
                    data[0] = table_counter+"";
                    data[1] = cn1.rs.getObject("itemname");
                    data[2] =cn1. rs.getObject("itemtype");
                    data[3] = cn1.rs.getObject("ftype");
                  data[4] = cn1.rs.getObject("price");
                  data[5] = cn1.rs.getObject("quantity");
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
  String itemname,itemtype,ftype,price,qty;
  itemname=t1.getText();
  itemtype=t2.getText();
  ftype=t3.getText();
   price=t4.getText();
  qty=t5.getText();
 // dob=jTextField1.getText();
  //doj=jTextField2.getText();
  try
  {
  db.update_data("update newitem set itemname=?,itemtype=?,ftype=?,price=?,quantity=? where Item_id="+id+"",new String[]{itemname,itemtype,ftype,price,qty});
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
                                         int result = db.update_data("Update newitem set status = ? where Item_id = ?", 
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        item1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Item_name");

        jLabel3.setText("Item_type");

        jLabel4.setText("Type");

        jLabel5.setText("Price");

        jLabel6.setText("Quantity");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        item1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "Item_Name", "Item_Type", "Type", "Price ", "Quantity"
            }
        ));
        item1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(item1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(t5, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(t4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t3, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(12, 12, 12)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton1))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //  search();
        delete2();
        loadInTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        update();
        loadInTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
                cn1.rs=cn1.st.executeQuery("Select * from newitem  where Item_id="+id);
                if(cn1.rs.next())
                {
                    t1.setText(cn1.rs.getString("itemname"));
                    t2.setText((cn1.rs.getString("itemtype")));
                    t3.setText((cn1.rs.getString("ftype")));
                    t4.setText(String.valueOf(cn1.rs.getInt("price")));
                    t5.setText(String.valueOf(cn1.rs.getInt("quantity")));
                    //               jTextField1.setText(String.valueOf(cn1.rs.getDate("dob")));
                    //          jTextField2.setText(String.valueOf(cn1.rs.getDate("doj")));
                }

            }catch(Exception e)
            {
                e.printStackTrace();
            }

    }//GEN-LAST:event_item1MouseClicked

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
            java.util.logging.Logger.getLogger(itemeedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(itemeedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(itemeedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(itemeedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                itemeedit dialog = new itemeedit(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
