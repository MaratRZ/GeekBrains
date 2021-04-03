package com.company.homework_01_07;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 25);
        cats[1] = new Cat("Murzik", 35);
        cats[2] = new Cat("Ryzhik", 45);

        for (Cat cat : cats) {
            cat.eat(plate);
            if (cat.isSatiety()) {
                System.out.println("Кот " + cat.getName() + " сыт");
            } else {
                System.out.println("Кот " + cat.getName() + " голоден");
            }
        }
        plate.info();
    }
}
