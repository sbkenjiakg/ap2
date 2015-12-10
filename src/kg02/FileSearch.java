/*
 * Document   : FileSearch.java
 * Created on : 2015/10/5
 * Author     : Mitsuharu Ogiya
 */
package kg02;

import java.io.File;

/**
 *
 * @author ogiya
 */
public class FileSearch {

    // 引数 f は，ディレクトリのパスを渡すこと
    public void showFileNames(File f) {
        // 引数 f 内のすべてのファイル等のパスを取得
        File[] list = f.listFiles();

        // list の各要素に対して処理を行う
        for (int i = 0; i < list.length; i++) {
            // list[i] がディレクトリかどうか調べる
            if ( list[i].isDirectory() == true) {
                // list[i] がディレクトリの場合：list[i]の名前を出力
                System.out.println("ディレクトリ名：" + list[i].getName());
                // showFileNamesを再起呼び出し：引数はlist[i]
                showFileNames(list[i]);
            } else {
                // list[i] がファイルの場合：list[i]の名前を出力
                System.out.println("ファイル名：" + list[i].getName());
            }
        }
    }
}
