
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
public class PhieuMuonTraType {

    private int idMuonTra;
    private int idSach;
    private String tenSach;
    private Date ngayTra;
    private double tienPhat;

    public PhieuMuonTraType() {
    }

    public PhieuMuonTraType(int idMuonTra, int idSach, String tenSach, Date ngayTra, double tienPhat) {
        this.idMuonTra = idMuonTra;
        this.idSach = idSach;
        this.tenSach = tenSach;
        this.ngayTra = ngayTra;
        this.tienPhat = tienPhat;
    }

    public int getIdMuonTra() {
        return idMuonTra;
    }

    public void setIdMuonTra(int idMuonTra) {
        this.idMuonTra = idMuonTra;
    }

    public int getIdSach() {
        return idSach;
    }

    public void setIdSach(int idSach) {
        this.idSach = idSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

   

    public static ArrayList<PhieuMuonTraType> getList() throws ClassNotFoundException, SQLException {
        String sql = "select * from chitietmuontra where idMuonTra =" + MuonTra.docMaMuonTra() + ";";

        ArrayList<PhieuMuonTraType> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new PhieuMuonTraType(
                    resultSet.getInt("idMuonTra"),
                    resultSet.getInt("idSach"),
                    getTenSach(resultSet.getInt("idSach")),
                    resultSet.getDate("ngayTra"),
                    resultSet.getDouble("tienPhat")
            ));

        }
        connection.close();
        return list;

    }
    public static String getTenSach(int maSach) {

        String tenSach = "";
       
        String sql = "select tenSach from sach where idSach =' " + maSach + "'; ";
        try {
            KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                tenSach = resultSet.getString("tenSach");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return tenSach;
    }
}
