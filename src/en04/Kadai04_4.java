/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author C0114112
 */
public class Kadai04_4 extends javax.swing.JFrame {

    /**
     * Creates new form Kadai04_3
     */
    public Kadai04_4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("学部ID");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("検索");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("計算");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String input = jTextField1.getText();

        try {
            // データベースの接続
            String driverUrl = "jdbc:derby://localhost:1527//meibo";
            // Connection型の変数 con に代入
            // DriverManagerクラスの getConnection メソッドへ引数（URL, ユーザー名，パスワード）
            Connection con = DriverManager.getConnection(driverUrl, "db", "db");

            // SQLを実行するためのステートメントの作成
            Statement stmt = con.createStatement();

            // SQLの実行文
            String sql = "select * from T_STUDENT where gakubu_id = " + input;
            //PreparedStatement ps = con.prepareStatement(sql);
            //ps.setString(1,input);
            // ResultSet型の変数 rs に sql の実行結果の表が返される
            ResultSet rs = stmt.executeQuery(sql);

            // 結果の表示
            // rs.next()：列の値（フィールド）を１行ずつ読み込み処理して表示し，
            // 読み込む行がなくなったらループを抜ける
            while (rs.next()) {
                String result = ""; // resultの値を空にする
                result += rs.getInt("student_id") + ":"; // フィールド"student_id"からint型で値を取得し，"："を連結
                result += rs.getString("fullname") + ":"; // フィールド"fullname"からString型で値を取得
                result += rs.getInt("grade") + ":"; // フィールド"grade"からint型で値を取得
                result += rs.getInt("gakubu_id") + ":";
                result += rs.getInt("score");
                jTextArea1.append(result + "\n"); // resultをテキスト領域に出力
            }

            //クローズ
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            jTextArea1.append(e.getMessage() + "\n");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String driverUrl = "jdbc:derby://localhost:1527//meibo";
            Connection con = DriverManager.getConnection(driverUrl, "db", "db");
            Statement stmt = con.createStatement();
            String sql = "select gakubu_id,max(score),min(score),avg(score),count(*) from T_STUDENT group by gakubu_id";
            ResultSet rs = stmt.executeQuery(sql);
            jTextArea1.append("学部ID：最高点：最低点：平均点：人数\n");
            while (rs.next()) {
                String result = "";

                switch (rs.getInt("GAKUBU_ID")) {
                    case 1:
                        result += "コンピュータサイエンス:";
                        break;
                    case 2:
                        result += "応用生物:";
                        break;
                    case 3:
                        result += "メディア:";
                        break;
                }

                result += rs.getInt("2") + ":";
                result += rs.getInt("3") + ":";
                result += rs.getInt("4") + ":";
                result += rs.getInt("5");
                jTextArea1.append(result + "\n");
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            jTextArea1.append(e.getMessage() + "\n");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kadai04_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kadai04_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kadai04_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kadai04_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kadai04_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
