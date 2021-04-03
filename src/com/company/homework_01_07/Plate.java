package com.company.homework_01_07;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount){
        if (food < amount) {
            System.out.println("В миске недостаточно еды");
        } else {
            food -= amount;
        }
    }

    public void increaseFood(int amount){
        food += amount;
    }

    public void info() {
        System.out.println("Food amount: " + food);
    }
}
