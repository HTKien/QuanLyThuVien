
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiQLTV {

    public static Connection getJDBCConnection(){
        final String url ="jdbc:mysql://localhost:3306/quan_ly_thu_vien?useUnicode=true&characterEncoding=utf-8"; 
        final String password="175065539"; 
        final String user = "root"; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            return DriverManager.getConnection(url, user, password); 
        } catch (ClassNotFoundException | SQLException e) {
        }
        return null; 
    }
    public static void main(String[] args) throws SQLException {
        //ket noi java voi mysql 
        Connection conn = getJDBCConnection() ;
        if(conn!=null){
                System.out.println(" Kết nối thành công với cơ sở dữ liệu!");

        }else{
                System.out.println("Kết nối thất bại");

        }
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/quan_ly_thu_vien","root","");
//            if(conn!=null){
//                System.out.println(" Kết nối thành công với cơ sở dữ liệu!");
//            }
//        } catch (SQLException e) { 
//                System.out.println("Kết nối thất bại");
//        }
        //doc du lieu tu mysql 
        
    }
}
