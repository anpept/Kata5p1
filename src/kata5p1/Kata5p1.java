package kata5p1;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;



public class Kata5p1 {

    
    public static void main(String[] args) throws SQLException, IOException {
        CreateTableApp.createNewTable("email");
        
        String fichero = "email.txt";
        List<String> emailLista = MailListReader.read(fichero);
        for (int i = 0; i < emailLista.size(); i++) {
            InsertData.insert(emailLista.get(i));            
        }
        SelectApp app = new SelectApp();
        app.selectAll(); 
        
    }    
}
