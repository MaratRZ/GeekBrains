package com.company.homework_01_02;

public class Main {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println("-= isBalancedArray =-");
        System.out.println(isBalancedArray(new int[]{2,2,2,1,2,2,10,1}));
        System.out.println();
        shiftArray(new int[]{1,2,3,4,5,6,7,8,9}, 3);
    }

    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        System.out.println("-= invertArray =-");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println("-= fillArray =-");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }

    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("-= changeArray =-");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }

    public static void fillDiagonal() {
        int arrayLength = 5;
        int[][] arr = new int[arrayLength][arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (i == j || j == arrayLength - (1 + i)) {
                    arr[i][j] = 1;
                }
            }
        }

        System.out.println("-= fillDiagonal =-");
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void findMinAndMax() {
        int[] arr = {15, 5, 8, 2, 84, 6};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("-= findMinAndMax =-");
        System.out.println("min = " + min + ", max = " + max);
        System.out.println();
    }

    public static boolean isBalancedArray (int[] arr) {
        for (int pos = 1; pos < arr.length; pos++) {
            int leftSum  = 0;
            int rightSum = 0;

            for (int i = 0; i < pos; i++) {
                leftSum += arr[i];
            }

            for (int i = pos; i < arr.length; i++) {
                rightSum += arr[i];
            }

            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    public static void shiftArray(int[] array, int shift) {

        if (shift == 0 || array.length < 2) {
            return;
        }

        for (int i = 0; i < Math.abs(shift); i++) {
            if (shift > 0) {
                int n = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = n;
            } else {
                int n = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = n;
            }
        }

        System.out.println("-= shiftArray =-");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
