package Phonebook;

public interface Menu<N> {
    //addPB - добавляет запись по заданным номеру телефона и фамилии

    N delPB();

    N addPB();

    N savePB();

    N loadPB();

    N PrintPhonebook();

    public N FindSurname();

    public N FindNumberPhone();
}
