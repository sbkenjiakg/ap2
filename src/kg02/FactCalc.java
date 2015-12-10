/*
 * Document   : FactCalc.java
 * Created on : 2015/10/5
 * Author     : Mitsuharu Ogiya
 */
package kg02;

/**
 *
 * @author ogiya
 */
public class FactCalc {

    // 再起呼び出しのためのメソッド
    public int fact(int n) {
        if (n == 1) {
            // 引数 n が 1 のときは，1を返す
            return 1;
        } else {
            // 引数 n が 1以上なら， n * fact(n -1)を計算
            return n * fact(n - 1);
        }
    }
}
