package Seminar6;

public class Task1 {
    public static void main(String[] args) {
        Cat Barsik = new Cat();
        Barsik.name = "Барсик";
        Barsik.age = 2;
        Barsik.breed =  "Шотландский";
        Barsik.fed = false;

        Barsik.feed(Barsik.name, Barsik.age, Barsik.breed, Barsik.fed);
        Barsik.pet(Barsik.getMood());
    }
}
