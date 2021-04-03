package com.company.homework_01_01;

public class Main {

    byte byteValue = 127;
    short smallValue = 32767;
    int intValue = 10000;
    long longValue = 10000L;
    float floatValue = 10.05f;
    double doubleValue = 12548.587;
    char charValue = 'A';
    boolean boolValue = true;

    public static void main(String[] args){
        System.out.println(calculate(10,20,30,40));
        System.out.println(isSumInRange(5, 7));
        printPositiveOrNegative(-15);
        System.out.println(isNegative(25));
        printName("Вася");
        printLeapYear(2020);
        printLeapYear(2021);
    }

    public static float calculate(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    public static boolean isSumInRange(int x1, int x2){
        int sum = x1 + x2;
        return sum >= 10 && sum <= 20;
    }

    public static void printPositiveOrNegative(int x){
        if (x < 0){
            System.out.println("Число отрицательное");
        } else{
            System.out.println("Число положительное");
        }
    }

    public static boolean isNegative(int x){
        return x < 0;
    }

    public static void printName(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void printLeapYear(int year){
        if ((year % 400 == 0 && year % 100 == 0) || (year % 4 == 0 && year % 100 > 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

    }
}

