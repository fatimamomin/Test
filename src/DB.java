/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package Other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Baba
 */
public class DB {
     public DB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    //get connection
    public Connection getConnection()
    {
        try{
           
        
        // Connection con = DriverManager.getConnection("jdbc:mysql://localhost/catering","root","");   
           Connection  con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/caters", "root", "");
        
        return con;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }
    
    //execu queries to get result set
    //args is Stringparamenters to set values
    public  ResultSet execute_query(String sql_string, String[] args)
     {
          ResultSet rs=null;
          Connection con=null;
          PreparedStatement ps;
          int i=0,j=1;
         
          try
          {
              con=this.getConnection();
             ps=con.prepareStatement(sql_string);
             if(args.length>0)
             {
                for(i=0;i<args.length;i++)
                {
                    ps.setString(j, args[i]);
                    // System.out.println(j+" "+args[i]) ;
                    j++;

                }
             }
             
             rs=ps.executeQuery();
            
             return rs;
          }
          catch(SQLException e)
          {
              e.printStackTrace();
              JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
              return rs;
          }
     }
      public  ResultSet execute_query(String sql_string, ArrayList args)
     {
          ResultSet rs=null;
          Connection con=null;
          PreparedStatement ps;
          int i=0,j=1;
         
          try
          {
              con=this.getConnection();
             ps=con.prepareStatement(sql_string);
             if(args.size()>0)
             {
                for(i=0;i<args.size();i++)
                {
                    ps.setString(j, args.get(i).toString());
                   //  System.out.println(j+" "+args.get(i).toString()) ;
                    j++;

                }
             }
             
             rs=ps.executeQuery();
            
             return rs;
          }
          catch(SQLException e)
          {
              e.printStackTrace();
              JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
              return rs;
          }
     }
    public  ResultSet execute_query(String sql_string)
     {
          ResultSet rs=null;
          Connection con=null;
          PreparedStatement ps;
          //int i=0,j=1;
         
          try
          {
              con=this.getConnection();
             ps=con.prepareStatement(sql_string);
           
             rs=ps.executeQuery();
            
             return rs;
          }
          catch(SQLException e)
          {
              e.printStackTrace();
              JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
              return rs;
          }
     }
    //get emp name of given emp id
   
    // insert data into database. 
    //paramenters are sql strint for prepared statement and string array
    public int insert_data(String sql_string, String[] args)
     {
         
         System.out.println(DB.class.getName()+"insertdata");
          ResultSet rs=null;
          Connection con=null;
          PreparedStatement ps=null;
          int i=0,j=1, insert_id=0;
          Statement s;
          try
          {
              con=getConnection();
              s=con.createStatement();
              ps=con.prepareStatement(sql_string, Statement.RETURN_GENERATED_KEYS);
          
             for(i=0;i<args.length;i++)
             {
                 
                 if(i==0)
                 {
                     System.out.println("i value is zero");
                     System.out.println("j="+j);
                     j=1;
                 }
                 
                 if(i==5)
                 {
                     System.out.println("i="+i);
                     
                      System.out.println("args.length="+args.length);
                     
                     if(i <args.length)
                     {
                         
                         System.out.println("args[5]="+args[i]);
                         
                         
                     }
                     
                     
                     
                 }
                 
                 ps.setString(j, args[i]);
                 j++;
                
                  //System.out.println(args[i]);
             }
             
              System.out.println("ps;="+ps);
             
            System.out.println("query="+ps.getParameterMetaData());
           
             ps.executeUpdate();
             rs=ps.getGeneratedKeys();
              System.out.println("rs="+rs);
             rs.next();
             System.out.println("Id From dbconn "+rs.getInt(1));
             return rs.getInt(1);
             
          }
          catch(Exception e)
          {
              e.printStackTrace();
              JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
              return 0;
          }
     }
    
    //update and delete databse record
    //parametss are sql string for paremens and string array
    public int update_data(String sql_string, String[] args)
     {
          ResultSet rs=null;
          Connection con=null;
          PreparedStatement ps=null;
          int i=0,j=1, insert_id=0;
          Statement s;
          try
          {
              con=getConnection();
              s=con.createStatement();
              ps=con.prepareStatement(sql_string);
          
             for(i=0;i<args.length;i++)
             {
                 System.out.println("Total argument "+args.length);
                 ps.setString(j, args[i]);
                  System.out.println(j+" "+args[i]);
                 j++;
                
                 
             }
           
             ps.executeUpdate();
         
             return 1;
          }
          catch(Exception e)
          {
              e.printStackTrace();
              JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
              return 0;
          }
     }
    
   
     public static void main (String[] argv)
     {
        
        
     }
    
}
