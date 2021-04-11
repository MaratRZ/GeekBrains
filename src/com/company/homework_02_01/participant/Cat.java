package com.company.homework_02_01.participant;


public class Cat implements Runnable, Jumpable {

    private int jumpHeight;
    private int runDistance;

    public Cat(int jumpHeight, int runDistance) {
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public boolean jump(int height) {
        return jumpHeight >= height;
    }

    @Override
    public boolean run(int distance) {
        return runDistance >= distance;
    }

    @Override
    public String toString() {
        return "Кот";
    }
}
