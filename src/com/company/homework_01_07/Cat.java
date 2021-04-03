package com.company.homework_01_07;

public class Cat {
    private String name;
    private int appetite;
    private boolean isSatiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return isSatiety;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            isSatiety = true;
        } else {
            isSatiety = false;
        }
    }
}
