/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg05;

import com.sun.org.apache.xpath.internal.compiler.Keywords;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author C0114112
 */
public class Ex52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String url = "jdbc:derby://localhost:1527/meibo";
            Connection con = DriverManager.getConnection(url, "db", "db");
            Statement stmt = con.createStatement();

            String sql = "select max(student_id) from T_STUDENT";
            ResultSet rs = stmt.executeQuery(sql);

            int max = 0;
            if (rs.next()) {
                max = rs.getInt("1") + 1;
            } else {
                System.out.println("");
            }
            File f = new File("src\\kg05\\student.csv");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                sql = "insert into T_STUDENT(student_id,fullname,gakubu_id,grade) values("
                        + max + ",'"
                        + str[0] + "',"
                        + str[1] + ","
                        + str[2] + ")";
                int count = stmt.executeUpdate(sql);
                max++;
            }

            stmt.close();
            con.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
