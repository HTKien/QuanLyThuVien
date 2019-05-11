
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hantr
 */
public class ThongKeTheoNamType {

    private Date ngayMuon;
    private int soLuong;
    private double tienCoc;
    private double tienPhat;

    public ThongKeTheoNamType() {
    }

    public ThongKeTheoNamType(Date ngayMuon, int soLuong, double tienCoc, double tienPhat) {
        this.ngayMuon = ngayMuon;
        this.soLuong = soLuong;
        this.tienCoc = tienCoc;
        this.tienPhat = tienPhat;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
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

    public static ArrayList<ThongKeTheoNamType> getList() throws ClassNotFoundException, SQLException {
        String sql = "SELECT count(idMuonTra),YEAR(ngayMuon),sum(tienCoc)  FROM muon_tra   group by  YEAR(ngayMuon) order by YEAR(ngayMuon); ";

        ArrayList<ThongKeTheoNamType> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new ThongKeTheoNamType(
                    resultSet.getDate("YEAR(ngayMuon)"),
                    resultSet.getInt("COUNT(idMuonTra)"),
                    resultSet.getInt("sum(tienCoc)"),
                    getTienPhatTheoNam(resultSet.getDate("YEAR(ngayMuon)").toString())
            ));
        }
        connection.close();
        return list;

    }

    public static double getTienPhatTheoNam(String a) {
        Double tienPhat = 0D;

       
        String sql = "SELECT  sum(tienPhat) FROM muon_tra inner join chitietmuontra on muon_tra.idMuonTra = chitietmuontra.idMuonTra where year(ngayMuon)='" + a + "';";
        try {
           KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
            Connection connection = ketNoiQLTV.getJDBCConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                tienPhat = resultSet.getDouble("sum(tienPhat)");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return tienPhat;
    }

}
