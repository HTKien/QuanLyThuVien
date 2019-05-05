
import com.sun.org.apache.bcel.internal.generic.DCMPG;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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

    public DocGiaType(int idDocGia, String tenDocGia, String gioiTinhDocGia, String namSinhDocGia, String sdtDocGia, String diaChiDocGia, String emailDocGia, String ngheNgiepDocGia) {
        this.idDocGia = idDocGia;
        this.tenDocGia = tenDocGia;
        this.gioiTinhDocGia = gioiTinhDocGia;
        this.namSinhDocGia = namSinhDocGia;
        this.sdtDocGia = sdtDocGia;
        this.diaChiDocGia = diaChiDocGia;
        this.emailDocGia = emailDocGia;
        this.ngheNgiepDocGia = ngheNgiepDocGia;
    }

    public DocGiaType() {
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
    public static ArrayList<DocGiaType> getList() throws ClassNotFoundException, SQLException {
        String sql = "select * from docgia ; ";
        ArrayList<DocGiaType> list = new ArrayList<>();
        KetNoiQLTV ketNoiQLTV = new KetNoiQLTV();
        Connection connection = ketNoiQLTV.getJDBCConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            list.add(new DocGiaType(
                    resultSet.getInt("idDocGia"),
                    resultSet.getString("tenDocGia"),
                    resultSet.getString("gioiTinhDocGia"),
                    resultSet.getString("namSinhDocGia"),
                    resultSet.getString("sdtDocGia"),
                    resultSet.getString("diaChiDocGia"),
                    resultSet.getString("emailDocGia"),
                    resultSet.getString("ngheNghiepDocGia")));
        }
        connection.close();
        return list;

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<DocGiaType> listDocGiaTypes = new ArrayList<>();
        listDocGiaTypes = getList();
        int a = listDocGiaTypes.size();
        System.out.println(a);
        System.out.println("Ten doc gia dau tien la :" + listDocGiaTypes.get(0).getTenDocGia());
        System.out.println("id doc gia dau tien la: " + listDocGiaTypes.get(0).getIdDocGia());
        System.out.println("ma doc gia cua  cua toan bo  danh sach la: ");
        for (int i = 0; i < a; i++) {
            System.out.println(listDocGiaTypes.get(i).getIdDocGia());

        }
    }

    public static int add(DocGiaType o) {
        String sql = "insert into docgia values("
                + o.getIdDocGia() + ", '"
                + o.getTenDocGia() + "',' "
                + o.getGioiTinhDocGia() + "', '"
                + o.getNamSinhDocGia()+ "', '"
                + o.getSdtDocGia() + "', '"
                + o.getDiaChiDocGia() + "', '"
                + o.getEmailDocGia() + "', '"
                + o.getNgheNgiepDocGia() + "'"
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
