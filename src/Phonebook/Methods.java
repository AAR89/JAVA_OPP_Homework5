package Phonebook;

import java.util.HashMap;

public class Methods implements Menu<String> {

    public static final HashMap<String, String> pb = new HashMap<>();

    public String surname;
    public String phone;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String delPB() {
        return null;
    }

    @Override
    public String addPB() {
        return null;
    }

    @Override
    public String savePB() {
        return null;
    }

    @Override
    public String loadPB() {
        return null;
    }

    @Override
    public String PrintPhonebook() {
        return null;
    }

    @Override
    public String FindSurname() {
        return null;
    }

    @Override
    public String FindNumberPhone() {
        return null;
    }
}
