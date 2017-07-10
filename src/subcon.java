/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramiz
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
public class subcon {
    
    Connection con;
    ResultSet rs;
    Statement st;
    PreparedStatement  stmt;
    subcon()
    {
        
    }
     Connection  connect()
   {
      
          try 
        {
     Class driver=Class.forName("com.mysql.jdbc.Driver");
		driver.newInstance();
		// con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/bismillah", "root", "");
                 con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/catering", "root", "");
                 // con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/caters", "root", "");
//st=con.createStatement();
  
//           stmt=con.prepareStatement("Select * from item where ItemId=? , name=?, price=? ,quantity=?,description=?,status=?,created_id=?");
          //   stmt=con.prepareStatement("insert into stud values (?,?)");    
 
        return con;
                    
        } 
catch (Exception e) {
     System.out.println(e);
     return con=null;
 }
      
    
}
   
    
}
