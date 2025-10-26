package org.example.task12; // Объявление пакета, в котором находится класс

public class Vehicle { // Объявление публичного класса Vehicle
    private String name;
    private int emissions;

    //Конструктор класса с параметрами
    public Vehicle(String name, int emissions) {
        this.name = name;
        this.emissions = emissions;
    }

    //Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmissions() {
        return emissions;
    }

    public void setEmissions(int emissions) {
        this.emissions = emissions;
    }
}
/*
1.1 Создать поле name и количество выбросов(Integer) в классе Vehicle и проинициализировать его через конструктора.
1.2 Реализовать методы геттеры и сеттеры для соответствующих полей класса Vehicle
 */