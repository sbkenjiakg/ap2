/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg02;

import java.io.File;

/**
 *
 * @author C0114112
 */
public class Ex26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileSearch fs = new FileSearch();
        File f = new File("D:\\dir");
        fs.showFileNames(f);
    }

}
