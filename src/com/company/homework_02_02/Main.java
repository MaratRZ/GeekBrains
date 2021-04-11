package com.company.homework_02_02;

import java.util.Random;

public class Main {

    final static int ARRAY_ROWS = 4;
    final static int ARRAY_COLS = 4;

    public static void main(String[] args) {
        String[][] array = new String[ARRAY_ROWS][ARRAY_COLS];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf(random.nextInt(100));
            }
        }

        array[2][2] = "abc";

        try {
            sum = sumArray(array, 4);
            System.out.println("Сумма значений всех элементов массива = " + sum);
        } catch (MyArraySizeException e) {
            e.printStackTrace();

        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static int sumArray(String[][] array, int arraySize) {
        int result = 0;

        if (array.length != arraySize || array[0].length != arraySize) {
            throw new MyArraySizeException("Ошибка размерности массива");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    result = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В ячейке массива [%d][%d] содержится не цифра", i, j));
                }
            }
        }
        return result;
    }

}
