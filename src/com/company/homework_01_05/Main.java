package com.company.homework_01_05;

public class Main {

    public static void main(String[] args) throws Exception {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович","Инженер", "ivanov@mail.ru", "74951234567", 31500.50, 39);
        employees[1] = new Employee("Петров Петр Васильевич","Плотник", "petrov@mail.ru", "7495159753", 30500, 45);
        employees[2] = new Employee("Сидоров Василий Петрович","Бухгалтер", "sidorov@mail.ru", "74957539514", 41500.25, 41);
        employees[3] = new Employee("Пупкин Василий Иванович","Программист", "pupkin@mail.ru", "74958527865", 35000, 25);
        employees[4] = new Employee("Васильев Алексей Иванович","Директор", "ivanov@mail.ru", "74951234567", 31500.50, 39);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee.toString() + "\n");
            }
        }
    }
}
