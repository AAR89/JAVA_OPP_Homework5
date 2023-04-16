package Phonebook;

import java.util.HashMap;

public class addPB extends Methods{
    //addPB - добавляет запись по заданным номеру телефона и фамилии

    addPB(String phone, String name) {
        pb.put(phone, name);
    }
}
