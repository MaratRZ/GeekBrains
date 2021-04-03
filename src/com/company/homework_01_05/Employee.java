package com.company.homework_01_05;

public class Employee {

    private String fullName;
    private String post;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String post, String email, String phone, double salary, int age) throws Exception {
        setFullName(fullName);
        setPost(post);
        setEmail(email);
        setPhone(phone);
        setSalary(salary);
        setAge(age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws Exception {
        if (fullName.isEmpty()) {
            throw new Exception("Необходимо ввести ФИО сотрудника");
        }
        this.fullName = fullName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) throws Exception {
        if (post.isEmpty()) {
            throw new Exception("Необходимо ввести должность сотрудника");
        }
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (!email.isEmpty()) {
            if (email.indexOf('@') == -1) {
                throw new Exception("Необходимо ввести правильный адрес электронной почты");
            }
        }
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws Exception {
        if (!isDigit(phone)) {
            throw new Exception("Необходимо правильно ввести номер телефона");
        }
        this.phone = phone;
    }

    private static boolean isDigit(String s) {
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws Exception {
        if (salary <= 0) {
            throw new Exception("Зарплата сотрудника должна быть больше 0");
        }
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (salary <= 0) {
            throw new Exception("Неправильно указан возраст сотрудника");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Сотрудник: \n" +
                "ФИО: '" + fullName + "'\n" +
                "Должность: '" + post + "'\n" +
                "Эл. почта: '" + email + "'\n" +
                "Телефон: " + phone + "'\n" +
                "Оклад: " + salary + "'\n" +
                "Возраст: " + age;
    }
}
