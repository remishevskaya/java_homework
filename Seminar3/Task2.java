package Seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        planetList(10);
    }

    static void planetList(int listLength){
        List<String> listPlanets = List.of("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун");
        ArrayList<String> randPlanets = new ArrayList<>(listLength);
        int[] counts = new int[listPlanets.size()];

        Random rand = new Random();

        for (int i = 0; i < listLength; i++){
            randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.print(randPlanets.get(i) + " ");
            counts[listPlanets.indexOf(randPlanets.get(i))]++;
        }
        System.out.println();

        for (int index = 0; index < counts.length; index++) {
            System.out.printf("%s - %s\n", listPlanets.get(index), counts[index]);
        }

        
        ArrayList<Integer> copyPlanets = (ArrayList) randPlanets.clone();
        for (int index = 0; index < copyPlanets.size(); index++) {
            if(counts[listPlanets.indexOf(copyPlanets.get(index))] > 1) {
                randPlanets.remove(copyPlanets.get(index));
            }
        }

        for (String planet : randPlanets) {
            System.out.print(planet + " ");
        }
    
            


        

    }
}
