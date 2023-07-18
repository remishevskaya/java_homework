package Seminar4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Введите второе число: ");
        int num2 = Integer.parseInt(sc.nextLine());

        Deque<Integer> listNumber1 = new LinkedList<>();
        Deque<Integer> listNumber2 = new LinkedList<>();

        int mult1 = 1;
        int mult2 = 1;

        if(num1 < 0) {
            num1 = num1 * (-1);
            mult1 = -1;
        }

        if(num2 < 0) {
            num2 = num2 * (-1);
            mult2 = -1;
        }

        while(num1 != 0){
            if(num1 < 10){
                listNumber1.addLast(num1 % 10 * mult1);
            } else {
                listNumber1.addLast(num1 % 10);
            }
            num1 = num1 / 10;
        }

        while(num2 != 0){
            if(num2 < 10){
                listNumber2.addLast(num2 % 10 * mult2);
            } else {
                listNumber2.addLast(num2 % 10);
            }
            num2 = num2 / 10;
        }

        sc.close();

        System.out.printf("Произведение чисел: %d\n", multiplication(listNumber1, listNumber2));
        // System.out.printf("Сумма чисел: %d\n", summa(listNumber1, listNumber2));


        
    }

    static int multiplication(Deque<Integer> list1, Deque<Integer> list2){
        int num1 = 0;
        int num1Size = list1.size();
        int mult1 = 1;
        
        int num2 = 0;
        int num2Size = list2.size();
        int mult2 = 1;

        if(list1.getLast() < 0){
            mult1 = -1;
        }

        if(list2.getLast() < 0){
            mult2 = -1;
        }
        
        for (int i = 0; i < num1Size; i++){
            if(i == num1Size - 1) num1 = num1 + list1.pollFirst() * (int) Math.pow(10, i) * mult1;
            else num1 = num1 + list1.pollFirst() * (int) Math.pow(10, i);
        }

        for (int i = 0; i < num2Size; i++){
            if(i == num2Size - 1) num2 = num2 + list2.pollFirst() * (int) Math.pow(10, i) * mult2;
            else num2 = num2 + list2.pollFirst() * (int) Math.pow(10, i);
        }

        return num1*mult1 * num2*mult2;
    }

    static int summa(Deque<Integer> list1, Deque<Integer> list2){
        
        int num1 = 0;
        int num1Size = list1.size();
        int mult1 = 1;
        
        int num2 = 0;
        int num2Size = list2.size();
        int mult2 = 1;

        if(list1.getLast() < 0){
            mult1 = -1;
        }

        if(list2.getLast() < 0){
            mult2 = -1;
        }
        
        for (int i = 0; i < num1Size; i++){
            if(i == num1Size - 1) num1 = num1 + list1.pollFirst() * (int) Math.pow(10, i) * mult1;
            else num1 = num1 + list1.pollFirst() * (int) Math.pow(10, i);
        }

        for (int i = 0; i < num2Size; i++){
            if(i == num2Size - 1) num2 = num2 + list2.pollFirst() * (int) Math.pow(10, i) * mult2;
            else num2 = num2 + list2.pollFirst() * (int) Math.pow(10, i);
        }

        return num1*mult1 + num2*mult2;

    }


    
}
