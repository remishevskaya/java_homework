package Seminar6;

import java.time.LocalDateTime;
import java.util.Date;

public class Cat {
    String name;
    int age;
    String breed;
    boolean fed; // статус покормленности кота
    String mood;

    void feed(String name, int age, String breed, boolean fed){
        String food = "Кот" + " " + name + " " + "был покормлен кормом ";
        if(!fed){
            if(age <= 2){
                food = food + "для молодых ";
            } else if(age > 2 & age < 7) {
                food = food + "для взрослых ";
            } else if(age > 7) {
                food = food + "для пожилых ";
            }
            if(breed == "Шотландский"){
                food = food + "шотландских котов";
            }
            else if(breed == "Персидский"){
                food = food + "персидских котов";
            }
            else if(breed == "Мейн-кун"){
                food = food + "мейн-кунов";
            }
            System.out.println(food);
        } else {
            System.out.println("Кот уже покормлен");
        }
    }

    String getMood(){
        int hour = LocalDateTime.now().getHour();
        if(hour > 10 & hour < 14){
            mood = "Хорошее";
        } else if(hour > 19 & hour < 23){
            mood = "Хорошее";
        }
        else {
            mood = "Плохое";
        }
        return mood;
    }
    
    void pet(String mood){
        if(mood == "Хорошее"){
            System.out.println("Можно погладить");
        }
        else if(mood == "Плохое"){
            System.out.println("Нельзя погладить");
        }
    }
}
