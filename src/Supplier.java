
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import javax.swing.UIManager;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import javax.swing.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */
public class Supplier extends javax.swing.JFrame {

    /**
     * Creates new form Supplier
     */
    String sname=null;
            String address=null;
            String city=null;
            String state=null;
            String email=null;
            String mno=null;
           // String esic=null;
            
    DB db=new DB ();
    ConItem cn1=new ConItem();
    
    public Supplier() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 260, 51, 23);

        jButton3.setText("Delete");
        jPanel1.add(jButton3);
        jButton3.setBounds(280, 260, 63, 23);

        jButton4.setText("Close");
        jPanel1.add(jButton4);
        jButton4.setBounds(350, 260, 59, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
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
//7
                
                System.out.println("sname="+sname);
                System.out.println("email="+email);
                System.out.println("mno="+mno);
                System.out.println("state="+state);
             System.out.println("city="+city);
              System.out.println("address="+address);
                
                
              mno=mno.trim();
                System.out.println("mno="+mno);
              
                
                if(mno!=null && (mno.length()!=10))
                {
                    System.out.println("mombile length is not valid .lengh="+mno.length());
                    
                    System.out.println("show error message");
                       JOptionPane.showMessageDialog(this, "Mobile no is not valid .Please enter 10 digit");   
                   
                    
                    
                    return;
                    
                    
                }
              
              
              
                
                try{
                
                int e = db.insert_data(sql,
                    new String[]{sname, address,city,
                   state, email,mno,"Active"
                    });
  JOptionPane.showMessageDialog(this, "record inserted");
  
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
  
  
                }

            }catch(Exception e)
            {
                e.printStackTrace();
            }

                 
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 try
                  {
                     UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
                  }
                         catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                new Supplier().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}