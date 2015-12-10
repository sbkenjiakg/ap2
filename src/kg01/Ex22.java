/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg01;

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
public class Ex22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
 
            BufferedReader br = new BufferedReader(new FileReader(new File("src\\kg01", "text1")));
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("src\\kg01", "out.txt")));
            
            String line = "";
            
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
