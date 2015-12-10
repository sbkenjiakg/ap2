/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author C0114112
 */
public class Ex51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String url = "jdbc:derby://localhost:1527/meibo";
            Connection con = DriverManager.getConnection(url, "db", "db");
            Statement stmt = con.createStatement();
            
            String sql = "insert into T_STUDENT values(5,'工科太郎',2,2,97)";
            int count = stmt.executeUpdate(sql);
            
            if (count != 0) {
                System.out.println("実行:" + sql);
                
            }else{
                System.out.println("SQL文を実行できませんでした。");
            }
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
