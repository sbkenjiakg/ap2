/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

import kg05.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author C0114112
 */
public class Kadai05_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String url = "jdbc:derby://localhost:1527/restaurant";
            Connection con = DriverManager.getConnection(url, "db", "db");
            Statement stmt = con.createStatement();

            String sql = "insert into T_MENU values(1,'フルーツパフェ',600,400)";
            int count = stmt.executeUpdate(sql);

            if (count != 0) {
                System.out.println("実行:" + sql);

            } else {
                System.out.println("SQL文を実行できませんでした。");
            }
            
            sql = "insert into T_MENU values(2,'プリンアラモード',400,450)";
            count = stmt.executeUpdate(sql);

            if (count != 0) {
                System.out.println("実行:" + sql);

            } else {
                System.out.println("SQL文を実行できませんでした。");
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
