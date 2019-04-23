
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
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
public class ThongKeMuonTra extends javax.swing.JFrame {

    /**
     * Creates new form ThongKeMuonTra
     */
    KetNoiQLTV ketNoiQLTV = null;
    Connection connection = null;

    public ThongKeMuonTra() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nhanvienchon = new javax.swing.JRadioButton();
        docgiachon = new javax.swing.JRadioButton();
        ngaymuonchon = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangthongke = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HÀN TRUNG KIÊN 20162220");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("THỐNG KÊ HÓA ĐƠN MƯỢN TRẢ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
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

        buttonGroup1.add(nhanvienchon);
        nhanvienchon.setText("Nhân viên");

        buttonGroup1.add(docgiachon);
        docgiachon.setText("Độc giả");

        buttonGroup1.add(ngaymuonchon);
        ngaymuonchon.setText("Ngày mượn ");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Tháng");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Năm ");

        jButton1.setText("THỐNG KÊ ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jButton2.setText("Quay lại ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xuất file thống kê");

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
                .addGap(248, 248, 248)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nhanvienchon)
                        .addGap(61, 61, 61)
                        .addComponent(docgiachon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(ngaymuonchon)
                        .addGap(68, 68, 68)
                        .addComponent(jRadioButton4)))
                .addGap(58, 58, 58)
                .addComponent(jRadioButton5)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(171, 171, 171)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhanvienchon)
                    .addComponent(docgiachon)
                    .addComponent(ngaymuonchon)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(nhanvienchon.isSelected()){
            thongKeTheoNhanVien();
        } else if(ngaymuonchon.isSelected()){
            thongKeTheoNgayMuon();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new MuonTra().setVisible(true);
                this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeMuonTra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangthongke;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton docgiachon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton ngaymuonchon;
    private javax.swing.JRadioButton nhanvienchon;
    // End of variables declaration//GEN-END:variables

    private void thongKeTheoNhanVien() {
        bangthongke.removeAll();
        String[] columns = {"Mã nhân viên", "Số lượng hóa đơn", "Tên nhân viên"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT COUNT(idNhanVien), idNhanVien FROM muon_tra GROUP BY idNhanVien;";
        Statement statement = null;
        ResultSet resultSet = null;
        ResultSet resultSet1 = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("idNhanVien"));
                vector.add(resultSet.getInt("COUNT(idNhanVien)"));

//                resultSet1 = statement.executeQuery("select tenNhanVien from nhanvien where idNhanVien='" + resultSet.getString("idNhanVien") + "'");
//                while (resultSet1.next()) {
//                    //Vector vector = new Vector();
//                    vector.add(resultSet1.getString("tenNhanVien"));
//
//                    //model.addRow(vector);
//                }

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangthongke.setModel(model);

    }

    private void thongKeTheoNgayMuon() {
        bangthongke.removeAll();
        String[] columns = {"Ngày mượn", "Số lượng hóa đơn"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "SELECT COUNT(idMuonTra), ngayMuon FROM muon_tra GROUP BY ngayMuon ORDER BY ngayMuon DESC;";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("ngayMuon"));
                vector.add(resultSet.getInt("COUNT(idMuonTra)"));



                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bangthongke.setModel(model);
        
    }
}
