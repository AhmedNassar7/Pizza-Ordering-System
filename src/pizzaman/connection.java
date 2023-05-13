package pizzaman;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class connection {
 public static Connection con;
 
   
 public static void ConnectToSQl() throws ClassNotFoundException{ // to connect to SQL

 String url = "jdbc:sqlserver://localhost;databaseName=Pizza;";
 String username ="Azim";
 String password ="123321";
 
 try{
     
 con = DriverManager.getConnection(url, username,password);
 
 System.out.println("Database Connected");
 }
 catch ( SQLException e){ 
     System.out.println(e);
 }
 }
 
 public static void Close () { 
 try { con.close();
 } catch (SQLException ex) { System.out.println("Error Connection"); }
 }
 
} 

