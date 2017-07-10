
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */
public class PopulateDailyWage {
    private static Connection con;
    
    
    
    public  static int calcualteDailyWage(String category)
    {
        Logger.getLogger(PopulateDailyWage.class.getName());
        System.out.println("calcualteDailyWage s");
        
        try {
            Class driver=Class.forName("com.mysql.jdbc.Driver");
                     driver.newInstance();
                      con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/fatima", "root", "");
            //st=con.createStatement();
            PreparedStatement stmt = con.prepareStatement("Select * from stud where sname=? and sno=?");
            ConItem cn1 = new ConItem();
       //             cn1.stmt.setInt(1,Integer.parseInt (mtxt1.getText()));
         //           cn1.stmt.setString(2, (mtxt2.getText()));
           //         cn1.stmt.setInt(3, Integer.parseInt (mtxt3.getText()));
             //        cn1.stmt.setInt(4,Integer.parseInt (mtxt4.getText()) );
             
             
        
                     
                     
             
          } catch (Exception  ex) {  
            Logger.getLogger(PopulateDailyWage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          return 1;
       
    }
    
    
}
