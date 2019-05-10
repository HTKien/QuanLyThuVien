
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
public class ThongKeDocGiaTheoGioiTinh {
    
    private String gioiTinh ; 
    private int soLuong; 

    public ThongKeDocGiaTheoGioiTinh() {
    }

    public ThongKeDocGiaTheoGioiTinh(String gioiTinh, int soLuong) {
        this.gioiTinh = gioiTinh;
        this.soLuong = soLuong;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public static ArrayList<ThongKeDocGiaTheoGioiTinh> getList() throws ClassNotFoundException, SQLException {
        String sql = "SELECT COUNT(idDocGia), gioiTinhDocGia FROM docgia GROUP BY gioiTinhDocGia ORDER BY COUNT(idDocGia) DESC;";

        ArrayList<ThongKeDocGiaTheoGioiTinh> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new ThongKeDocGiaTheoGioiTinh(
                    resultSet.getString("gioiTinhDocGia"),
                    resultSet.getInt("COUNT(idDocGia)")
            ));
        }
        connection.close();
        return list;

    }
    
}
