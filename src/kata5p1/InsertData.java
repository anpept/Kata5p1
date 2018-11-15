package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void insert(String email) throws SQLException{
        String url = "jdbc:sqlite:Kata5.db";
        String sql = "INSERT INTO email (direccion) VALUES(?)";
        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, email);
            pstmt.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }    
}
