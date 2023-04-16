package Phonebook;

import java.util.HashMap;
import java.util.Map;

public class PrintPhonebook extends Methods{

    //PrintPhonebook - выводит на екран все записи БД
    public PrintPhonebook() {
        System.out.println("Телефонный справочник: ");
        for (Map.Entry<String, String> k : pb.entrySet()) {
            System.out.println(k.getValue() + ": " + k.getKey());
        }
    }

}
