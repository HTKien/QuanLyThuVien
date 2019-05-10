
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
public class ThongKeDocGiaTheoNgheNghiep {
    private String ngheNghiep ;
    private int soLuong ;

    public ThongKeDocGiaTheoNgheNghiep() {
    }

    public ThongKeDocGiaTheoNgheNghiep(String ngheNghiep, int soLuong) {
        this.ngheNghiep = ngheNghiep;
        this.soLuong = soLuong;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public static ArrayList<ThongKeDocGiaTheoNgheNghiep> getList() throws ClassNotFoundException, SQLException {
        String sql = "SELECT COUNT(idDocGia), ngheNghiepDocGia FROM docgia GROUP BY ngheNghiepDocGia ORDER BY COUNT(idDocGia) DESC;";

        ArrayList<ThongKeDocGiaTheoNgheNghiep> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new ThongKeDocGiaTheoNgheNghiep(
                    resultSet.getString("ngheNghiepDocGia"),
                    resultSet.getInt("COUNT(idDocGia)")
            ));
        }
        connection.close();
        return list;

    }
    
}
