package com.company.homework_01_06;

public class Main {

    public static void main(String[] args) {
        System.out.println("-- Собаки --");
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Тузик");
        dog1.run(150);
        dog1.swim(-10);
        dog2.run(550);
        System.out.println("Всего собак: " + Dog.getDogCount());

        System.out.println();
        System.out.println("-- Коты --");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Васька");
        cat1.run(150);
        cat2.swim(550);
        System.out.println("Всего котов: " + Cat.getCatCount());

        System.out.println();
        System.out.println("Всего животных: " + Animal.getAnimalCount());
    }
}
