/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg02;

/**
 *
 * @author C0114112
 */
public class Tweet {
    int number;
    String id;
    String name;
    String time;
    String contents;
    public Tweet() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
    
    void printTweet(){
        System.out.println(number +" : " + "("+ name + ")");
        System.out.println(time);
        System.out.println(contents);
    }
    
}
