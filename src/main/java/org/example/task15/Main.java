package org.example.task15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Dmitriy", "Vasin", 26, 1900);
        Employee employee2 = new Employee(1, "Victor", "Petrov", 30, 2000);
        Employee employee3 = new Employee(1, "Andrei", "Ivanov", 20, 2200);
        Employee employee4 = new Employee(1, "Petr", "Sergeev", 26, 2200);
        Employee employee5 = new Employee(1, "Aleksei", "Kuzma", 30, 2100);
        Employee employee6 = new Employee(1, "Vadim", "Sergeev", 21, 1850);
        Employee employee7 = new Employee(1, "Petr", "Shabanov", 34, 3500);
        Employee employee8 = new Employee(1, "Mikhail", "Ivanov", 23, 1900);

        Map<Employee, String> employees = new HashMap<>();

        employees.put(employee1, " manager");
        employees.put(employee2, " manager");
        employees.put(employee3, " consultant");
        employees.put(employee4, " count");
        employees.put(employee5, " maincount");
        employees.put(employee6, " worker");
        employees.put(employee7, " director");
        employees.put(employee8, " engineer");

        raiseSalaryForProfession(employees, 200);
        MapToCollection(employees);

    }

    public static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease) {

        Set<Map.Entry<Employee, String>> entries = employees.entrySet();
        for (Map.Entry<Employee, String> node : entries) {
            if (node.getValue().equals(" manager")) {
                Employee employee = node.getKey();
                System.out.println("****Зарплата до повышения****");
                System.out.println("Должность: " + node.getValue() + "; Данные сотрудника: " + node.getKey() + " Зарплата: " + employee.getSalary());
                int newSalary = employee.getSalary() + amountOfIncrease;

                employee.setSalary(newSalary);
                System.out.println("****Зарплата после повышения****");
                System.out.println("Должность: " + node.getValue() + "; Данные сотрудника: " + node.getKey() + " Зарплата: " + employee.getSalary());
                System.out.println("***********************************************");
            }
        }

    }
//п.1.6*. Не доделал
    public static void MapToCollection(Map<Employee, String> employees){

        HashMap<String, Collection<Employee>> employeesOpposite = new HashMap<>();

        Set<Map.Entry<Employee, String>> entries = employees.entrySet();
        for (Map.Entry<Employee, String> node : entries) {
            Employee employeeKey = node.getKey();
            String employeeValue = node.getValue();
            //System.out.println(employeeKey + " " + employeeValue);
            Employee employeeValue2 = employeeKey;
            String employeeKey2 = employeeValue;
            System.out.println(employeeKey2 + employeeValue2);

            //employeesOpposite.put(employeeKey2, employeeValue2);
            //Map<Employee, String> employees = new HashMap<>();
            //employees.put(employee1, " manager");


        }

    }

}
/*
1.3.Создать сотрудников (создайте штук восемь)
1.4.Создать мапку и записать туда созданных сотрудников в качестве ключа., а в качестве значения им присвоить им профессию.
1.5 Реализуйте статический метод в классе Main, который повысит зарплату сотрудникам одной профессии. Сигнатура метода к примеру такая:

private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease).

Например: Необходимо повысить зарплату плотникам на 200 рублей. (Обратите внимание на метод entrySet).

1.6*. Необходимо написать метод, который будет из мапки описанной в п.1.4 создаст мапку типа HashMap<String, Collection<Сотрудник>>.
Т.е, поменять местами Квалификацию и сотрудника (в качестве ключа будет выступать квалификация, в качестве значения - коллекция сотрудников).
 */