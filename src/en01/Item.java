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
public class Item {

    private String name;
    private int value;

    public Item(String nm, int val) {
        this.name = nm; //商品名
        this.value = val; //値段
    }

    public String getName() {
        return name;
    }

    public void setName(String nm) {
        this.name = nm;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int val) {
        this.value = val;
    }
}

