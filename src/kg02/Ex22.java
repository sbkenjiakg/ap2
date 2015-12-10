/*
 * Document   : Ex21.java
 * Created on : 2015/10/5
 * Author     : Mitsuharu Ogiya
 */
package kg02;

import com.sun.org.apache.xpath.internal.compiler.Keywords;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author ogiya
 */
public class Ex22 {

    public static void main(String[] args) {
        // ファイルパスを指定
        File f = new File("src\\kg02\\tweet2.csv");

        Tweet tw  =new Tweet();
        
        try {
            // 読み込み準備
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line;
            // 1行ずつ読み込み
            while ((line = br.readLine()) != null) {
                // 読み込んだ1行をカンマで区切る
                 String[] words = line.split(",");
                 
                 tw.setContents(words[4]);
                 tw.setId(words[1]);
                 tw.setName(words[2]);
                 tw.setNumber(Integer.parseInt(words[0]));
                 tw.setTime(words[3]);
                 
                 
                 tw.printTweet();
            }
            // メモリ解放：ファイルへのアクセスを解放
            br.close();
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
