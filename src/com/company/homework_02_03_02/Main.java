package com.company.homework_02_03_02;

import com.company.homework_02_03_01.PhoneBook;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "0123456");
        phoneBook.add("Иванов", "7891011");
        phoneBook.add("Петров", "1597530");

        System.out.println("Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Петров: " + phoneBook.get("Петров"));
    }

}
