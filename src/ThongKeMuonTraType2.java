
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
public class ThongKeMuonTraType2 {
     private int idDocGia;
    private String tenDocGia;
    private int soLuong;
    private double tienCoc;
    private double tienPhat;

    public ThongKeMuonTraType2() {
    }

    public ThongKeMuonTraType2(int idDocGia, String tenDocGia, int soLuong, double tienCoc, double tienPhat) {
        this.idDocGia = idDocGia;
        this.tenDocGia = tenDocGia;
        this.soLuong = soLuong;
        this.tienCoc = tienCoc;
        this.tienPhat = tienPhat;
    }

    public int getIdDocGia() {
        return idDocGia;
    }

    public void setIdDocGia(int idDocGia) {
        this.idDocGia = idDocGia;
    }

    public String getTenDocGia() {
        return tenDocGia;
    }

    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
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
    public static  ArrayList<ThongKeMuonTraType2> getList() throws ClassNotFoundException, SQLException {
        String sql = "SELECT COUNT(idDocGia), idDocGia FROM muon_tra GROUP BY idDocGia;";

        ArrayList<ThongKeMuonTraType2> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new ThongKeMuonTraType2(
                    resultSet.getInt("idDocGia"),
                    getTenDocGia(resultSet.getInt("idDocGia")),
                    resultSet.getInt("COUNT(idDocGia)"),
                    getTongTienCocDG(resultSet.getInt("idDocGia")),
                    getTongTienPhatDG(resultSet.getInt("idDocGia"))
            ));
        }
        connection.close();
        return list;

    }

    public static String getTenDocGia(int idDocGia) {

        String tenNhanVien = "";
       
        String sql = "select tenDocGia from docgia where idDocGia =' " + idDocGia + "'; ";
        try {
             
            KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                tenNhanVien = resultSet.getString("tenDocGia");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return tenNhanVien;
    }

    public static Double getTongTienCocDG(int idDocGia) {

        Double tongTienCoc = 0D;
       
        String sql = "select sum(tienCoc) from muon_tra where idDocGia =' " + idDocGia + "'; ";
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

    public static Double getTongTienPhatDG(int idDocGia) {

        Double tongTienCoc = 0D;
        
        String sql = "SELECT  muon_tra.idDocGia ,  sum(tienPhat)   FROM muon_tra INNER JOIN chitietmuontra ON muon_tra.idMuonTra=chitietmuontra.idMuonTra where idDocGia=" + idDocGia + " ;";
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
