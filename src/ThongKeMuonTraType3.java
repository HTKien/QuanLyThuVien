
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
public class ThongKeMuonTraType3 {

    private Date ngayMuon;
    private int soLuong;
    private double tienCoc;
    private double tienPhat;

    public ThongKeMuonTraType3() {
    }

    public ThongKeMuonTraType3(Date ngayMuon, int soLuong, double tienCoc, double tienPhat) {
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

    public static ArrayList<ThongKeMuonTraType3> getList() throws ClassNotFoundException, SQLException {
        String sql = "SELECT COUNT(idMuonTra), ngayMuon FROM muon_tra GROUP BY ngayMuon ORDER BY ngayMuon DESC;";

        ArrayList<ThongKeMuonTraType3> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new ThongKeMuonTraType3(
                    resultSet.getDate("ngayMuon"),
                    resultSet.getInt("COUNT(idMuonTra)"),
                    getTongTienCocTheoNgayMuon(resultSet.getDate("ngayMuon")),
                    getTongTienPhatTheoNgay(resultSet.getDate("ngayMuon"))
            ));
        }
        connection.close();
        return list;

    }

    private static double getTongTienCocTheoNgayMuon(Date ngayMuon) {
        Double tongTienCoc = 0D;

        String sql = "select sum(tienCoc) from muon_tra where ngayMuon =' " + ngayMuon + "'; ";
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

    private static double getTongTienPhatTheoNgay(Date ngayMuon) {
        double tongTienPhat = 0D;
        String sql = "SELECT  sum(tienPhat)  FROM quan_ly_thu_vien.muon_tra inner join chitietmuontra on muon_tra.idMuonTra= chitietmuontra.idMuonTra  where ngayMuon='" + ngayMuon + "';";

        try {
            KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
            Connection connection = ketNoiQLTV.getJDBCConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                tongTienPhat = resultSet.getDouble("sum(tienPhat)");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tongTienPhat;

    }

}
