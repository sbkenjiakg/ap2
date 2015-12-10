/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en01;

/**
 *
 * @author C0114112
 */
public class Kadai01_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item items[] = new Item[2];

        items[0] = new Item("apple", 200);
        items[1] = new Item("orange", 150);

        for (int i = 0; i < items.length; i++) {
            String nm = items[i].getName();
            int val = items[i].getValue();
            System.out.println("items[" + i + "]: " + nm + ", " + val);
        }
    }

}
