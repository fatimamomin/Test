/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */

//import Other.DB;
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



import org.apache.commons.io.FileUtils;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TestImage extends javax.swing.JFrame {
    String studname = null;
    FileInputStream fin;
    File file ;
     String selectedId = null;
JFrame frame = new JFrame();
   
    //ConItem cn = new ConItem();
DB db=new DB();
    JFrame parent;
    ResultSet rs;
    
    /**
     * Creates new form TestImage
     */
    public TestImage() {
        initComponents();
    }
////  public TestImage(JFrame parent, boolean modal) {
//        super(parent, modal);
//        initComponents();
//        this.parent=parent;
//        jButton3.setEnabled(false);
//    }
    
     public TestImage( String id) {
//        super(parent, modal);
       initComponents();
//        jButton2.setEnabled(false);
//        jButton3.setEnabled(true);
//    
//        this.parent=parent;
//        
        selectedId = id;
        
        try
        {
              rs = db.execute_query("Select * from stud where rno  = ?", new String[]{selectedId});
              rs.next();
              studname = rs.getString("sname");  
                 rs.close();
              
              jTextField2.setText(studname);
               jTextField1.setText(selectedId+".jpg");
        }
         catch(Exception e)
        {
               e.printStackTrace();
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

        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Insert Image");

        jButton2.setText("close");

        jLabel2.setText("ItemName");

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(135, 135, 135))
        );

        jButton4.setText("browse2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Image");

        jLabel4.setText("StudentName");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton6.setText("close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("ImageDisplay");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("readImage& display");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("jButton11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("delete");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("jButton13");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel4)
                .addGap(90, 90, 90)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel3)
                .addGap(125, 125, 125)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton4))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jButton11)
                        .addGap(28, 28, 28)
                        .addComponent(jButton8)))
                .addGap(28, 28, 28)
                .addComponent(jButton5)
                .addGap(29, 29, 29)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jButton9)
                        .addGap(10, 10, 10)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(264, 264, 264)))
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6)
                        .addComponent(jButton5)
                        .addComponent(jButton8)
                        .addComponent(jButton12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jButton10))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(63, 63, 63)
                        .addComponent(jButton9))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        File f = new File(".\\src\\ItemImage\\");
                                         File[] arrayFile = f.listFiles();

                                         int length = arrayFile.length;
                                         String iname=t1.getText();
                                    
                                          for(int i = 0 ; i<length ; i++)
                                          {

                                                    String name1 = arrayFile[i].getName();
                                                    String fileName = name1.substring(0,name1.length()-4);

                                                    if(fileName.equals(iname))
                                                    {
                                                                //arrayFile[i].delete();
                                                        arrayFile[i].canWrite();
                                                                break;
                                                    }
                                           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        studname = jTextField2.getText();
         
            int flagValidation = 0;
            String validation = null;
            
            if(studname.equals(""))
            {
                    validation = "\nPlease Enter student Name";
                    flagValidation = 1;
            }
 if(flagValidation == 1)
            {
                    JOptionPane.showMessageDialog(null,validation,"Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                    int studid = db.insert_data("Insert into stud(sname) values (?)", new String []{studname});   
                    try
                    {
                               // String target =".\\src\\EmployeePhoto\\";
                                String target =".\\src\\ItemImage\\";
                                File targetFile = new File(target+studid+".jpg");
                               
                                FileUtils.copyFile(file, targetFile);
                    }
                    catch(Exception e)
                    {
                            e.printStackTrace();
                    }
                    
                    JOptionPane.showMessageDialog(null, "Data Saved","Error",JOptionPane.ERROR_MESSAGE);
            }         
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
       // employeeName = jTextField.getText();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        studname = jTextField2.getText();
      
            int flagValidation = 0;
            String validation = null;
            
            
          
            if(studname.equals(""))
            {
                    validation = "\nPlease Enter Name";
                    flagValidation = 1;
            }
            
           
            
         
            
            if(flagValidation == 1)
            {
                    JOptionPane.showMessageDialog(null,validation,"Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                    int studid= db.update_data("Update  Stud set sname = ? where rno = ? ", 
                                                                    new String[]{studname,selectedId});
                    try
                    {
                                
                        String target =".\\src\\ItemImage\\";
                               // String target =".\\src\\EmployeePhoto\\";
                                String name = file.getName();
                                File targetFile = new File(target+name);
                                System.out.print("file Path "+target+name);
                                FileUtils.copyFile(file, targetFile);
                                
                                //File f = new File(".\\src\\EmployeePhoto\\");
                                File f= new File (".\\src\\ItemImage\\");
                                File[] arrayFile = f.listFiles();
                                                              
                                int length = arrayFile.length;
                                System.out.println("\n Array Length "+length);
                                
                                for(int i = 0 ; i<length ; i++)
                                {
                                    
                                        String name1 = arrayFile[i].getName();
                                        String fileName = name1.substring(0,name1.length()-4);
                                        
                                        if(fileName.equals(selectedId))
                                        {
                                                    arrayFile[i].delete();
                                                    targetFile.renameTo(arrayFile[i]);
                                                    break;
                                        }
                                }
                            
                    }
                    catch(Exception e)
                    {
                            e.printStackTrace();
                    }
                    
                    JOptionPane.showMessageDialog(null, "Data Updated Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            }
                                            

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        ImageIcon myicon= new ImageIcon (jTextField1.getText());
        jLabel5.setIcon(myicon);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        ImageIcon myicon= new ImageIcon (jTextField1.getText());
        jLabel5.setIcon(myicon);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        BufferedImage image=null;
        try
        {
            image =ImageIO.read(new File(".\\src\\ItemImage\\images.19.jpg"));
            
        }catch(Exception e)
        {
            e.printStackTrace();
            
        }
        
        ImageIcon imgicon=new ImageIcon (image);
        jLabel6.setIcon(imgicon);
       
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        
        
         studname = jTextField2.getText();
      
            int flagValidation = 0;
            String validation = null;
            
            
          
            if(studname.equals(""))
            {
                    validation = "\nPlease Enter Name";
                    flagValidation = 1;
            }
            
           
            
         
            
            if(flagValidation == 1)
            {
                    JOptionPane.showMessageDialog(null,validation,"Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                    int studid= db.update_data("Update  Stud set sname = ? where rno = ? ", 
                                                                    new String[]{studname,selectedId});
                    try
                    {
                                
                        String target =".\\src\\ItemImage\\";
                               // String target =".\\src\\EmployeePhoto\\";
                                String name = file.getName();
                                File targetFile = new File(target+name);
                                System.out.print("file Path "+target+name);
                                FileUtils.copyFile(file, targetFile);
                                
                                //File f = new File(".\\src\\EmployeePhoto\\");
                                File f= new File (".\\src\\ItemImage\\");
                                File[] arrayFile = f.listFiles();
                                                              
                                int length = arrayFile.length;
                                System.out.println("Array Length "+length);
                                
                                for(int i = 0 ; i<length ; i++)
                                {
                                    
                                        String name1 = arrayFile[i].getName();
                                        String fileName = name1.substring(0,name1.length()-4);
                                        
                                        if(fileName.equals(selectedId))
                                        {
                                                    arrayFile[i].delete();
                                                    targetFile.renameTo(arrayFile[i]);
                                                    break;
                                        }
                                }
                            
                    }
                    catch(Exception e)
                    {
                            e.printStackTrace();
                    }
                    
                    JOptionPane.showMessageDialog(null, "Data Updated Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            }
                                            
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        // TODO add your handling code here:
        try
        {
            ConItem cn1=new ConItem();
            String s=jTextField2.getText();
            cn1.st=cn1.con.createStatement();
            cn1.stmt=cn1.con.prepareStatement("delete from stud where sname=?");
            cn1.stmt.setString(1, s);
            int i=cn1.stmt.executeUpdate();
            
            File f= new File(".\\src\\ItemImage\\");
            File [] arrayFile=f.listFiles();
            int length=arrayFile.length;
            for(int j=0;j<length ;j++)
            {
                String name1=arrayFile[i].getName();
                String FileName=name1.substring(0, name1.length()-4);
                if(FileName.equals(selectedId )){
                    arrayFile[i].delete();
                    break;
                    
                }
            }
            if(i==-1)
            {
                System.out.println("not deleted");
            }
            else
            {
                System.out.println("deleted");
                
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(TestImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestImage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
