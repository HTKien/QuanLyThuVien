
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
public class ThongKeDocGiaTheoDiaChi {
    private String diaChi; 
    private int soLuong; 

    public ThongKeDocGiaTheoDiaChi() {
    }

    public ThongKeDocGiaTheoDiaChi(String diaChi, int soLuong) {
        this.diaChi = diaChi;
        this.soLuong = soLuong;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public static ArrayList<ThongKeDocGiaTheoDiaChi> getList() throws ClassNotFoundException, SQLException {
        String sql = "SELECT COUNT(idDocGia), diaChiDocGia FROM docgia GROUP BY diaChiDocGia ORDER BY COUNT(idDocGia) DESC;";

        ArrayList<ThongKeDocGiaTheoDiaChi> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new ThongKeDocGiaTheoDiaChi(
                    resultSet.getString("diaChiDocGia"),
                    resultSet.getInt("COUNT(idDocGia)")
            ));
        }
        connection.close();
        return list;

    }
    
}
