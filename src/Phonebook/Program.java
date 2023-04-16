package Phonebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        //переменная описывает вызываемое действие
        String act;

        //загрузка БД
        new loadPB();
        //вывод записей на екран
        new PrintPhonebook();

        //вывод на екран описания возможных действий с указанием команд
        System.out.println("выбор действия: (1)добавить данные, (2)удалить данные, (3) найти номера по фамилии, " +
                "(4)найти фамилию, (5)сохранить, (6)выход");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();
        while (!act.equals("6")) {
            //добавление записи
            if (act.equals("1")) {
                System.out.println("Введите фамилию:");
                String name = bf.readLine();
                System.out.println("Введите телефон:");
                String phone = bf.readLine();
                new addPB(phone, name);
            } else {
                //удаление записи
                if (act.equals("2")) {
                    System.out.println("Введите телефон:");
                    String phone = bf.readLine();
                    new delPB(phone);
                } else {
                    //поиск номеров по фамилии
                    if (act.equals("3")) {
                        System.out.println("Введите фамилию:");
                        String surname = bf.readLine();
                        String[] numbers = new String[0];
                        for (String number : numbers) {
                            System.out.println(number);
                        }
                    } else {
                        //поиск фамилии по номеру
                        if (act.equals("4")) {
                            System.out.println("Введите номер:");
                            String number = bf.readLine();
                            System.out.println(new FindSurname());
                        } else {
                            //сохранение БД в файл
                            if (act.equals("5")) {
                                new savePB();
                            }
                        }
                    }
                }
            }
            //запрос на следующее действие
            System.out.println("выбор действия: (1)добавить данные, (2)удалить данные, (3) найти номера по фамилии, " +
                    "(4)найти фамилию, (5)сохранить, (6)выход");
            act = bf.readLine();
        }
    }
}
