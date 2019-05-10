
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
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
public class ThongKeNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form ThongKeNhanVien
     */
    KetNoiQLTV ketNoiQLTV = null;
    Connection connection = null;
    ArrayList<ThongKeNhanVienType> listThongKe = new ArrayList<>();  

    public ThongKeNhanVien() throws ClassNotFoundException, SQLException {
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
        tenchon = new javax.swing.JRadioButton();
        gtchon = new javax.swing.JRadioButton();
        namsinhchon = new javax.swing.JRadioButton();
        diachichon = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangthongke = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HÀN TRUNG KIÊN 20162220");

        buttonGroup1.add(tenchon);
        tenchon.setText("Tên nhân viên ");
        tenchon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenchonActionPerformed(evt);
            }
        });

        buttonGroup1.add(gtchon);
        gtchon.setText("Giới tính");
        gtchon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtchonActionPerformed(evt);
            }
        });

        buttonGroup1.add(namsinhchon);
        namsinhchon.setText("Năm sinh ");
        namsinhchon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namsinhchonActionPerformed(evt);
            }
        });

        buttonGroup1.add(diachichon);
        diachichon.setText("Địa chỉ ");
        diachichon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diachichonActionPerformed(evt);
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

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow-back-icon.png"))); // NOI18N
        jButton2.setText("Quay lại ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Word-icon.png"))); // NOI18N
        jButton3.setText("Xuất file");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("THỐNG KÊ NHÂN VIÊN ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(199, 199, 199))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout3.png"))); // NOI18N
        jButton4.setText("Đăng xuất ");
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
                .addGap(33, 33, 33)
                .addComponent(tenchon)
                .addGap(65, 65, 65)
                .addComponent(gtchon)
                .addGap(107, 107, 107)
                .addComponent(namsinhchon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(diachichon)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(181, 181, 181)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(diachichon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            new DocGia().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThongKeNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tenchonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenchonActionPerformed
        // TODO add your handling code here:
        thongKeTheoTen();
    }//GEN-LAST:event_tenchonActionPerformed

    private void namsinhchonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namsinhchonActionPerformed
        thongKeTheoNamSinh();        // TODO add your handling code here:
    }//GEN-LAST:event_namsinhchonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int chose = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đăng xuất không?", "Xác nhận", 0);
        if (chose == 0) {

            new Menu().setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void gtchonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gtchonActionPerformed
        // TODO add your handling code here:
        thongKeTheoGioiTinh();
    }//GEN-LAST:event_gtchonActionPerformed

    private void diachichonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diachichonActionPerformed
        thongKeTheoDiaChi();        // TODO add your handling code here:
    }//GEN-LAST:event_diachichonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(tenchon.isSelected()){
            try { 
                listThongKe = ThongKeNhanVienType.getList("tenNhanVien");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThongKeNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ThongKeNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }

            JFileChooser jFileChooser = new JFileChooser();
            if (jFileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = jFileChooser.getSelectedFile();

                try {
                    WordHelper.writeNVtheoTen(file, listThongKe, "THỐNG KẾ NHÂN VIÊN THEO TÊN");
                    JOptionPane.showMessageDialog(null, "Xuất file thành công");

                } catch (IOException ex) {
                    Logger.getLogger(ThongKeDocGia.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Xuất file thất bại!");
                }

            }
        }else if(gtchon.isSelected()){
            try { 
                listThongKe = ThongKeNhanVienType.getList("gioiTinhNhanVien");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThongKeNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ThongKeNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }

            JFileChooser jFileChooser = new JFileChooser();
            if (jFileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = jFileChooser.getSelectedFile();

                try {
                    WordHelper.writeNVtheoGioiTinh(file, listThongKe, "THỐNG KẾ NHÂN VIÊN THEO GIỚI TÍNH");
                    JOptionPane.showMessageDialog(null, "Xuất file thành công");

                } catch (IOException ex) {
                    Logger.getLogger(ThongKeDocGia.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Xuất file thất bại!");
                }

            }
        } else if(namsinhchon.isSelected()){
            try { 
                listThongKe = ThongKeNhanVienType.getList("namSinhNhanVien");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThongKeNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ThongKeNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }

            JFileChooser jFileChooser = new JFileChooser();
            if (jFileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = jFileChooser.getSelectedFile();

                try {
                    WordHelper.writeNVtheoNamSinh(file, listThongKe, "THỐNG KẾ NHÂN VIÊN THEO NĂM SINH");
                    JOptionPane.showMessageDialog(null, "Xuất file thành công");

                } catch (IOException ex) {
                    Logger.getLogger(ThongKeDocGia.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Xuất file thất bại!");
                }

            }
        }
        else if(diachichon.isSelected()){
            try { 
                listThongKe = ThongKeNhanVienType.getList("diaChiNhanVien");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThongKeNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ThongKeNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }

            JFileChooser jFileChooser = new JFileChooser();
            if (jFileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = jFileChooser.getSelectedFile();

                try {
                    WordHelper.writeNVtheoDiaChi(file, listThongKe, "THỐNG KẾ NHÂN VIÊN THEO ĐỊA CHỈ");
                    JOptionPane.showMessageDialog(null, "Xuất file thành công");

                } catch (IOException ex) {
                    Logger.getLogger(ThongKeDocGia.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Xuất file thất bại!");
                }

            }
        }
                
                
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ThongKeNhanVien().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ThongKeNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ThongKeNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangthongke;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton diachichon;
    private javax.swing.JRadioButton gtchon;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton namsinhchon;
    private javax.swing.JRadioButton tenchon;
    // End of variables declaration//GEN-END:variables

    private void thongKeTheoTen() {
        bangthongke.removeAll();
        String[] columns = {"Tên nhân viên", "Số lượng nhân viên"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT COUNT(idNhanVien), tenNhanVien FROM nhanvien GROUP BY tenNhanVien ORDER BY COUNT(idNhanVien) DESC ;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("tenNhanVien"));
                vector.add(resultSet.getInt("COUNT(idNhanVien)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangthongke.setModel(model);
    }

    private void thongKeTheoGioiTinh() {
        bangthongke.removeAll();
        String[] columns = {"Giới tính", "Số lượng nhân viên"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT COUNT(idNhanVien), gioiTinhNhanVien FROM nhanvien GROUP BY gioiTinhNhanVien ORDER BY COUNT(idNhanVien) DESC;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("gioiTinhNhanVien"));
                vector.add(resultSet.getInt("COUNT(idNhanVien)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangthongke.setModel(model);
    }

    private void thongKeTheoNamSinh() {
        bangthongke.removeAll();
        String[] columns = {"Năm sinh", "Số lượng nhân viên"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT COUNT(idNhanVien), namSinhNhanVien FROM nhanvien GROUP BY namSinhNhanVien ORDER BY namSinhNhanVien ;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("namSinhNhanVien"));
                vector.add(resultSet.getInt("COUNT(idNhanVien)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangthongke.setModel(model);
    }

    private void thongKeTheoDiaChi() {
        bangthongke.removeAll();
        String[] columns = {"Địa chỉ", "Số lượng nhân viên"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT COUNT(idNhanVien), diaChiNhanVien FROM nhanvien GROUP BY diaChiNhanVien ORDER BY COUNT(idNhanVien) DESC;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("diaChiNhanVien"));
                vector.add(resultSet.getInt("COUNT(idNhanVien)"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangthongke.setModel(model);
    }
}
