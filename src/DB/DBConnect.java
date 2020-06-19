/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import java.sql.*;

public class DBConnect {
    public static Connection getConnection(){
        try {
            String user = "root";
            String pw = "123456";
            String url = "jdbc:mysql://localhost/littlepaws";
            Connection c = DriverManager.getConnection(url, user, pw);
            
            return c;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
