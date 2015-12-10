/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author C0114112
 */
public class Kadai02_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        File f = new File("src\\en02\\data22.csv");
        Animal2 an = new Animal2();
        try {
            // 読み込み準備
            BufferedReader br = new BufferedReader(new FileReader(f));

            String line;
            // 1行ずつ読み込み
            while ((line = br.readLine()) != null) {
                // 読み込んだ1行をカンマで区切る
                String[] words = line.split(",");
                for (int i = 0; i < words.length; i++) {
                    an.list1.add(words[i]);
                }

            }
            an.printAnimal();
            // メモリ解放：ファイルへのアクセスを解放
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
