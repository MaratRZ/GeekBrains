package com.company.homework_01_03;

import com.sun.deploy.util.StringUtils;

import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {

    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
            "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        startGame();
        scanner.close();
    }

    public static void startGame(){

        String guessWord = words[random.nextInt(words.length)];

        while (true){
            System.out.println("Введите слово: ");
            String userWord = scanner.nextLine();

            if (guessWord.equals(userWord)) {
                System.out.println("Вы угадали!");
                break;
            } else {
                System.out.println("Попробуйте еще раз!");
                System.out.println(getPartOfWord(guessWord, userWord));
            }
        }
    }

    public static String getPartOfWord(String guessWord, String userWord) {

        StringBuilder resultWord = new StringBuilder();

        int minWordLength = Math.min(guessWord.length(), userWord.length());
        for (int i = 0; i < minWordLength; i++) {
            if (guessWord.charAt(i) == userWord.charAt(i)) {
                resultWord.append(userWord.charAt(i));
            } else {
                resultWord.append('#');
            }
        }
        resultWord.append("##########");
        return resultWord.toString();
    }
}
