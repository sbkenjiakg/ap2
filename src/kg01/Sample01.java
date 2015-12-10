/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg01;

import java.io.File;

/**
 *
 * @author C0114112
 */
public class Sample01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File f = new File("src\\kg01","text1");
            
            System.out.println(f.getName());
            System.out.println(f.getAbsoluteFile());
            System.out.println(f.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
