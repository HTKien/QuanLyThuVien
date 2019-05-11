
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
public class PhieuMuonTra extends javax.swing.JFrame {

    /**
     * Creates new form PhieuMuonTra
     */
    int a = MuonTra.docMaMuonTra();

    KetNoiQLTV ketNoiQLTV = null;
    Connection connection = null;

    public PhieuMuonTra() {

        ketNoiQLTV = new KetNoiQLTV();
        connection = ketNoiQLTV.getJDBCConnection();
        initComponents();
        this.setLocationRelativeTo(null);
        xemPhieuMuonTra();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mamuontra = new javax.swing.JTextField();
        madocgia = new javax.swing.JTextField();
        manhanvien = new javax.swing.JTextField();
        ngaymuon = new javax.swing.JTextField();
        tiencoc = new javax.swing.JTextField();
        tongtienphat = new javax.swing.JTextField();
        tendocgia = new javax.swing.JTextField();
        tennhanvien = new javax.swing.JTextField();
        ngayhentra = new javax.swing.JTextField();
        tienno = new javax.swing.JTextField();
        sosachmuon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangphieu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        sosachtra = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HÀN TRUNG KIÊN 20162220");

        jLabel2.setText("Mã mượn trả: ");

        jLabel3.setText("Mã độc giả: ");

        jLabel4.setText("Tên độc giả: ");

        jLabel5.setText("Mã nhân viên: ");

        jLabel6.setText("Tên nhân viên: ");

        jLabel7.setText("Ngày mượn: ");

        jLabel8.setText("Ngày hẹn trả: ");

        jLabel9.setText("Tiền cọc: ");

        jLabel10.setText("Số sách mượn: ");

        jLabel11.setText("Tổng tiền phạt: ");

        jLabel12.setText("Số tiền còn nợ: ");

        mamuontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mamuontraActionPerformed(evt);
            }
        });

        tiencoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiencocActionPerformed(evt);
            }
        });

        tongtienphat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongtienphatActionPerformed(evt);
            }
        });

        sosachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sosachmuonActionPerformed(evt);
            }
        });

        bangphieu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(bangphieu);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow-back-icon.png"))); // NOI18N
        jButton1.setText("Quay lại ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Word-icon.png"))); // NOI18N
        jButton2.setText("Xuất phiếu");

        jLabel13.setText("Số sách trả: ");

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout3.png"))); // NOI18N
        jButton3.setText("Đăng xuất");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PHIẾU MƯỢN TRẢ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(104, 104, 104)
                .addComponent(jButton3))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tendocgia, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(tennhanvien)
                                .addComponent(ngayhentra)
                                .addComponent(sosachtra)
                                .addComponent(tongtienphat))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(madocgia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                                .addComponent(mamuontra, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tienno, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                                    .addComponent(tiencoc, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(sosachmuon, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ngaymuon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(manhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11))
                                .addGap(164, 164, 164)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mamuontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(madocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tendocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(manhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tennhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(ngaymuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngayhentra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sosachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(sosachtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiencoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(tongtienphat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tienno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            new ChiTietMuonTra().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PhieuMuonTra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuonTra.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mamuontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mamuontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mamuontraActionPerformed

    private void tiencocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiencocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiencocActionPerformed

    private void sosachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sosachmuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sosachmuonActionPerformed

    private void tongtienphatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongtienphatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tongtienphatActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int chose = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đăng xuất không?", "Xác nhận", 0);
        if (chose == 0) {

            new Menu().setVisible(true);
            this.dispose();

        }                 // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(PhieuMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhieuMuonTra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangphieu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField madocgia;
    private javax.swing.JTextField mamuontra;
    private javax.swing.JTextField manhanvien;
    private javax.swing.JTextField ngayhentra;
    private javax.swing.JTextField ngaymuon;
    private javax.swing.JTextField sosachmuon;
    private javax.swing.JTextField sosachtra;
    private javax.swing.JTextField tendocgia;
    private javax.swing.JTextField tennhanvien;
    private javax.swing.JTextField tiencoc;
    private javax.swing.JTextField tienno;
    private javax.swing.JTextField tongtienphat;
    // End of variables declaration//GEN-END:variables

    private void xemPhieuMuonTra() {
        mamuontra.setText("" + a);
        manhanvien.setText("" + MuonTra.docMaNhanVien());
        madocgia.setText("" + MuonTra.docMaDocGia());
        ngaymuon.setText("" + MuonTra.docNgayMuon());
        ngayhentra.setText("" + MuonTra.docNgayHenTra());
        tiencoc.setText("" + MuonTra.docTienCoc());
        tendocgia.setText("" + truyVanTenDocGia());
        tennhanvien.setText("" + truyVanTenNhanVien());
        sosachmuon.setText("" + docSoSachMuon());
        tongtienphat.setText("" + docTongTienPhat());
        tienno.setText("" + (docTongTienPhat() - MuonTra.docTienCoc()));
        sosachtra.setText("" + docSoSachTra());
        loadBangPhieu();

    }

    public String truyVanTenDocGia() {
        String tenDocGia = "";
        String sql = "select tenDocGia from docgia where idDocGia='" + MuonTra.docMaDocGia() + "';";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {

                tenDocGia = resultSet.getString("tenDocGia");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return tenDocGia;
    }

    public String truyVanTenNhanVien() {
        String tenNhanVien = "";
        String sql = "select tenNhanVien from nhanvien where idNhanVien='" + MuonTra.docMaNhanVien() + "';";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {

                tenNhanVien = resultSet.getString("tenNhanVien");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return tenNhanVien;
    }

    public int docSoSachMuon() {
        int soSachMuon = 0;
        String sql = "SELECT COUNT(idSach) FROM chitietmuontra where idMuonTra ='" + MuonTra.docMaMuonTra() + "' and ngayTra is null ;";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {

                soSachMuon = resultSet.getInt("COUNT(idSach)");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return soSachMuon;
    }

    public int docSoSachTra() {
        int soSachMuon = 0;
        String sql = "SELECT COUNT(idSach) FROM chitietmuontra where idMuonTra ='" + MuonTra.docMaMuonTra() + "' and ngayTra is not null ;";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {

                soSachMuon = resultSet.getInt("COUNT(idSach)");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return soSachMuon;
    }

    public Double docTongTienPhat() {
        Double tongTienPhat = 0D;
        String sql = "SELECT SUM(tienPhat) FROM chitietmuontra where idMuonTra ='" + MuonTra.docMaMuonTra() + "' GROUP BY idMuonTra;";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {

                tongTienPhat = resultSet.getDouble("SUM(tienPhat)");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return tongTienPhat;
    }

    private void loadBangPhieu() {
        bangphieu.removeAll();
        String[] columns = {"Mã mượn trả", "Mã sách", "Tên sách", "Ngày trả", "Tiền phạt"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        String sql = "select * from chitietmuontra where idMuonTra =" + a + ";";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getInt("idMuonTra"));
                vector.add(resultSet.getInt("idSach"));
                vector.add(getTenSach(resultSet.getInt("idSach")));
                vector.add(resultSet.getDate("ngayTra"));
                vector.add(resultSet.getDouble("tienPhat"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        bangphieu.setModel(model);

    }

    public String getTenSach(int maSach) {

        String tenSach = "";
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select tenSach from sach where idSach =' " + maSach + "'; ";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                tenSach = resultSet.getString("tenSach");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return tenSach;
    }
}
