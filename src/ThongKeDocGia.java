
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class ThongKeDocGia extends javax.swing.JFrame {

    KetNoiQLTV ketNoiQLTV = null;
    Connection connection = null;

    public ThongKeDocGia() throws SQLException {
         ketNoiQLTV = new KetNoiQLTV();
        connection = ketNoiQLTV.getJDBCConnection();
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

        jRadioButton5 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tenchon = new javax.swing.JRadioButton();
        gtchon = new javax.swing.JRadioButton();
        namsinhchon = new javax.swing.JRadioButton();
        diachichon = new javax.swing.JRadioButton();
        nghechon = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangthongke = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jRadioButton5.setText("jRadioButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("THỐNG KÊ ĐỘC GIẢ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        buttonGroup1.add(tenchon);
        tenchon.setText("Tên độc giả");

        buttonGroup1.add(gtchon);
        gtchon.setText("Giới tính");

        buttonGroup1.add(namsinhchon);
        namsinhchon.setText("Năm sinh ");

        buttonGroup1.add(diachichon);
        diachichon.setText("Địa chỉ ");

        buttonGroup1.add(nghechon);
        nghechon.setText("Nghề nghiệp");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("THỐNG KÊ ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Quay lại ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bangthongke.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(bangthongke);

        jButton3.setText("Xuất file thống kê");

        jButton4.setText("Đăng xuất");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tenchon)
                .addGap(72, 72, 72)
                .addComponent(gtchon)
                .addGap(89, 89, 89)
                .addComponent(namsinhchon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(diachichon)
                .addGap(74, 74, 74)
                .addComponent(nghechon)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(228, 228, 228)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenchon)
                    .addComponent(gtchon)
                    .addComponent(namsinhchon)
                    .addComponent(diachichon)
                    .addComponent(nghechon))
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new DocGia().setVisible(true);
                this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(tenchon.isSelected()){
                    thongKeTheoTen();

        }else if(gtchon.isSelected()){
            thongKeTheoGioiTinh(); 
        }else if(namsinhchon.isSelected()){
            thongKeTheoNamSinh(); 
        } else if(diachichon.isSelected()){
            thongKeTheoDiaChi(); 
        }else if(nghechon.isSelected()){
            thongKeTheoNgheNghiep(); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  int chose = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đăng xuất không?", "Xác nhận", 0);
        if (chose == 0) {
            
               new Menu().setVisible(true );
        this.dispose();
            
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ThongKeDocGia().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ThongKeDocGia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangthongke;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton diachichon;
    private javax.swing.JRadioButton gtchon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton namsinhchon;
    private javax.swing.JRadioButton nghechon;
    private javax.swing.JRadioButton tenchon;
    // End of variables declaration//GEN-END:variables

    public void thongKeTheoTen() {
        bangthongke.removeAll();
        String[] columns = {"Tên độc giả", "Số lượng độc  giả"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT COUNT(idDocGia), tenDocGia FROM docgia GROUP BY tenDocGia;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("tenDocGia"));
                vector.add(resultSet.getInt("COUNT(idDocGia)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangthongke.setModel(model);
    }

    private void thongKeTheoGioiTinh() {
        bangthongke.removeAll();
        String[] columns = {"Giới tính", "Số lượng độc giả"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT COUNT(idDocGia), gioiTinhDocGia FROM docgia GROUP BY gioiTinhDocGia;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("gioiTinhDocGia"));
                vector.add(resultSet.getInt("COUNT(idDocGia)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangthongke.setModel(model);
    }

    private void thongKeTheoNamSinh() {
        bangthongke.removeAll();
        String[] columns = {"Năm sinh", "Số lượng độc giả"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT COUNT(idDocGia), namSinhDocGia FROM docgia GROUP BY namSinhDocGia;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("namSinhDocGia"));
                vector.add(resultSet.getInt("COUNT(idDocGia)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangthongke.setModel(model);
    }

    private void thongKeTheoDiaChi() {
        bangthongke.removeAll();
        String[] columns = {"Địa chỉ", "Số lượng độc giả"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT COUNT(idDocGia), diaChiDocGia FROM docgia GROUP BY diaChiDocGia;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("diaChiDocGia"));
                vector.add(resultSet.getInt("COUNT(idDocGia)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangthongke.setModel(model);
    }

    private void thongKeTheoNgheNghiep() {
        bangthongke.removeAll();
        String[] columns = {"Nghề nghiệp", "Số lượng độc giả"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT COUNT(idDocGia), ngheNghiepDocGia FROM docgia GROUP BY ngheNghiepDocGia;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("ngheNghiepDocGia"));
                vector.add(resultSet.getInt("COUNT(idDocGia)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangthongke.setModel(model);
    }

}
