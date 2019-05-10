
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hantr
 */
public class ThongKeSach extends javax.swing.JFrame {

    /**
     * Creates new form ThongKeSach
     */
    KetNoiQLTV ketNoiQLTV = null;
    Connection connection = null;
    public ThongKeSach() {
        ketNoiQLTV = new KetNoiQLTV();
        connection = ketNoiQLTV.getJDBCConnection();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tensachchon = new javax.swing.JRadioButton();
        theloaichon = new javax.swing.JRadioButton();
        namxbchon = new javax.swing.JRadioButton();
        nhaxbchon = new javax.swing.JRadioButton();
        tacgiachon = new javax.swing.JRadioButton();
        tienchon = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangtk = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HÀN TRUNG KIÊN 20162220");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("THỐNG KÊ SÁCH ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(tensachchon);
        tensachchon.setText("Tên sách ");
        tensachchon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tensachchonActionPerformed(evt);
            }
        });

        buttonGroup1.add(theloaichon);
        theloaichon.setText("Thể loại ");
        theloaichon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theloaichonActionPerformed(evt);
            }
        });

        buttonGroup1.add(namxbchon);
        namxbchon.setText("Năm xuất bản ");
        namxbchon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namxbchonActionPerformed(evt);
            }
        });

        buttonGroup1.add(nhaxbchon);
        nhaxbchon.setText("Nhà xuất bản ");
        nhaxbchon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaxbchonActionPerformed(evt);
            }
        });

        buttonGroup1.add(tacgiachon);
        tacgiachon.setText("Tác giả");
        tacgiachon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tacgiachonActionPerformed(evt);
            }
        });

        buttonGroup1.add(tienchon);
        tienchon.setText("Giá tiền");
        tienchon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tienchonActionPerformed(evt);
            }
        });

        bangtk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(bangtk);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow-back-icon.png"))); // NOI18N
        jButton3.setText("Quay lại ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Word-icon.png"))); // NOI18N
        jButton4.setText("Xuất file");

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout3.png"))); // NOI18N
        jButton6.setText("Đăng xuất ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tensachchon)
                .addGap(30, 30, 30)
                .addComponent(theloaichon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(namxbchon)
                .addGap(42, 42, 42)
                .addComponent(nhaxbchon)
                .addGap(41, 41, 41)
                .addComponent(tacgiachon)
                .addGap(52, 52, 52)
                .addComponent(tienchon)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(212, 212, 212)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tensachchon)
                    .addComponent(theloaichon)
                    .addComponent(namxbchon)
                    .addComponent(nhaxbchon)
                    .addComponent(tacgiachon)
                    .addComponent(tienchon))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton6)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tienchonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tienchonActionPerformed
        tkTheoTien();        // TODO add your handling code here:
    }//GEN-LAST:event_tienchonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            new Sach().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeSach.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeSach.class.getName()).log(Level.SEVERE, null, ex);
        }
                this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         int chose = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đăng xuất không?", "Xác nhận", 0);
        if (chose == 0) {
            
               new Menu().setVisible(true );
        this.dispose();
            
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tensachchonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tensachchonActionPerformed
        thongKeTheoTen();        // TODO add your handling code here:
    }//GEN-LAST:event_tensachchonActionPerformed

    private void theloaichonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theloaichonActionPerformed
        thongKeTheoTheLoai();        // TODO add your handling code here:
    }//GEN-LAST:event_theloaichonActionPerformed

    private void namxbchonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namxbchonActionPerformed
        tkTheoNamXB();        // TODO add your handling code here:
    }//GEN-LAST:event_namxbchonActionPerformed

    private void nhaxbchonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaxbchonActionPerformed
        tkTheoNhaXB();        // TODO add your handling code here:
    }//GEN-LAST:event_nhaxbchonActionPerformed

    private void tacgiachonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tacgiachonActionPerformed
        tkTheoTG();        // TODO add your handling code here:
    }//GEN-LAST:event_tacgiachonActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangtk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton namxbchon;
    private javax.swing.JRadioButton nhaxbchon;
    private javax.swing.JRadioButton tacgiachon;
    private javax.swing.JRadioButton tensachchon;
    private javax.swing.JRadioButton theloaichon;
    private javax.swing.JRadioButton tienchon;
    // End of variables declaration//GEN-END:variables

    private void thongKeTheoTen() {
        bangtk.removeAll();
        String[] columns = {"Tên sách", "Số lượng sách"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT SUM(soLuong), tenSach FROM sach GROUP BY tenSach ORDER BY SUM(soLuong) DESC ;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("tenSach"));
                vector.add(resultSet.getInt("SUM(soLuong)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangtk.setModel(model);
    }

    private void thongKeTheoTheLoai() {
        bangtk.removeAll();
        String[] columns = {"Thể loại", "Số lượng sách"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT SUM(soLuong), theLoaiSach FROM sach GROUP BY theLoaiSach ORDER BY SUM(soLuong) DESC;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("theLoaiSach"));
                vector.add(resultSet.getInt("SUM(soLuong)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangtk.setModel(model);
    }

    private void tkTheoNamXB() {
        bangtk.removeAll();
        String[] columns = {"Năm xuất bản", "Số lượng sách"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT SUM(soLuong), namXuatBanSach FROM sach GROUP BY namXuatBanSach ORDER BY SUM(soLuong) DESC;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("namXuatBanSach"));
                vector.add(resultSet.getInt("SUM(soLuong)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangtk.setModel(model);
    }

    private void tkTheoNhaXB() {
        bangtk.removeAll();
        String[] columns = {"Nhà xuất bản", "Số lượng sách"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT SUM(soLuong), nhaXuatBanSach FROM sach GROUP BY nhaXuatBanSach ORDER BY SUM(soLuong) DESC;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("nhaXuatBanSach"));
                vector.add(resultSet.getInt("SUM(soLuong)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangtk.setModel(model);
    }

    private void tkTheoTG() {
        bangtk.removeAll();
        String[] columns = {"Tác giả", "Số lượng sách"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT SUM(soLuong), tenTacGia FROM sach GROUP BY tenTacGia ORDER BY SUM(soLuong) DESC;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("tenTacGia"));
                vector.add(resultSet.getInt("SUM(soLuong)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangtk.setModel(model);
    }

    private void tkTheoTien() {
        bangtk.removeAll();
        String[] columns = {"Giá tiền", "Số lượng sách"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT SUM(soLuong), giaTien FROM sach GROUP BY giaTien ORDER BY giaTien  DESC;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("giaTien"));
                vector.add(resultSet.getInt("SUM(soLuong)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangtk.setModel(model);
    }
}
