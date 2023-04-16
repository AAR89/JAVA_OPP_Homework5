package Phonebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class savePB extends Methods {
    //savePB - сохраняет БД в текстовом файле phone.txt
    savePB() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("phone.txt"));
        for (Map.Entry<String, String> k : pb.entrySet()) {
            writer.write(k.getKey() + " " + k.getValue() + System.lineSeparator());
        }
        writer.close();
    }

}
