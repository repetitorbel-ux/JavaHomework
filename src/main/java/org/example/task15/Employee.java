package org.example.task15;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int age;
    private int salary;

    public Employee(int id, String name, String surname, int age, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return getId() == employee.getId() && getAge() == employee.getAge() && getSalary() == employee.getSalary() && Objects.equals(getName(), employee.getName()) && Objects.equals(getSurname(), employee.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getAge(), getSalary());
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
/*
1.1.Создать класс. Сотрудник.
1.2.Поля у сотрудника. Идентификационный номер, Имя, фамилия, возраст, зарплата.
 */