/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halls.data;

//import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Eva Gee
 */

//import org.halls.business.Student;
//import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.apache.tomcat.jdbc.pool.jmx.ConnectionPool;
//import org.apache.tomcat.jdbc.pool.ConnectionPool;

public class StudentIO {
   
    static final String DB_URL =
      "jdbc:mysql://localhost:3306/testdb";
   static final String DB_DRV =
      "com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "";

   public static void main(String[] args){

      Connection connection = null;
      Statement statement = null;
      ResultSet resultSet = null;

      try{
         connection=DriverManager.getConnection
            (DB_URL,DB_USER,DB_PASSWD);
         statement=connection.createStatement();
         resultSet=statement.executeQuery
            ("SELECT * FROM student ");
         while(resultSet.next()){
            System.out.printf("%s\t%s\t%s\t%f\n",
            resultSet.getString(1),
            resultSet.getString(2),
            resultSet.getString(3),
            resultSet.getFloat(4));
         }

      }catch(SQLException ex){
      }finally{
         try {
            resultSet.close();
            statement.close();
            connection.close();
         } catch (SQLException ex) {
         }
      }
   }
}
    
    
    

