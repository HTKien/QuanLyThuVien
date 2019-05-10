
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
public class ThongKeDocGiaTheoNamSinh {
    
    private String namSinh ; 
    private int soLuong ;

    public ThongKeDocGiaTheoNamSinh() {
    }

    public ThongKeDocGiaTheoNamSinh(String namSinh, int soLuong) {
        this.namSinh = namSinh;
        this.soLuong = soLuong;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
    public static ArrayList<ThongKeDocGiaTheoNamSinh> getList() throws ClassNotFoundException, SQLException {
        String sql = "SELECT COUNT(idDocGia), namSinhDocGia FROM docgia GROUP BY namSinhDocGia ORDER BY namSinhDocGia;";

        ArrayList<ThongKeDocGiaTheoNamSinh> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new ThongKeDocGiaTheoNamSinh(
                    resultSet.getString("namSinhDocGia"),
                    resultSet.getInt("COUNT(idDocGia)")
            ));
        }
        connection.close();
        return list;

    }
    
}
