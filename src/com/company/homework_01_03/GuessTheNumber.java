package com.company.homework_01_03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    static final int MAX_NUMBER = 10;
    static final int MAX_ATTEMPTS = 3;

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        startGame();
        scanner.close();
    }

    public static void startGame () {

        String userAnswer;

        do {
            int randomNumber = random.nextInt(MAX_NUMBER);

            for (int i = 1; i <= MAX_ATTEMPTS; i++) {
                System.out.print("Введите число от 0 до 9: ");
                int userNumber = scanner.nextInt();

                if (userNumber < randomNumber) {
                    System.out.print("Число должно быть больше! ");
                } else if (userNumber > randomNumber) {
                    System.out.print("Число должно быть меньше! ");
                } else {
                    System.out.println("Вы угадали!");
                    break;
                }

                if (i < MAX_ATTEMPTS) {
                    System.out.println("Осталось попыток " + (MAX_ATTEMPTS - i));
                } else {
                    System.out.println("Вы проиграли!");
                }
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            userAnswer = scanner.next();

        } while (userAnswer.equals("1"));
    }
}
