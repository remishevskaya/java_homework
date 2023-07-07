package Seminar1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение с неизвестными: ");
        String phrase = sc.nextLine();
        phrase = phrase.replace(" ", "");

        String[] numbers = phrase.split("[+|=]");

        int[] arrayNum = new int[3];
        int[] arrayBit = new int[]{-1,-1,-1};

        int count = -1;

        for (String number : numbers) {
            count++;
            for (int i = 0; i < number.length(); i++) {
                String dev = "?";
                if (number.charAt(number.length() - 1 - i) == dev.charAt(0)) {
                    arrayBit[count] = i;
                } else {
                    int num = 0;
                    num = number.charAt(number.length() - 1 - i) - '0';
                    arrayNum[count] = arrayNum[count] + num * (int) Math.pow(10, i);
                }
            }
        }

        int[] mult = new int[3];
        for (int index = 0; index < arrayBit.length; index++) {
            if(arrayBit[index] == -1) mult[index] = 0;
            else mult[index] = 1;  
        } 

        boolean check = false;

        for (int i = 0; i <= 9; i++) { 
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if(arrayNum[0] + (int) Math.pow(10, arrayBit[0]) * i * mult[0] + 
                    arrayNum[1] + (int) Math.pow(10, arrayBit[1]) * j * mult[1] == 
                    arrayNum[2] + (int) Math.pow(10, arrayBit[2]) * j * mult[2]){
                        System.out.println("Решением уравнения являются числа: ");
                        System.out.println(arrayNum[0] + (int) Math.pow(10, arrayBit[0]) * i * mult[0]);
                        System.out.println(arrayNum[1] + (int) Math.pow(10, arrayBit[1]) * j * mult[1]);
                        System.out.println(arrayNum[2] + (int) Math.pow(10, arrayBit[2]) * j * mult[2]);
                        check = true;
                        break;
                    }
                }
            }
        }

        if(check == false) System.out.println("Решений у данного выражения нет");

        sc.close();

    }

}
