package Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите длину списка: ");
        int n = Integer.parseInt(scan.nextLine());

        scan.close();

        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>(n);
        for (int index = 0; index < n; index++) {
            numbers.add(rand.nextInt(100));
        }

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        deleteEven(numbers);
        maxNumber(numbers);
        minNumber(numbers);
        averageNumber(numbers);
        
        
    }


    static void deleteEven(ArrayList<Integer> list) {
        ArrayList<Integer> copyList = (ArrayList) list.clone();
        for (int index = 0; index < copyList.size(); index++) {
            if(copyList.get(index) % 2 == 0) list.remove(list.indexOf(copyList.get(index)));
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    static void maxNumber(ArrayList<Integer> list) {
        System.out.printf("Максимальное значение - %d\n", Collections.max(list));
    }

    static void minNumber(ArrayList<Integer> list) {
        System.out.printf("Минимальное значение - %d\n", Collections.min(list));
    }

    static void averageNumber(ArrayList<Integer> list){
        int listSum = 0;
        for (int number : list)
            listSum = listSum + number;
        int avaregeNum = listSum / list.size();
        System.out.printf("Среднее значение - %d\n", avaregeNum);
    }

}
