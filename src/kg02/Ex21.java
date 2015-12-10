/*
 * Document   : Ex21.java
 * Created on : 2015/10/5
 * Author     : Mitsuharu Ogiya
 */
package kg02;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author ogiya
 */
public class Ex21 {

    public static void main(String[] args) {
        // ファイルパスを指定
        File f = new File("src\\kg02\\tweet1.csv");

        try {
            // 読み込み準備
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line;
            // 1行ずつ読み込み
            while ((line = br.readLine()) != null) {
                // 読み込んだ1行をカンマで区切る
                String[] words = line.split(",");

                // words[0]:1個目のカンマまで，words[1]：2個目の…
                System.out.println("twetterID：" + words[0]);
                System.out.println("氏名：" + words[1]);
            }
            // メモリ解放：ファイルへのアクセスを解放
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
