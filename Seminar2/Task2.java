package Seminar2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {
    /**
     * @param args
     * @throws IOException
     * @throws SecurityException
     */
    public static void main(String[] args) throws SecurityException, IOException {
        int[] numbers = new int[] { 2, 10, 25, 8, 10, 11, 45, 34, 60, 7 };

        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("Log.txt");

        logger.addHandler(fh);

        SimpleFormatter simple = new SimpleFormatter();
        fh.setFormatter(simple);

        boolean check = false;

        while (check == false) {
            check = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    check = false;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
                String numbersLog = "";
                for (Integer num : numbers) {
                    numbersLog = numbersLog + " " + num.toString();
                }
                logger.info(numbersLog);
            }
        }


    }
}
