package Seminar2;

import java.io.File;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        String pathDirectory = System.getProperty("user.dir");
        fileFormat(showCurrentFiles(pathDirectory));
        
    }

    static String[] showCurrentFiles(String dirPath){
        File currentDir = new File(dirPath);
        return currentDir.list();
    }

    static void fileFormat(String [] dir){
        for (String file : dir) {
            String name = file.toString();
            String[] format = name.split("[.]");
            if(format.length > 1) {
                System.out.printf("Расширение файла: %s\n", format[1]);
            }
            else {
                System.out.println("Расширение файла: ");
            }
        }
    }
}