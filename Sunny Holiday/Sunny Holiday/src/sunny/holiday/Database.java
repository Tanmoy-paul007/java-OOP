/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sunny.holiday;
import java.sql.*;
/**
 *
 * @author DIU
 */
public class Database {
   private String url="jdbc:mysql://localhost:3306/resortmanage";
   private String user="root";
   private String passward="";
   private String driver="com.mysql.cj.jdbc.Driver";
   
   public void loadDriver() throws ClassNotFoundException{
        Class.forName(driver);
   } 
   
   public Connection getConnection() throws SQLException, ClassNotFoundException{
       loadDriver();
     return DriverManager.getConnection(url, user, passward);
   } 
 
   public int DML(String sql) throws SQLException, ClassNotFoundException{
  return getConnection().createStatement().executeUpdate(sql);
   }
   public ResultSet select(String sql) throws SQLException, ClassNotFoundException{
  return getConnection().createStatement().executeQuery(sql);
   }
}
