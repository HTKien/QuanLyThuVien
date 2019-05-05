
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
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
public class MuonTraType {

    private int idMuonTra;
    private int idNhanVien;
    private int idDocGia;
    private Date ngayMuon;
    private Date ngayHenTra;
    private double tienCoc;

    public MuonTraType() {
    }

    public MuonTraType(int idMuonTra, int idNhanVien, int idDocGia, Date ngayMuon, Date ngayHenTra, double tienCoc) {
        this.idMuonTra = idMuonTra;
        this.idNhanVien = idNhanVien;
        this.idDocGia = idDocGia;
        this.ngayMuon = ngayMuon;
        this.ngayHenTra = ngayHenTra;
        this.tienCoc = tienCoc;
    }

    public int getIdMuonTra() {
        return idMuonTra;
    }

    public void setIdMuonTra(int idMuonTra) {
        this.idMuonTra = idMuonTra;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public int getIdDocGia() {
        return idDocGia;
    }

    public void setIdDocGia(int idDocGia) {
        this.idDocGia = idDocGia;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getNgayHenTra() {
        return ngayHenTra;
    }

    public void setNgayHenTra(Date ngayHenTra) {
        this.ngayHenTra = ngayHenTra;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public static ArrayList<MuonTraType> getList() throws ClassNotFoundException, SQLException {
        String sql = "select * from muon_tra ; ";
        ArrayList<MuonTraType> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new MuonTraType(
                    resultSet.getInt("idMuonTra"),
                    resultSet.getInt("idNhanVien"),
                    resultSet.getInt("idDocGia"),
                    resultSet.getDate("ngayMuon"),
                    resultSet.getDate("ngayHenTra"),
                    resultSet.getDouble("tienCoc")));

        }
        connection.close();
        return list;

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<MuonTraType> list = new ArrayList<>();
        list = getList();
        System.out.println("so phan tu trong list la: " + list.size());

    }

    public static int add(MuonTraType o) {
        String sql = "insert into muon_tra values("
                + o.getIdMuonTra() + ","
                + o.getIdNhanVien() + ", "
                + o.getIdDocGia() + ", '"
                + new SimpleDateFormat("yyyy-MM-dd").format(o.getNgayMuon()) + "', '"
                + new SimpleDateFormat("yyyy-MM-dd").format(o.getNgayHenTra()) + "', '"
                + o.getTienCoc() + "'"
                + ");";
        return interact(sql);
    }

    public static int interact(String sql) {
        int result = -1;
        try {
            KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
            Connection connection = ketNoiQLTV.getJDBCConnection();
            Statement statement = connection.createStatement();
            result = statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
