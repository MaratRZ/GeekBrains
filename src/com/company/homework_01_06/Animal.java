package com.company.homework_01_06;

public abstract class Animal {

    private static int animalCount;

    Animal () {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void run (int distance);

    public abstract void swim(int distance);

}
