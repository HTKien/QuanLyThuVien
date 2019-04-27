
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hantr
 */
public class NhanVienType {

    //cac thuoc tinh : 

    private int idNhanVien;
    private String tenNhanVien;
    private String gioiTinhNhanVien;
    private String namSinhNhanVien;
    private String sdtNhanVien;
    private String diaChiNhanVien;
    private String emailNhanVien;

    public NhanVienType() {
    }

    public NhanVienType(int idNhanVien, String tenNhanVien, String gioiTinhNhanVien, String namSinhNhanVien, String sdtNhanVien, String diaChiNhanVien, String emailNhanVien) {
        this.idNhanVien = idNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinhNhanVien = gioiTinhNhanVien;
        this.namSinhNhanVien = namSinhNhanVien;
        this.sdtNhanVien = sdtNhanVien;
        this.diaChiNhanVien = diaChiNhanVien;
        this.emailNhanVien = emailNhanVien;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getGioiTinhNhanVien() {
        return gioiTinhNhanVien;
    }

    public void setGioiTinhNhanVien(String gioiTinhNhanVien) {
        this.gioiTinhNhanVien = gioiTinhNhanVien;
    }

    public String getNamSinhNhanVien() {
        return namSinhNhanVien;
    }

    public void setNamSinhNhanVien(String namSinhNhanVien) {
        this.namSinhNhanVien = namSinhNhanVien;
    }

    public String getSdtNhanVien() {
        return sdtNhanVien;
    }

    public void setSdtNhanVien(String sdtNhanVien) {
        this.sdtNhanVien = sdtNhanVien;
    }

    public String getDiaChiNhanVien() {
        return diaChiNhanVien;
    }

    public void setDiaChiNhanVien(String diaChiNhanVien) {
        this.diaChiNhanVien = diaChiNhanVien;
    }

    public String getEmailNhanVien() {
        return emailNhanVien;
    }

    public void setEmailNhanVien(String emailNhanVien) {
        this.emailNhanVien = emailNhanVien;
    }
    
    public static ArrayList<NhanVienType> getList() throws ClassNotFoundException, SQLException {
        String sql = "select * from nhanvien ; ";
        ArrayList<NhanVienType> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new NhanVienType(
                    resultSet.getInt("idNhanVien"),
                    resultSet.getString("tenNhanVien"),
                    resultSet.getString("gioiTinhNhanVien"),
                    resultSet.getString("namSinhNhanVien"),
                    resultSet.getString("sdtNhanVien"),
                    resultSet.getString("diaChiNhanVien"),
                    resultSet.getString("emailNhanVien")));

        }
        connection.close();
        return list;

    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<NhanVienType> list = new ArrayList<>();
        list = getList();
        int a = list.size();
        System.out.println(a);
        System.out.println("Ten nhan vien  dau tien la :" + list.get(0).getTenNhanVien());
        System.out.println("id nhan vien  dau tien la: " + list.get(0).getIdNhanVien());
        System.out.println("ma nhan vien  cua  cua toan bo  danh sach la: ");
        for (int i = 0; i < a; i++) {
            System.out.println( list.get(i).getIdNhanVien());

        }
    }

}
