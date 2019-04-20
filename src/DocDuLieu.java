
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MyPC
 */
public class DocDuLieu {
    public static void main(String[] args) throws SQLException {
        Connection conn=KetNoiQLTV.getJDBCConnection();
        if(conn !=null){
            System.out.println("Kết nối thành công!");
        }else{
            System.out.println("Kết nối thất bại!");
        }
        System.out.println("Đọc dữ liệu từ bảng 'sach' trong mysql:  ");
        String sql = "SELECT *FROM sach"; 
        PreparedStatement preparS = conn.prepareStatement(sql); 
        ResultSet resultS = preparS.executeQuery();
        while(resultS.next()){
        System.out.println(resultS.getInt(1)+"   "+resultS.getString(2)+" "+resultS.getString(3));
        }
    }
}
    
    
    
    
    
    
    
                        
    
    

