
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
public class DocGiaType {

    //cac thuoc tinh: 

    private int idDocGia;
    private String tenDocGia;
    private String gioiTinhDocGia;
    private String namSinhDocGia;
    private String sdtDocGia;
    private String diaChiDocGia;
    private String emailDocGia;
    private String ngheNgiepDocGia;
    //cac phuong thuc khoi tao : 

    public DocGiaType() {
    }

    private DocGiaType(int aInt, String string, String string0, String string1, String string2, String string3, String string4, String string5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdDocGia() {
        return idDocGia;
    }

    public void setIdDocGia(int idDocGia) {
        this.idDocGia = idDocGia;
    }

    public String getTenDocGia() {
        return tenDocGia;
    }

    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }

    public String getGioiTinhDocGia() {
        return gioiTinhDocGia;
    }

    public void setGioiTinhDocGia(String gioiTinhDocGia) {
        this.gioiTinhDocGia = gioiTinhDocGia;
    }

    public String getNamSinhDocGia() {
        return namSinhDocGia;
    }

    public void setNamSinhDocGia(String namSinhDocGia) {
        this.namSinhDocGia = namSinhDocGia;
    }

    public String getSdtDocGia() {
        return sdtDocGia;
    }

    public void setSdtDocGia(String sdtDocGia) {
        this.sdtDocGia = sdtDocGia;
    }

    public String getDiaChiDocGia() {
        return diaChiDocGia;
    }

    public void setDiaChiDocGia(String diaChiDocGia) {
        this.diaChiDocGia = diaChiDocGia;
    }

    public String getEmailDocGia() {
        return emailDocGia;
    }

    public void setEmailDocGia(String emailDocGia) {
        this.emailDocGia = emailDocGia;
    }

    public String getNgheNgiepDocGia() {
        return ngheNgiepDocGia;
    }

    public void setNgheNgiepDocGia(String ngheNgiepDocGia) {
        this.ngheNgiepDocGia = ngheNgiepDocGia;
    }

    //hàm để load dữ liệu lên một  arraylist: 

    public static  ArrayList<DocGiaType> loadListDocGia() throws SQLException {
        ArrayList<DocGiaType> listDocGias = new ArrayList<>();
        String sql = " select * from docgia ; ";
        //ket noi database : 
        Connection connection = new KetNoiQLTV().getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            listDocGias.add(new DocGiaType(
                    resultSet.getInt("idDocGia"),
                    resultSet.getString("tenDocGia"),
                    resultSet.getString("gioiTinhDocGia"),
                    resultSet.getString("namSinhDocGia"),
                    resultSet.getString("sdtDocGia"),
                    resultSet.getString("diaChiDocGia"),
                    resultSet.getString("emailDocGia"),
                    resultSet.getString("ngheNghiepDocGia")
            ));
        }
        //dong ket noi 
        connection.close();
        return listDocGias;
    }

}
