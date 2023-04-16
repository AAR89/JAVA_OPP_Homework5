package Phonebook;

public class FindSurname extends Methods {

    public FindSurname() {
    }

    //FindSurname - производит поиск фамилии по номеру телефона заданому в качестве аргумента
    //возвращает строку
    public String FindSurname(String number) {
        String result = pb.get(number);
        if (result == null) return "абонент с таким номером не найдей";
        return result;
    }

    @Override
    public String toString() {
        return "FindSurname{" +
                "surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
