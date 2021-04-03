package com.company.homework_01_06;

public class Cat extends Animal {

    private static int catCount;
    private static final int maxRunDistance = 200;
    private String name;

    public Cat(String name) {
        super();
        catCount++;
        setName(name);
    }

    public static int getCatCount() {
        return catCount;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) throw new RuntimeException("Необходимо указать кличку кота");
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть меньше 0 м.");
        } else if (distance > maxRunDistance) {
            System.out.println("Коты не могут пробежать дистанцию более " + maxRunDistance + " м.");
        } else {
            System.out.println(getName() + " пробежал(-а) " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты плавать не умеют");
    }
}
