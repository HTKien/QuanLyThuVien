
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
public class ThongKeMuonTraTye1 {

    

    private int idNhanVien;
    private String tenNhanVien;
    private int soLuong;
    private double tienCoc;
    private double tienPhat;
    

    public ThongKeMuonTraTye1() {
       
    }

    public ThongKeMuonTraTye1(int idNhanVien, String tenNhanVien, int soLuong, double tienCoc, double tienPhat) {
        this.idNhanVien = idNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.soLuong = soLuong;
        this.tienCoc = tienCoc;
        this.tienPhat = tienPhat;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public static  ArrayList<ThongKeMuonTraTye1> getList() throws ClassNotFoundException, SQLException {
        String sql = "SELECT COUNT(idNhanVien), idNhanVien FROM muon_tra GROUP BY idNhanVien;";

        ArrayList<ThongKeMuonTraTye1> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new ThongKeMuonTraTye1(
                    resultSet.getInt("idNhanVien"),
                    getTenNhanVien(resultSet.getInt("idNhanVien")),
                    resultSet.getInt("COUNT(idNhanVien)"),
                    getTongTienCocNV(resultSet.getInt("idNhanVien")),
                    getTongTienPhatNV(resultSet.getInt("idNhanVien"))
            ));
        }
        connection.close();
        return list;

    }

    public static String getTenNhanVien(int idNhanVien) {

        String tenNhanVien = "";
       
        String sql = "select tenNhanVien from nhanvien where idNhanVien =' " + idNhanVien + "'; ";
        try {
             
            KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                tenNhanVien = resultSet.getString("tenNhanVien");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return tenNhanVien;
    }

    public static Double getTongTienCocNV(int idNhanVien) {

        Double tongTienCoc = 0D;
       
        String sql = "select sum(tienCoc) from muon_tra where idNhanVien =' " + idNhanVien + "'; ";
        try {
             KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                tongTienCoc = resultSet.getDouble("sum(tienCoc)");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return tongTienCoc;
    }

    public static Double getTongTienPhatNV(int idNhanVien) {

        Double tongTienCoc = 0D;
        
        String sql = "SELECT  muon_tra.idNhanVien ,  sum(tienPhat)   FROM muon_tra INNER JOIN chitietmuontra ON muon_tra.idMuonTra=chitietmuontra.idMuonTra where idNhanVien=" + idNhanVien + " ;";
        try {
            KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                tongTienCoc = resultSet.getDouble("sum(tienPhat)");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return tongTienCoc;
    }

}
