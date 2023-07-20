package Seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Map<String, List> phoneDictionary = new HashMap<>();
        List<String> phones = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду:" +
                    "\n 1 - добавить телефон" +
                    "\n 2 - вывести словарь " +
                    "\n 3 - завершить работу программы ");
            String command = input.nextLine();

            if (command.equals("3")) {
                System.exit(0);
            } else if (command.equals("1")) {

                System.out.println("Введите имя: ");
                String person = input.nextLine();
                System.out.println("Введите номер телефона: ");
                String phone = input.nextLine();

                if (phoneDictionary.containsKey(person)) {
                    List<String> newPhones = phoneDictionary.get(person);
                    newPhones.add(phone);
                    phoneDictionary.put(person, newPhones);
                } else {
                    phones.clear();
                    phones.add(phone);
                    phoneDictionary.put(person, phones);
                }

            } else if (command.equals("2")) {

                for (Map.Entry<String, List> i : phoneDictionary.entrySet()) {
                    System.out.println(i.getKey());
                    System.out.println(i.getValue());
                }
            }
        }
    }

    private static Map<String, List> getTreeMap(Map<String, List> phoneDictionary) {
        return null;
    }

}
