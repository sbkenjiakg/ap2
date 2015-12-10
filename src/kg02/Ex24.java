/*
 * Document   : Ex24.java
 * Created on : 2015/10/5
 * Author     : Mitsuharu Ogiya
 */
package kg02;

import java.io.File;

/**
 *
 * @author ogiya
 */
public class Ex24 {

    public static void main(String[] args) {
        // File型の変数に対して，kg02までのパスを指定して作成
        File f = new File("src\\kg02");

        // 変数 f がディレクトリかどうかをチェック
        if (f.isDirectory() == true) {
            // kg02内のファイル等のすべての名前をString配列変数list1に代入
            String[] list1 = f.list();

            // kg02内のファイル等のすべてのパスをFile型配列変数list2に代入
            File[] list2 = f.listFiles();

            // 変数fの絶対パスを出力
            System.out.println(f.getAbsolutePath());

            // 変数f内のファイル等のすべての名前を出力
            for (int i = 0; i <list1.length; i++) {
                System.out.println("名前：" + list1[i]);
            }

            // 変数f内のファイル等のすべてのパスを出力
            for (int i = 0; i <list2.length; i++) {
                System.out.println("パス：" + list2[i]);
            }
        }
    }
}
