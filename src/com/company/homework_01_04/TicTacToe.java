package com.company.homework_01_04;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final int AREA_SIZE = 4;
    static char[][] area = new char[AREA_SIZE][AREA_SIZE];
    static final char DOT_EMPTY = '.';
    static final char DOT_HUMAN = 'X';
    static final char DOT_COMPUTER = 'O';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        startGame();
        scanner.close();
    }

    public static void startGame() {
        boolean isHumanMove = random.nextBoolean();
        initArea();
        printArea();

        while (true) {
            if (isHumanMove) {
                humanMove();
                printArea();
                if (isHumanWin()) {
                    System.out.println("Победил человек!");
                    break;
                }
            } else {
                computerMove();
                printArea();
                if (isComputerMove()) {
                    System.out.println("Победил компьютер!");
                    break;
                }
            }
            if (isAreaFull()) {
                System.out.println("Ничья!");
                break;
            }
            isHumanMove = !isHumanMove;
        }
    }

    public static void initArea() {
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                area[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printArea() {
        for (int i = 0; i <= area.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < area.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < area[i].length; j++) {
                System.out.print(area[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isWin (char dotChar) {
        int winD1 = 0, winD2 = 0;

        for (int i = 0; i < area.length; i++) {
            int winH = 0, winV = 0;
            for (int j = 0; j < area[i].length; j++) {
                if (area[i][j] == dotChar) winH++;
                if (area[j][i] == dotChar) winV++;
            }
            if (winH == AREA_SIZE || winV == AREA_SIZE) return true;

            if (area[i][i] == dotChar) winD1++;
            if (area[i][area[i].length - i - 1] == dotChar) winD2++;
        }
        if (winD1 == AREA_SIZE || winD2 == AREA_SIZE) return true;
        return false;
    }

    public static boolean isHumanWin() {
        return isWin(DOT_HUMAN);
    }

    public static boolean isComputerMove() {
        return isWin(DOT_COMPUTER);
    }

    public static boolean isAreaFull() {
        for (int i = 0; i < AREA_SIZE; i++) {
            for (int j = 0; j < AREA_SIZE; j++) {
                if (area[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || x >= AREA_SIZE || y < 0 || y >= AREA_SIZE) return false;
        if (area[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void humanMove() {
        int x, y;
        do {
            System.out.println("Введите координаты ячейки в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        area[y][x] = DOT_HUMAN;
    }

    public static void computerMove() {
        int x, y;
        do {
            x = random.nextInt(AREA_SIZE);
            y = random.nextInt(AREA_SIZE);
        } while (!isCellEmpty(x, y));

        System.out.println("Компьютер сходил в ячейку " + (x + 1) + " " + (y + 1));
        area[y][x] = DOT_COMPUTER;
    }

}
