/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

import com.sun.crypto.provider.DHKeyPairGenerator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author C0114112
 */
public class Kadai02_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Integer> populationMap = new HashMap<String, Integer>();
        File f = new File("D:\\NetBeansProjects\\ap2\\src\\en02\\kanto.csv");

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");
                populationMap.put(words[0], Integer.parseInt(words[1]));
            }

            System.out.println("データ数：" + populationMap.size());
            System.out.println("東京の人口：" + populationMap.get("東京") + "万人");
            System.out.println("埼玉の人口：" + populationMap.get("埼玉") + "万人");
            System.out.println("神奈川の人口：" + populationMap.get("神奈川") + "万人");
        } catch (Exception e) {
        }
    }

}
