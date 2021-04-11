package com.company.homework_02_03_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }

    public void add(String name, String phone) {
        ArrayList<String> phoneList = get(name);
        if (phoneList == null) {
            phoneList = new ArrayList<>();
        }
        phoneList.add(phone);
        phoneBook.put(name, phoneList);
    }
}
