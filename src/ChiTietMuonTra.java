
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
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
public class ChiTietMuonTra extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietMuonTra
     */
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    KetNoiQLTV ketNoiQLTV = null;
    Connection connection = null;
    int a;
    ArrayList<SachType> listSachs = new ArrayList<>() ;
    ArrayList<MuonTraType> listMuonTra = MuonTraType.getList(); 

    public ChiTietMuonTra() throws ClassNotFoundException, SQLException {
        ketNoiQLTV = new KetNoiQLTV();
        connection = ketNoiQLTV.getJDBCConnection();
        initComponents();
        this.setLocationRelativeTo(null);
        a = MuonTra.docMaMuonTra();
        xemChiTiet();
        listSachs=SachType.getList() ;
        combbbMaSach();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mamuontratt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangchitiet = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ngaytratt = new com.toedter.calendar.JDateChooser();
        tienphattt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        masachcombb = new javax.swing.JComboBox();
        jButton10 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton9.setText("jButton9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HÀN TRUNG KIÊN 20162220");

        jLabel1.setText("Danh sách tất cả sách có mã mượn trả là: ");

        bangchitiet.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(bangchitiet);

        jLabel2.setText("Nhập thông tin mượn trả chi tiết:");

        jLabel3.setText("Mã sách: ");

        jLabel4.setText("Ngày trả: ");

        jLabel5.setText("Tiền phạt: ");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setText("Quay lại");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setText("Xem phiếu mượn trả");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setText("Refresh");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setText("Đăng xuất");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(102, 102, 102));
        jButton10.setText("Tính tiền phạt ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addGap(52, 52, 52)
                                .addComponent(jButton5)
                                .addGap(17, 17, 17))
                            .addComponent(mamuontratt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(31, 31, 31)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ngaytratt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(tienphattt)
                            .addComponent(masachcombb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton4)
                .addGap(171, 171, 171)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(masachcombb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(ngaytratt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienphattt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mamuontratt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton8)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            try {
                // TODO add your handling code here:
                new MuonTra().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChiTietMuonTra.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietMuonTra.class.getName()).log(Level.SEVERE, null, ex);
            }
                this.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        ngaytratt.setDate(null);
        tienphattt.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                xemChiTiet();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try {
                // TODO add your handling code here:
                themMTchiTiet();
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietMuonTra.class.getName()).log(Level.SEVERE, null, ex);
            }
            xemChiTiet();
            JOptionPane.showMessageDialog(this, "Thêm sách thành công!");
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            try {
                // TODO add your handling code here:
                suaMTchiTiet();
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietMuonTra.class.getName()).log(Level.SEVERE, null, ex);
            }
            xemChiTiet();

            JOptionPane.showMessageDialog(this,"Sửa chi tiết thành công!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             int chose = JOptionPane.showConfirmDialog(null, "Xác nhận", "Thêm", 0);
        if (chose == 0) {
            try {
                xoaMTchiTiet();
            } catch (SQLException ex) {
                Logger.getLogger(MuonTra.class.getName()).log(Level.SEVERE, null, ex);
            }
            xemChiTiet();
                JOptionPane.showMessageDialog(this, "Xóa chi tiết thành công!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
          int chose = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đăng xuất không?", "Xác nhận", 0);
        if (chose == 0) {
            
               new Menu().setVisible(true );
        this.dispose();
            
            
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new PhieuMuonTra().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        tienphattt.setText(""+tinhTienPhat());
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ChiTietMuonTra().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ChiTietMuonTra.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ChiTietMuonTra.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangchitiet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mamuontratt;
    private javax.swing.JComboBox masachcombb;
    private com.toedter.calendar.JDateChooser ngaytratt;
    private javax.swing.JTextField tienphattt;
    // End of variables declaration//GEN-END:variables

    public void xemChiTiet() {
        mamuontratt.setText(""+a);
        bangchitiet.removeAll();
        String[] columns = {"Mã sách ", "Ngày trả", "Tiền phạt"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        String sql = "select * from chitietmuontra where idMuonTra =" + a + ";";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getInt("idSach"));
                vector.add(resultSet.getDate("ngayTra"));
                vector.add(resultSet.getDouble("tienPhat"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        bangchitiet.setModel(model);

        bangchitiet.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                if (bangchitiet.getSelectedRow() >= 0) {
                    //ma nhan vien : 
                    String maSachString = bangchitiet.getValueAt(bangchitiet.getSelectedRow(), 0).toString();
                    int maSachInt = Integer.parseInt(maSachString);                    
                    for (int i = 0; i < listSachs.size(); i++) {
                        if (maSachInt == listSachs.get(i).getIdSach()) {
                            masachcombb.setSelectedIndex(i);
                        }
                    }
                    
                    
                    ngaytratt.setDate((Date) bangchitiet.getValueAt(bangchitiet.getSelectedRow(), 1));
                    tienphattt.setText(bangchitiet.getValueAt(bangchitiet.getSelectedRow(), 2).toString());

                }
            }

        });

    }

    private void themMTchiTiet() throws SQLException {
        String s1 = mamuontratt.getText();
        int idMuonTra = Integer.parseInt(s1); 
        
                String s3 = masachcombb.getSelectedItem().toString()  ; 

        int idSach= Integer.parseInt(s3); 
        
        String ngayTra = dateFormat.format(ngaytratt.getDate());
        
        String s2 = tienphattt.getText(); 
        Double tienPhat = Double.parseDouble(s2);
        String sql1 = "insert into quan_ly_thu_vien.chitietmuontra (idMuonTra, idSach, ngayTra, tienPhat) values ('" + idMuonTra + "','" + idSach + "', '" + ngayTra + "', '" + tienPhat + "');";
        Statement statement = null;

        statement = connection.createStatement();
        statement.executeUpdate(sql1);
        
        
    }

    private void suaMTchiTiet() throws SQLException {
        String s1 = mamuontratt.getText();
        int idMuonTra = Integer.parseInt(s1); 
        
                String s3 = masachcombb.getSelectedItem().toString()  ; 

        int idSach= Integer.parseInt(s3); 
        
        String ngayTra = dateFormat.format(ngaytratt.getDate());
        
        String s2 = tienphattt.getText(); 
        Double tienPhat = Double.parseDouble(s2);
        String sql1 = "update  chitietmuontra set   ngayTra='" + ngayTra + "', tienPhat='" + tienPhat  + "'   where idMuonTra='" + idMuonTra + "' and idSach = '"+idSach+"';";

        Statement statement = null;

        statement = connection.createStatement();
        statement.executeUpdate(sql1);
    }

    private void xoaMTchiTiet() throws SQLException {
        String s1 = mamuontratt.getText();
        int idMuonTra = Integer.parseInt(s1); 
        
        String s3 = masachcombb.getSelectedItem().toString()  ; 
        int idSach= Integer.parseInt(s3); 
        
        
        String sql1 = "delete from   chitietmuontra   where  idMuonTra='" + idMuonTra + "' and idSach = '"+idSach+"';";

        Statement statement = null;

        statement = connection.createStatement();
        statement.executeUpdate(sql1);
    }
    private void combbbMaSach(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < listSachs.size(); i++) {
            model.addElement(listSachs.get(i).getIdSach());
            
        }
        masachcombb.setModel(model);
    }
    private double tinhTienPhat(){
        double tienPhat= 0D; 
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        //c1.setTime();
        for(int i=0; i<listMuonTra.size(); i++){
            if(a ==listMuonTra.get(i).getIdMuonTra()){
                c1.setTime(listMuonTra.get(i).getNgayHenTra());
            }
        }
        c2.setTime(ngaytratt.getDate());
        int soNgays = (int) ((c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000));
        tienPhat= soNgays*2000; 
        return tienPhat; 
    }
}
