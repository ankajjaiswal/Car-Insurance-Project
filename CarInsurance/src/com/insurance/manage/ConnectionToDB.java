package com.insurance.manage;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionToDB {
      static Connection con;
public static Connection createConnection(){
       try{
           //load the driver
           Class.forName("com.mysql.cj.jdbc.Driver");

           //create Connection
           String user="root";
           String password="Ankaj@975";
           String url="jdbc:mysql://localhost:3307/carinsurance";
           con = DriverManager.getConnection(url, user, password);
       } catch(Exception e){
           e.printStackTrace();
       }
        return con;
    }
}
