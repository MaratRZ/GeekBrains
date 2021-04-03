package com.company.homework_01_06;

public class Dog extends Animal {

    private static int dogCount;
    private static final int maxRunDistance = 500;
    private static final int maxSwimDistance = 10;
    private String name;

    public Dog(String name) {
        super();
        dogCount++;
        setName(name);
    }

    public static int getDogCount() {
        return dogCount;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) throw new RuntimeException("Необходимо указать кличку собаки");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть меньше 0 м.");
        } else if (distance > maxRunDistance) {
            System.out.println("Собака не может пробежать дистанцию более " + maxRunDistance + " м.");
        } else {
            System.out.println(getName() + " пробежал(-а) " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть меньше 0 м.");
        } else if (distance > maxSwimDistance) {
            System.out.println("Собака не может проплыть дистанцию более " + maxSwimDistance + " м.");
        } else {
            System.out.println(getName() + " проплыл(-а) " + distance + " м.");
        }
    }
}
