package Seminar1;

public class Task2 {
    public static void main(String[] args) {
        boolean check = true;

        for(int i = 2; i <= 1000; i++){
            check = true;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0 && i != j) {
                    check = false;
                }
            }
            if(check == true) System.out.println(i);
        }
    }
}
