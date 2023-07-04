import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер треугольного числа: ");
        String number = sc.nextLine();
        
        int count = Integer.parseInt(number);
        int result = 0;
        
        for(int i = 1; i <= count; i++){
            result = result + i;
        }

        System.out.println(result);
        
    }
}