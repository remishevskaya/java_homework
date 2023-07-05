package Seminar1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String num1 = sc.nextLine();
        System.out.println("Введите второе число: ");
        String num2 = sc.nextLine();

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        System.out.println("Выберите действие:" +
                "\n 1 - сложение" +
                "\n 2 - вычитание " +
                "\n 3 - умножение" +
                "\n 4 - деление");
        String choice = sc.nextLine();

        switch (choice) {
            case ("1"):
                Summa(number1, number2);
                break;
            case ("2"):
                Subtraction(number1, number2);
                break;
            case ("3"):
                Multiplication(number1, number2);
                break;
            case ("4"):
                Division(number1, number2);
                break;
        }

        sc.close();

    }

    public static void Summa(int number1, int number2) {
        int summa = number1 + number2;
        System.out.printf("Сумма чисел равна: %d\n", summa);
    }

    public static void Subtraction(int number1, int number2) {
        int subtraction = number1 - number2;
        System.out.printf("Разница чисел равна: %d\n", subtraction);
    }

    public static void Multiplication(int number1, int number2) {
        int multiplication = number1 * number2;
        System.out.printf("Результат умножения чисел равен: %d\n", multiplication);
    }

    public static void Division(int number1, int number2) {
        try {
            int division = number1 / number2;
            System.out.printf("Частное чисел равно: %d\n", division);
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 запрещено");
        }

    }
}
