
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
public class ThongKeDocGiaType {
    private String thuocTinh; 
    private int soLuong; 

    public ThongKeDocGiaType() {
    }

    public ThongKeDocGiaType(String thuocTinh, int soLuong) {
        this.thuocTinh = thuocTinh;
        this.soLuong = soLuong;
    }

    public String getThuocTinh() {
        return thuocTinh;
    }

    public void setThuocTinh(String thuocTinh) {
        this.thuocTinh = thuocTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public static ArrayList<ThongKeDocGiaType> getList(String tieuChi) throws ClassNotFoundException, SQLException {
        String sql = "SELECT COUNT(idDocGia), "+tieuChi+"  FROM docgia GROUP BY  "+tieuChi+"   ORDER BY COUNT(idDocGia) DESC;";

        ArrayList<ThongKeDocGiaType> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new ThongKeDocGiaType(
                    resultSet.getString(""+tieuChi),
                    resultSet.getInt("COUNT(idDocGia)")
            ));
        }
        connection.close();
        return list;

    }
    
}
