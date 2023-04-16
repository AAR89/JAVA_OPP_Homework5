package Phonebook;

import java.util.HashMap;

public class delPB extends Methods{

    //delPB - удаляет запись по номеру телефона
    delPB(String phone) {
        pb.remove(phone);
    }


}
