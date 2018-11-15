package kata5p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {
    
    public static List<String> read (String fileName) throws FileNotFoundException, IOException{
        List <String> lista = new ArrayList();
        BufferedReader reader = new BufferedReader (new FileReader(new File (fileName)));
        String linea;
        while ((linea = reader.readLine()) != null){
            if (linea.contains("@")){
                lista.add(linea);
            }
        }
    reader.close();
    return lista;
    }   
}

