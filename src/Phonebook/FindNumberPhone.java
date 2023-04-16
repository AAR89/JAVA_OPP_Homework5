package Phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindNumberPhone extends Methods {

    public FindNumberPhone(String surname) {
    }

    //FindNumberPhone - производит поиск списка номеров по фамилии заданой в качестве аргумента
    //возвращает массив строк
    public static String[] FindNumberPhone(String surname) {
        List<String> result = new ArrayList<>();
        for (Map.Entry entry : pb.entrySet()) {
            if (surname.equalsIgnoreCase((String) entry.getValue())) {
                result.add((String) entry.getKey());
            }
        }
        if (result.size() == 0) result.add("абонент с такой фамилией не найден");
        return result.toArray(new String[0]);
    }

    @Override
    public String toString() {
        return "FindNumberPhone{" +
                "surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
