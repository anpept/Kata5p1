package kata5p1;

import java.sql.SQLException;



public class Kata5p1 {

    
    public static void main(String[] args) throws SQLException {
        SelectApp app = new SelectApp();
        app.selectAll(); 
        CreateTableApp.createNewTable();
    }    
}
