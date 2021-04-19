package com.company.homework_02_05;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    private static class ThreadCalc implements Runnable {
        private float[] localArr;

        ThreadCalc(float[] arr){
            localArr = arr;
        }

        @Override
        public void run() {
            for (int i = 0; i < localArr.length; i++) {
                localArr[i] = (float)(localArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }

    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения однопоточной обработки: " + (System.currentTimeMillis() - a));
    }

    public static void method2() {
        float[] halfArr1 = new float[arr.length/2];
        float[] halfArr2 = new float[arr.length - halfArr1.length];


        Arrays.fill(arr, 1);

        long a = System.currentTimeMillis();

        // разбивка
        System.arraycopy(arr, 0, halfArr1, 0, halfArr1.length);
        System.arraycopy(arr, halfArr1.length, halfArr2, 0, halfArr2.length);

        // вычисление
        Thread thread1 = new Thread(new ThreadCalc(halfArr1));
        thread1.start();
        Thread thread2 = new Thread(new ThreadCalc(halfArr2));
        thread2.start();

        while (true) {
            if (thread1.getState() == Thread.State.TERMINATED & thread2.getState() == Thread.State.TERMINATED) {
                halfArr1[0] = 1;
                halfArr2[0] = 2;
                break;
            }
        }

        // склейка
        System.arraycopy(halfArr1, 0, arr, 0, halfArr1.length);
        System.arraycopy(halfArr2, 0, arr, halfArr1.length, halfArr2.length);

        System.out.println("Время выполнения многопоточной обработки: " + (System.currentTimeMillis() - a));
    }


}
