/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author C0114112
 */
public class Kadai01_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            BufferedReader br = new BufferedReader(new FileReader(new File("src\\en01", "result1_2.txt")));
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("src\\en01", "result1_3.txt")));

            int sum = 0;
            String line = "";

            for (int i = 1; i > 0; i++) {
                String str = br.readLine();
                if(str == null){
                    break;
                } else if (i % 2 == 0) {
                    sum += Integer.parseInt(str);

                } else if(i % 2 == 1){
                    line = line + str + "/";

                } 
            }
            
            bw.write("果物リスト　：" + line);
            bw.newLine();
            bw.write("合計の値段　：" + sum);
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
