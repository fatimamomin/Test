
//import Other.DB;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.io.FileUtils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */
public class Attendance extends javax.swing.JFrame {

    /**
     * Creates new form Attendance
     */
     int c;
      String s;
      int overtime;
       String overtime2;
       String workingType="";
       int payment;
       int overtime3;
    int   payovertime;
    int tot;
    String dateString ;
     String date1;
    
      String staff_id = null;
    String s_type  = null;
    String date = null;
    String w_type= null;
    String start_time = null;
    String end_time = null;
    String working_hours = null;
//    FileInputStream fin;
 //   File file ;
    String overtimedb = null;
    String leave = null;
    String reason = null;
    String paymentdb = null;
    //String employeeJoiningDate = null;
////    String employeeCompanyCode = GlobalValues.current_company;
////    String employeeCreatedIp = GlobalValues.current_ip;
////    String employeeModifiedIp = GlobalValues.current_ip;
    String selectedId = null;
    ResultSet rs;
    //for stafftable variable
    int table_counter=0;
    
    ArrayList id_array=new ArrayList(0);
            
//    int employeeCreatedStaffcode = GlobalValues.login_emp_id;
   // int employeeModifiedStaffcode = GlobalValues.login_emp_id;

    
  //  JFrame frame = new JFrame();
  ConItem cn1=new ConItem();
  
    DB db = new DB();
    public Attendance() {
        initComponents();
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
       jDateChooser2.setDateFormatString("yyyy-MM-dd");
          jDateChooser3.setDateFormatString("yyyy-MM-dd");
    }

    
     void fillrec()
    {
        try
        {
            cn1=new ConItem();
            cn1.st=cn1.con.createStatement();
           // String itemname=t2.getText(); 
            
            cn1.rs=cn1.st.executeQuery("select Staff_Id from staff ");
                        if(cn1.rs.next())
            {do
            {
                jComboBox3.addItem(cn1.rs.getString("Staff_Id")+" ");
                
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
        String s=String.valueOf(jComboBox3.getSelectedItem());
        cn1.rs=cn1.st.executeQuery("select * from staff where Staff_Id='" +s+"'");
        
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
jTextField13.setText(cn1.rs.getString("designation"));
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
       
    public void loadInTable(){
        //ConItem cn1=new ConItem();
        
             java.util.Date dateFromDateChooser1 = jDateChooser2.getDate();
           System.out.println("dateFromDateChooser1="+dateFromDateChooser1);
 //dateString = String.format("%1$td-%1$tm-%1$tY", dateFromDateChooser1); 
String dateString1 = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser1); 

             java.util.Date dateFromDateChooser2 = jDateChooser3.getDate();
           System.out.println("dateFromDateChooser1="+dateFromDateChooser1);
 //dateString = String.format("%1$td-%1$tm-%1$tY", dateFromDateChooser1); 
String dateString2 = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser2); 
        table_counter=1; //id_array
       String sid=jTextField1.getText();
//       String d1=jTextField7.getText();
//       String d2=jTextField8.getText();
       //  String sql = "select  item_id, item_name,item_type,type,price,Quantity from item2 where type='veg'";
          //String sql = "select  sa_id,date1, w_type,working_hours,overtime,payment from staffattendance ";
          // String sql = "select  sa_id,date1, w_type,working_hours,overtime,payment from staffattendance where staff_id='"+sid+"'And date1 between '"+d1+"' And '"+d2+"'  ORDER BY date1";
           String sql = "select  sa_id,date1, w_type,working_hours,overtime,payment from staffattendance where staff_id='"+sid+"'And date1 between '"+dateString1+"' And '"+dateString2+"'  ORDER BY date1";
            try{
                 ConItem cn1=new ConItem();
               // Connection con = (Connection) Action.getDBConnection();
              cn1. st = cn1. con.createStatement();
                cn1. rs = cn1.st.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel) stafftable.getModel();
                model.setRowCount(0);
                Object data[] = new Object[6];
                double total=0, payment;
                while(cn1.rs.next())
                {
                    id_array.add(cn1.rs.getObject("sa_id"));
                    data[0] = table_counter+"";
                    data[1] = cn1.rs.getObject("date1");
                    data[2] =cn1. rs.getObject("w_type");
                    data[3] = cn1.rs.getObject("working_hours");
                  data[4] = cn1.rs.getObject("overtime");
                  payment=cn1.rs.getDouble("payment");
                  data[5] = payment+"";
                    model.addRow(data);
                    total+=payment;
                    table_counter++;
                    
                }
                cn1.rs.close();
                cn1.st.close();
                 jTextField9.setText(total+"");
                 GlobalVariable.gpayment=total;
                 
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
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

        clockFrame1 = new org.rexi.jbinclock.gui.ClockFrame();
        clockFrame2 = new org.rexi.jbinclock.gui.ClockFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stafftable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setText("Staff_Id");

        jLabel2.setText("Date");

        jDateChooser1.setDateFormatString("d MMM,yyyy");

        jLabel3.setText("Desination");

        jLabel4.setText("Working Type");

        jButton1.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Button-Add-icon.png")); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Start_Time");

        jLabel6.setText("End_Time");

        jLabel7.setText("Working_hours");

        jLabel8.setText("OverTime");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel15.setText("Reason");

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(52, 52, 52)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap())
        );

        jLabel9.setText("Payment");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(47, 47, 47)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jButton2.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Button-Close-icon.png")); // NOI18N
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Selected");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField13FocusGained(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("F:\\ButtonImage\\Database-Active-icon.png")); // NOI18N
        jButton4.setText("Addindb");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Staff_Id");

        jLabel11.setText("Date");

        jLabel12.setText("To");

        stafftable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "SerialNo", "Date", "Working_Type", "Working_Hours", "Overtime", "Payment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(stafftable);

        jLabel13.setText("TotalPayment");

        jButton5.setText("AddinTable");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("showPayment");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11))
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(27, 27, 27))
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FullTime", "Leave", " " }));
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox2MouseEntered(evt);
            }
        });
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(675, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(("Leave".equals(workingType)))
        {
        
            performleaveoperation();
        
            
        }
        else{
        try
        {
            
           java.util.Date dateFromDateChooser1 = jDateChooser1.getDate();
           System.out.println("dateFromDateChooser1="+dateFromDateChooser1);
 //dateString = String.format("%1$td-%1$tm-%1$tY", dateFromDateChooser1); 
dateString = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser1); 
//dateString=dateFromDateChooser1;
DateFormat dff=DateFormat.getDateInstance();
String converdate=dff.format(dateFromDateChooser1);

//String timeconv=dateFromDateChooser1.getHours()

System.out.println("converdate="+converdate);

System.out.println("dateFromDateChooser1="+dateFromDateChooser1);

System.out.println("dateString="+dateString);
        
            date1=dateString;
            
            System.out.println("date1="+date1);
            String time1=(jTextField2.getText());
             System.out.println("time1="+time1);
            String date2=dateString ;
            
                 System.out.println("date2="+date2);
            
            String time2=jTextField3.getText();
                System.out.println("time2="+time2);
            
                

                long diffenceinTime=calculateDifference(time1, time2);
                System.out.println("diffenceinTime="+diffenceinTime);
           //shortcut sout+tab     
                
                if(diffenceinTime <0)
                {
                    
                    System.out.println("u have entered invalid date");
                                    JOptionPane.showMessageDialog(this, " Please enter valid time"); 
                                    jTextField3.setText("");
                                    return;

                    
                    
                }
                
                
                
            String format=("dd-mm-yyyy HH:mm:ss");
            SimpleDateFormat  sdf=new SimpleDateFormat(format);
            
            String spacedd=Integer.toString(32);
            System.out.println("spacedd="+spacedd);
            
            String inputdate1=date1+"\t"+time1;
            
              System.out.println("inputdate1="+inputdate1);
              String inputdate2=date2+"\t"+time2;
            System.out.println("inputdate2="+inputdate2);
            
            
              java.util.Date inputDateDb1=constructDate(date1, time1);
              System.out.println("inputDateDb="+inputDateDb1);    
                   java.util.Date inputdatedb2=constructDate(date2, time2);
                  System.out.println("inputDateDb="+inputdatedb2);
            
              
        //   Time t=new Time(WIDTH, WIDTH, WIDTH)
            
                  
       
            long diff=inputdatedb2.getTime()-inputDateDb1.getTime();
            double diffinhours=diff/((double)1000*60*60);
            
            System.out.println(diffinhours);
           System.out.println("Hours="+(int)diffinhours);
           System.out.println("Minutes="+(diffinhours-(int)diffinhours)*60);
           
       
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        
        jTextField4.setText(String.valueOf((int)diffinhours));
        
       
        String s=jTextField4.getText();
         overtime=Integer.parseInt(s);
        if( overtime >6)
        {
             c= overtime-6 ;
            System.out.println("overtime"+c);
            overtime2=String.valueOf(c);
            
            jTextField5.setText(overtime2);
           // jPanel5.setVisible(false);
               jLabel15.setEnabled(false);
               jTextField12.setEditable(false);
        }
           
           if(overtime==6)
           {
               jTextField5.setText("0");
               //jPanel5.setVisible(false);
               jLabel15.setEnabled(false);
               jTextField12.setEditable(false);
               
           }
           if(overtime<6)
           {
               jTextField5.setText("0");
               //jPanel5.setVisible(true);
               jLabel15.setEnabled(true);
               jTextField12.setEditable(true);
//              if( jTextField12.getText().equals(""))
//              {
//                  System.out.println("ramiz displaying pane");
//                  JOptionPane.showMessageDialog(this, "please enter  reason"); 
//             // jPanel5.setVisible(true);
//        
//              }
              
               System.out.println("displaying panel........line 623");
              
                           // jPanel5.setVisible(true);

           }
           
//////           String ch=String.valueOf(jComboBox1.getSelectedItem());
//////           System.out.println("ch"+ch);
             s=String.valueOf(jComboBox2.getSelectedItem());
             
             String c=jTextField13.getText();
        if(c.equalsIgnoreCase("Maneger")&& !(s.equals("Leave")))
        
        {
//            pa
//            String h=jTextField4.getText();
            
//            int c= 66*Integer.parseInt(h);
            
            System.out.println("overtime2="+overtime2);
            if(overtime2==null)
            {
                jTextField5.setText("0");
             payment=66*overtime;
             jTextField6.setText(String.valueOf(payment));
            
            }
            else
            {
            overtime3= Integer.parseInt(overtime2);
            
            System.out.println("overtime2="+overtime3);
            
            payment=66*overtime;
           // payovertime=66*overtime3;
           // tot=payment+payovertime;
              jTextField6.setText(String.valueOf(payment));
            
            System.out.println("Total Payment in days="+payment);
            }
            jTextField6.setText(String.valueOf(payment));
            
        }
        
        if(c.equalsIgnoreCase("cook")&& !(s.equals("Leave")))
        
        {
//            pa
//            String h=jTextField4.getText();
            
//            int c= 66*Integer.parseInt(h);
            
            System.out.println("overtime2="+overtime2);
            if(overtime2==null)
            {
                jTextField5.setText("0");
             payment=55*overtime;
           
            }
            else
            {
            overtime3= Integer.parseInt(overtime2);
            
            System.out.println("overtime2="+overtime3);
            
            payment=66*overtime;
           // payovertime=66*overtime3;
           // tot=payment+payovertime;
            System.out.println("Total Payment in days="+payment);
            }
            jTextField6.setText(String.valueOf(payment));
            
        }
if(c.equalsIgnoreCase("Weater")&& !(s.equals("Leave")))
        
        {
//            pa
//            String h=jTextField4.getText();
            
//            int c= 66*Integer.parseInt(h);
            
            System.out.println("overtime2="+overtime2);
            if(overtime2==null)
            {
                jTextField5.setText("0");
             payment=44*overtime;
           
            }
            else
            {
            overtime3= Integer.parseInt(overtime2);
            
            System.out.println("overtime2="+overtime3);
            
            payment=66*overtime;
           // payovertime=66*overtime3;
           // tot=payment+payovertime;
            System.out.println("Total Payment in days="+payment);
            }
            jTextField6.setText(String.valueOf(payment));
            
        }
if(c.equalsIgnoreCase("Helper")&& !(s.equals("Leave")))
        
        {
//            pa
//            String h=jTextField4.getText();
            
//            int c= 66*Integer.parseInt(h);
            
            System.out.println("overtime2="+overtime2);
            if(overtime2==null)
            {
                jTextField5.setText("0");
             payment=38*overtime;
           
            }
            else
            {
            overtime3= Integer.parseInt(overtime2);
            
            System.out.println("overtime2="+overtime3);
            
            payment=66*overtime;
           // payovertime=66*overtime3;
           // tot=payment+payovertime;
            System.out.println("Total Payment in days="+payment);
            }
            jTextField6.setText(String.valueOf(payment));
            
        }
        
//         if(c.equals("Maneger")&& !(s.equals("Leave")))
//        
//        {
////            pa
////            String h=jTextField4.getText();
//            
////            int c= 66*Integer.parseInt(h);
//            
//            System.out.println("overtime2="+overtime2);
//            if(overtime2==null)
//            {
//                jTextField5.setText("0");
//             payment=66*overtime;
//           
//            }
//            else
//            {
//            overtime3= Integer.parseInt(overtime2);
//            
//            System.out.println("overtime2="+overtime3);
//            
//            payment=66*overtime;
//           // payovertime=66*overtime3;
//           // tot=payment+payovertime;
//            System.out.println("Total Payment in days="+payment);
//            }
//            jTextField6.setText(String.valueOf(payment));
//            
//        }
        } catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
        
//        System.out.println("jComboBox2MouseClicked start");
//        String s=String.valueOf(jComboBox2.getSelectedItem());
//        workingType=s;
//        System.out.println("workintype="+workingType);
//        
//        if(s.equals("FullTime"))
//        {
//            jPanel2.setVisible(true);
//            jPanel3.setVisible(false);
//            jPanel4.setVisible(false);
//        }
//        if(s.equals("HalfTime"))
//        {
//            jPanel2.setVisible(false);
//            jPanel3.setVisible(true);
//            jPanel4.setVisible(false);
//        }
//        
//        if(s.equals("Leave"))
//        {
//            jPanel2.setVisible(false);
//            jPanel3.setVisible(false);
//            jPanel4.setVisible(true);
//             jTextField6.setText("0");
//        }
//        workingType=(String)jComboBox2.getSelectedItem();
//        System.out.println("workingtype="+workingType);
//        
    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//         String s=String.valueOf(jComboBox2.getSelectedItem());
//        if(s.equals("FullTime"))
//        {
//            jPanel2.setVisible(true);
//            jPanel3.setVisible(false);
//            jPanel4.setVisible(false);
//        }
//        if(s.equals("HalfTime"))
//        {
//            jPanel2.setVisible(false);
//            jPanel3.setVisible(true);
//            jPanel4.setVisible(false);
//        }
//        
//        if(s.equals("Leave"))
//        {
//            jPanel2.setVisible(false);
//            jPanel3.setVisible(false);
//            jPanel4.setVisible(true);
//            jTextField6.setText("0");
//        }
//        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseEntered
        // TODO add your handling code here:
//        String s=String.valueOf(jComboBox2.getSelectedItem());
//        workingType=s;
//        System.out.println("workintype="+workingType);
//        
//        if(s.equals("FullTime"))
//        {
//            jPanel2.setVisible(true);
//            jPanel3.setVisible(false);
//            jPanel4.setVisible(false);
//        }
//        if(s.equals("HalfTime"))
//        {
//            jPanel2.setVisible(false);
//            jPanel3.setVisible(true);
//            jPanel4.setVisible(false);
//        }
//        
//        if(s.equals("Leave"))
//        {
//            jPanel2.setVisible(false);
//            jPanel3.setVisible(false);
//            jPanel4.setVisible(true);
//             jTextField6.setText("0");
//        }
        
    }//GEN-LAST:event_jComboBox2MouseEntered

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
      
      Logger ramiz=Logger.getLogger(Attendance.class.getName());
      ramiz.info("ramiz info is changing");
   
      
        System.out.println("jComboBox2ItemStateChanged start");
        
        String valufffe=(String)jComboBox2.getSelectedItem();
        System.out.println("value"+valufffe);
        
         //  System.out.println("jComboBox2MouseClicked start");
      //  String s=String.valueOf(jComboBox2.getSelectedItem());
        //workingType=s;
        //System.out.println("workintype="+workingType);
        
        if( valufffe.equals("FullTime"))
        {
            jPanel2.setVisible(true);
           // jPanel3.setVisible(false);
            //jPanel4.setVisible(false);
             jTextField6.setText("");
             jLabel5.setEnabled(true);
             jLabel6.setEnabled(true);
              jLabel7.setEnabled(true);
               jLabel8.setEnabled(true);
               jTextField2.setEditable(true);
                 jTextField3.setEditable(true);
                  jTextField4.setEditable(true);
                   jTextField5.setEditable(true);
             
        }
//        if( valufffe.equals("HalfTime"))
//        {
//            jPanel2.setVisible(false);
//            jPanel3.setVisible(true);
//            jPanel4.setVisible(false);
//             jTextField6.setText("");
//            
//        }
        
        if( valufffe.equals("Leave"))
        {
          // jPanel2.setVisible(false);
//            jPanel3.setVisible(false);
//            jPanel4.setVisible(true);
            
            jLabel5.setEnabled(false);
             jLabel6.setEnabled(false);
              jLabel7.setEnabled(false);
               jLabel8.setEnabled(false);
               jTextField2.setEditable(false);
                 jTextField3.setEditable(false);
                  jTextField4.setEditable(false);
                   jTextField5.setEditable(false);
            jPanel5.setVisible(true);
             jTextField6.setText("0");
        }
        //workingType=(String)jComboBox2.getSelectedItem();
        System.out.println("workingtype="+ valufffe);
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged
//function for addindb button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
        { System.out.println("jButton4ActionPerformed");
      
              w_type=jComboBox2.getSelectedItem().toString();
            System.out.println("jButton4ActionPerformed wtype="+w_type);
        
            if(w_type.equals("Leave"))
            {
                performleaveoperation();
              //  jPanel5.setVisible(true);
                return;
                
                
            }
            
            
            
            
            staff_id =(jComboBox3.getSelectedItem()).toString();
            System.out.println("jButton4ActionPerformed staff_id="+staff_id);
            s_type=jTextField13.getText();
            
            date=date1;
            start_time = jTextField2.getText();
            end_time=jTextField3.getText();
            working_hours=jTextField4.getText();
            overtimedb=jTextField5.getText();
            reason=jTextField12.getText();
            paymentdb=jTextField6.getText();

            System.out.println("jButton4ActionPerformed paymentdb="+paymentdb);
            System.out.println("jButton4ActionPerformed working_hours="+working_hours);
           
             System.out.println("jButton4ActionPerformed reason="+reason);
           
             int workinghrsint=0;
             if(working_hours!=null)
             {
                    workinghrsint=Integer.valueOf(working_hours);
             
             }
             
             if(workinghrsint <6)
             {
                 
                  jPanel5.setVisible(true);
                 System.out.println("working hrs less than 6");
            
                 
                 
                 
                if(reason==null || reason.length()==0)
                    {
                 JOptionPane.showMessageDialog(this,"Please enter reason for working less than 6 hours"
                         + "");
                            return;
                 
                 
             }
             //jPanel5.setVisible(true);
             
             }
            
            int flagValidation = 0;
            String validation = null;
            
            
          
            if(start_time.equals(""))
            {
                    validation = "\nPlease Enter valid time ";
                    flagValidation = 1;
            }
            
            if(end_time.equals(""))
            {
                    validation = validation + "\nPlease Enter  valid time";
                    flagValidation = 1;
            }
            
           
            
          
           
          
            else if(!(w_type.equals("Leave")))
            {
                //    //check for start_tiem,end_time 
            
                  if(flagValidation == 1)
                      
            {
                    JOptionPane.showMessageDialog(null,validation,"Error",JOptionPane.ERROR_MESSAGE);
                            return;
            }
                
                
                String sql="Insert into staffattendance(staff_id,s_type,date1,w_type,start_time,end_time,working_hours,overtime,staffattendance.leave,reason,payment) values (?,?,?,?,?,?,?,?,?,?,?)";
                
                    int e = db.insert_data(sql,
                                                                    new String[]{staff_id, s_type,date,
                                                                     w_type,start_time,end_time,working_hours
                                                                    ,overtimedb,"N",reason,paymentdb});
           //staff_id1,s_type2,date3,w_type4,start_time5,end_time6,working_hours7,employee_overtime8,leave9,reason10,payment11
                    //01
                   
            }
            else
            {
                //else block for adding data for 
                
                
                String sql="Insert into staffattendance(staff_id,s_type,date1,w_type,start_time,end_time,working_hours,overtime,staffattendance.leave,reason,payment) values (?,?,?,?,?,?,?,?,?,?,?)";
                
                    int e = db.insert_data(sql,
                                                                    new String[]{staff_id, s_type,date,
                                                                     w_type,"0","0","0"
                                                                    ,"0","Yes",reason,paymentdb});
                
            }
        
        
        
        
        
        }  catch(Exception e)
                    {
                            e.printStackTrace();
                    }
         JOptionPane.showMessageDialog(this, "record inserted");  
                    
      //              JOptionPane.showMessageDialog(null, "Data Saved","Error",JOptionPane.ERROR_MESSAGE);
            
 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jComboBox3.removeAllItems();
        fillrec();
        //jPanel5.setVisible(false);
        
    }//GEN-LAST:event_formWindowActivated

    private void jTextField13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusGained
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_jTextField13FocusGained

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         loadInTable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Payment p=new Payment();
        p.setVisible(true);
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
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance().setVisible(true);
            }
        });
    }
    
    
    
    public static java.util.Date  constructDate(String date1,String time1)
    {
           
            String datearr[]=date1.split("-");
          String date=datearr[0];
              String month=datearr[1];
                String year=datearr[2];
             String timeArr[]=time1.split(":");
           
              System.out.println("date="+date+"month="+month+"year="+year);
              String hr=timeArr[0];
              String min=timeArr[1];
              String ss=timeArr[2];
             
              java.util.Date returndate=new java.util.Date(
                      ((Integer.valueOf(year))-1900),
                  ((Integer.valueOf(month))-1),
                   Integer.valueOf(date),
                     Integer.valueOf(hr),
                      Integer.valueOf(min),
                      Integer.valueOf(ss));
              
              System.out.println("returndate="+returndate);
        
        
        
        return returndate;
    }
    
    public static long calculateDifference(String inTime,String outTime)
    {
        
        long inlong=ConvertTimeTolong(inTime);
        long outTimelong=ConvertTimeTolong(outTime);
        
        
        long diff=outTimelong-inlong;
        return diff;
        
    }
    public static long ConvertTimeTolong(String TimeCal)
    {
        
        String Timearra[]=TimeCal.split(":");
        
        String hr=Timearra[0];
        String mm=Timearra[1];
        String ss=Timearra[2];
        
        long Timecall=(long)((Integer.valueOf(hr))*3600+(Integer.valueOf(mm))*60+(Integer.valueOf(ss)));
        
        System.out.println("Timecall="+Timecall);
        
        return Timecall;
    }
    
    
public int addAttendanceInDB()
{
    System.out.println("addAttendanceInDB start");
    
    
    
    System.out.println("addAttendanceInDB end");
    
    return 0;
}
    
    
public  void performleaveoperation()
{
     String  l=jComboBox2.getSelectedItem().toString();
            java.util.Date dateFromDateChooser1 = jDateChooser1.getDate();
           System.out.println("dateFromDateChooser1="+dateFromDateChooser1);
 //dateString = String.format("%1$td-%1$tm-%1$tY", dateFromDateChooser1); 
dateString = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser1); 
    System.out.println("performleaveoperation-dateString="+dateString);
     
         
            staff_id =(jComboBox3.getSelectedItem()).toString();
            System.out.println("jButton4ActionPerformed staff_id="+staff_id);
            s_type=jTextField13.getText();
            
            date= dateString ;
           // start_time = jTextField2.getText();
           // end_time=jTextField3.getText();
           // working_hours=jTextField4.getText();
            //overtimedb=jTextField5.getText();
            reason=jTextField12.getText();
            paymentdb=jTextField6.getText();
    if(l.equals("Leave"))
    {
           jPanel5.setVisible(true);
               // rani changes the code jTextField5.setText("0");
            
          if( jTextField12.getText().equals(""))
              {
                   JOptionPane.showMessageDialog(this, "please enter  reason"); 
                    return;
              }
        
        System.out.println("staff_id="+staff_id+"\t s_type="+s_type+"\t date="+date);        
         
                               String sql="Insert into staffattendance(staff_id,s_type,date1,w_type,start_time,end_time,working_hours,overtime,staffattendance.leave,reason,payment) values (?,?,?,?,?,?,?,?,?,?,?)";
                
                    int e = db.insert_data(sql,
                                                                    new String[]{staff_id, s_type,date,
                                                                     l,"0","0","0"
                                                                    ,"0","Yes",reason,"0"});
                    
                    
                    System.out.println("performleaveoperation e="+e);
if(e>0)
{
      JOptionPane.showMessageDialog(this, "data is save"); 
    
}
               
            
}
    
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private org.rexi.jbinclock.gui.ClockFrame clockFrame1;
    private org.rexi.jbinclock.gui.ClockFrame clockFrame2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable stafftable;
    // End of variables declaration//GEN-END:variables
}
