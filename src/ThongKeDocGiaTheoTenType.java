
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
public class ThongKeDocGiaTheoTenType {

    private String ten;
    private int soLuong;

    public ThongKeDocGiaTheoTenType() {
    }

    public ThongKeDocGiaTheoTenType(String ten, int soLuong) {
        this.ten = ten;
        this.soLuong = soLuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public static ArrayList<ThongKeDocGiaTheoTenType> getList() throws ClassNotFoundException, SQLException {
        String sql = "SELECT COUNT(idDocGia), tenDocGia FROM docgia GROUP BY tenDocGia ORDER BY COUNT(idDocGia) DESC;";

        ArrayList<ThongKeDocGiaTheoTenType> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new ThongKeDocGiaTheoTenType(
                    resultSet.getString("tenDocGia"),
                    resultSet.getInt("COUNT(idDocGia)")
            ));
        }
        connection.close();
        return list;

    }

}
