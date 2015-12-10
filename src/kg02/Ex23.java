/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author C0114112
 */
public class Ex23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Tweet> list = new ArrayList<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(new File("src\\kg02\\tweet2.csv")));

            String line;
            while ((line = br.readLine()) != null) {
                Tweet tw = new Tweet();
                String[] words = line.split(",");
                
                tw.setContents(words[4]);
                tw.setId(words[1]);
                tw.setName(words[2]);
                tw.setNumber(Integer.parseInt(words[0]));
                tw.setTime(words[3]);
                
                list.add(tw);
            }
            br.close();
            
            for (Tweet w : list) {
                w.printTweet();
            }
        } catch (Exception e) {
        }
    }

}
