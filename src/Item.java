/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */
//import Other.DB;
import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import  javax.swing.table.TableRowSorter;


import java.util.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.commons.io.FileUtils;

import javax.swing.UIManager;
import javax.swing.*;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
public class Item extends javax.swing.JFrame {

    /**
     * Creates new form Item
     */
    
     FileInputStream fin;
    File file ;
    String r;
    
    String f_type=null;
            String itemname=null;
            String itemtype=null;
            String price=null;
            String qty=null;
            String des=null;
           // String esic=null;
            
    DB db=new DB ();
    ConItem cn1=new ConItem();
    public Item() {
        initComponents();
    }
 void fillrec()
    {
        try
        {
            cn1=new ConItem();
            cn1.st=cn1.con.createStatement();
            String itemname=t2.getText(); 
            
            cn1.rs=cn1.st.executeQuery("select * from newitem where itemtype='"+itemname +"' and ftype='"+r+"' and status='Active'");
                        if(cn1.rs.next())
            {do
            {
                cb1.addItem(cn1.rs.getString("itemname")+" ");
                
                            }while(cn1.rs.next());
            }
            else
            {
                System.out.println("no record is added");
                 
                
                
            }
        }catch(Exception e)
        { System.out.println("exception has occured");
            System.out.println(e);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        t4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setText("Type");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(140, 50, 40, 20);

        r1.setText("Veg");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel2.add(r1);
        r1.setBounds(230, 50, 80, 23);

        r2.setText("NonVeg");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        jPanel2.add(r2);
        r2.setBounds(320, 50, 90, 23);

        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t2KeyReleased(evt);
            }
        });
        jPanel2.add(t2);
        t2.setBounds(230, 80, 100, 20);

        jLabel3.setText("Item_Name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(140, 80, 70, 20);

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        jPanel2.add(cb1);
        cb1.setBounds(230, 110, 120, 20);

        jLabel4.setText("Item_Type");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(140, 115, 80, 20);

        jLabel5.setText("New Item_Type");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(360, 170, 90, 14);

        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t3KeyReleased(evt);
            }
        });
        jPanel2.add(t3);
        t3.setBounds(460, 170, 112, 20);

        jButton1.setText("AddItemType");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(460, 210, 120, 23);
        jPanel2.add(t4);
        t4.setBounds(230, 140, 90, 20);

        jLabel6.setText("Price");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(410, 800, 23, 14);

        jLabel7.setText("Quantity");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(140, 170, 70, 14);
        jPanel2.add(t5);
        t5.setBounds(230, 170, 90, 20);
        jPanel2.add(t6);
        t6.setBounds(230, 210, 146, 20);

        jLabel8.setText("Description");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(140, 210, 80, 20);

        jLabel9.setText("image");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(140, 250, 60, 14);

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(170, 470, 80, 23);

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(260, 470, 90, 23);

        jLabel13.setText("Price");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(140, 140, 50, 20);

        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(350, 470, 90, 23);

        jTextField1.setText(" ");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(230, 250, 170, 20);

        jButton5.setText(" Browser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(420, 250, 110, 23);

        jLabel12.setText("ImageApplay");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12);
        jLabel12.setBounds(140, 280, 80, 30);
        jPanel2.add(jLabel14);
        jLabel14.setBounds(230, 280, 430, 180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
        System.out.println("ranuz action performed");
        r=evt.getActionCommand();
        System.out.println("event="+r);
        System.out.println("r=r1ActionPerformed="+r);
        //  if(r2.s)
        //  sys

        r2.setSelected(false);

    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed

        // TODO add your handling code here:
        r=evt.getActionCommand();
        System.out.println("r2non r2ActionPerformed veg="+r);
        r1.setSelected(false);

    }//GEN-LAST:event_r2ActionPerformed

    private void t2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyReleased
        // TODO add your handling code here:
        /*
        String ch=t2.getText();
        cb2.removeAllItems();
        cb1.removeAllItems();
        if(ch.equalsIgnoreCase("roti"))
        {
            cb2.addItem("Butter Roti");
            cb2.addItem("roti");
        }
        if(ch.equalsIgnoreCase("roll"))
        {
            cb1.addItem("veg roll");
            cb1.addItem("Panner Roll");
        }*/

        int i = Validation.numvalid(t2.getText());
        if (i == 1) {
            t2.selectAll();
            t2.setText("");
        }        // TODO add your handling code here:

        cb1.removeAllItems();
       fillrec();

    }//GEN-LAST:event_t2KeyReleased

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void t3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyReleased
        // TODO add your handling code here:
        //String s= t3.getText();
        //cb1.addItem(s);
        int i = Validation.numvalid(t3.getText());
        if (i == 1) {
            t3.selectAll();
            t3.setText("");
            // TODO add your handling code here:
        }
    }//GEN-LAST:event_t3KeyReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String s= t3.getText();
        cb1.addItem(s);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //String add=  t3.getText();
        //cb1.addItem(add);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //add();
        
         try
        {
            f_type=r;

           itemtype =t2.getText();
            itemname = t3.getText();
            price=t4.getText();
            qty=t5.getText();
            des=t6.getText();
            //esic=jTextField8.getText();

            int flagValidation = 0;
            String validation = null;

//            if(f_type.equals(""))
//            {
//                validation = "\nPlease Enter config type ";
//                flagValidation = 1;
//            }

            if(itemtype.equals(""))
            {
                validation = validation + "\nPlease Enter  item name";
                flagValidation = 1;
            }

            if(itemname.equals(""))
            {
                validation = "\nPlease Enter Item Name ";
                flagValidation = 1;
            }
            if(price.equals(""))
            {
                validation = "\nPlease Enter Price ";
                flagValidation = 1;
            }

            if(qty.equals(""))
            {
                validation = "\nPlease Enter Quantity ";
                flagValidation = 1;
            }
            if(des.equals(""))
            {
                validation = "\nPlease Enter  Description ";
                flagValidation = 1;
            }

//            if(esic.equals(""))
//            {
//                validation = "\nPlease Enter esic ";
//                flagValidation = 1;
//            }

            if(flagValidation == 1)

            {
                JOptionPane.showMessageDialog(null,validation,"Error",JOptionPane.ERROR_MESSAGE);
                return;
            }

            else
            {
                String sql="Insert into newitem(ftype,itemtype,itemname,price,quantity,desription,status) values (?,?,?,?,?,?,?)";

                int e = db.insert_data(sql,
                    new String[]{f_type, itemtype,itemname,
                        price,qty,des,"Active"
                    });

                 
                    
                               // String target =".\\src\\EmployeePhoto\\";
                              //  String target =".\\src\\ItemImage\\";
                                  String target =".\\src\\itemimage2\\";
                                File targetFile = new File(target+e+".jpg");
                               
                                FileUtils.copyFile(file, targetFile);
                    
                    JOptionPane.showMessageDialog(this, "record inserted");

                }

            }catch(Exception e)
            {
                e.printStackTrace();
            }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
//        Edit e =new Edit();
//        e.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser= new JFileChooser();
             chooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
             
              int result = chooser.showOpenDialog(this);
              String fileName = null;
            
              if (result == JFileChooser.APPROVE_OPTION) 
              {
                      file = chooser.getSelectedFile();
                     fileName= file.getAbsolutePath();
                     
                     jTextField1.setText(fileName);

              }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
         ImageIcon myicon= new ImageIcon (jTextField1.getText());
        jLabel14.setIcon(myicon);
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
                new Item().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
