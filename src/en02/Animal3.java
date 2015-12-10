/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author C0114112
 */
public class Animal3 {

    List<String> list1 = new ArrayList<String>();


    int search(String str) {
            int i = 0;
        for (Iterator<String> iterator = list1.iterator(); iterator.hasNext();) {
            if (str.equals(list1.get(i)) == true) {
                break;
            } else {
                i++;
            }
        }
        return i;
    }

}
