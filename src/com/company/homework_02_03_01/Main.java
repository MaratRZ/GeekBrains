package com.company.homework_02_03_01;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        fillArray(words);
        System.out.println(words);
        printUniqueWords(words);
    }

    static void fillArray(List<String> array) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array.add("word#" + random.nextInt(10));
        }
    }

    static void printUniqueWords(List<String> array){
        Set<String> uniqueWords = new HashSet<>(array);
        uniqueWords.forEach(s -> {
            int count = 0;
            for (String value : array) {
                if (s.equals(value)) {
                    count++;
                }
            }
            System.out.printf("%s повторяется %d раз%n", s, count);
        });
    }
}
