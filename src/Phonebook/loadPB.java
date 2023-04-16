package Phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class loadPB extends Methods{

    //loadPB - загружает БД из текстового файла phone.txt
    //производит проверку на наличие файла
    public loadPB() throws IOException {
        File file = new File("phone.txt");
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader("phone.txt"));
            String act;
            while ((act = reader.readLine()) != null) {
                String[] dat = act.split(" ");
                pb.put(dat[0], dat[1]);
            }
            reader.close();
        }
    }

}
