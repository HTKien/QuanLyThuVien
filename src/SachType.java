
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
public class SachType {

    //thuoc tinh: 
    private int idSach;
    private String tenSach;
    private String theLoaiSach;
    private String namXuatBanSach;
    private String nhaXuatBanSach;
    private String tenTacGia;
    private double giaTien;
    private int soLuong;

    public SachType() {
    }

    public SachType(int idSach, String tenSach, String theLoaiSach, String namXuatBanSach, String nhaXuatBanSach, String tenTacGia, double giaTien, int soLuong) {
        this.idSach = idSach;
        this.tenSach = tenSach;
        this.theLoaiSach = theLoaiSach;
        this.namXuatBanSach = namXuatBanSach;
        this.nhaXuatBanSach = nhaXuatBanSach;
        this.tenTacGia = tenTacGia;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
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

    public String getTheLoaiSach() {
        return theLoaiSach;
    }

    public void setTheLoaiSach(String theLoaiSach) {
        this.theLoaiSach = theLoaiSach;
    }

    public String getNamXuatBanSach() {
        return namXuatBanSach;
    }

    public void setNamXuatBanSach(String namXuatBanSach) {
        this.namXuatBanSach = namXuatBanSach;
    }

    public String getNhaXuatBanSach() {
        return nhaXuatBanSach;
    }

    public void setNhaXuatBanSach(String nhaXuatBanSach) {
        this.nhaXuatBanSach = nhaXuatBanSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    //ham load list sach: 
    public static ArrayList<SachType> getList() throws ClassNotFoundException, SQLException {
        String sql = "select * from sach ; ";
        ArrayList<SachType> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new SachType(
                    resultSet.getInt("idSach"),
                    resultSet.getString("tenSach"),
                    resultSet.getString("theLoaiSach"),
                    resultSet.getString("namXuatBanSach"),
                    resultSet.getString("nhaXuatBanSach"),
                    resultSet.getString("tenTacGia"),
                    resultSet.getDouble("giaTien"),
                    resultSet.getInt("soLuong")));

        }
        connection.close();
        return list;

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<SachType> listSachTypes = new ArrayList<>();
        listSachTypes = getList();

        System.out.println("Tong so sach trong thu vien  la : " + listSachTypes.size());
    }

    public static int add(SachType o) {
        String sql = "insert into sach values("
                + o.getIdSach() + ", '"
                + o.getTenSach() + "',' "
                + o.getTheLoaiSach() + "', '"
                + o.getNamXuatBanSach() + "', '"
                + o.getNhaXuatBanSach() + "', '"
                + o.getTenTacGia() + "', '"
                + o.getGiaTien() + "', '"
                + o.getSoLuong()+ "'"
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
