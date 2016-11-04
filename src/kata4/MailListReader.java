package kata4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MailListReader {

    public static ArrayList<String> read(String fileName) throws IOException {
        
        ArrayList<String> mailList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        String mail;
        while((mail=reader.readLine()) != null){
            if(!mail.contains("@")) continue;
            mailList.add(mail);
        }
        reader.close();
        return mailList;
    }
}
