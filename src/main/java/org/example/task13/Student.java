package org.example.task13;

public class Student{
    private String name;
    private String surname;
    private String birthday;
    private String cityOfBorn;
    private Double grade;

    //Конструктор
    public Student(String name, String surname, String birthday, String cityOfBorn, Double grade) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.cityOfBorn = cityOfBorn;
        this.grade = grade;
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCityOfBorn() {
        return cityOfBorn;
    }

    public Double getGrade() {
        return grade;
    }

    //Сеттры
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCityOfBorn(String cityOfBorn) {
        this.cityOfBorn = cityOfBorn;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", средний балл " + grade;
    }

//    @Override
//    public String toString() {
//        return name + " " + surname + ", дата и место рождения: " + birthday + ", " + cityOfBorn + ", средний балл " + grade;
//    }
}
/*
1. Создать класс студент (Student).
У студента поля: имя, фамилия, дата рождения, город рождения, средний бал.
Реализовать во всех классах методы геттеры и сеттеры.

1.1. Создать несколько студентов.
 */