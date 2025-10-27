package org.example.task12;

public class Car extends Vehicle{ // Объявление публичного класса Car, который наследуется от класса Vehicle


    //Конструктор класса Car с параметрами
    public Car(String name, int emissions) {
        super(name, emissions); // Вызов конструктора родительского класса (Vehicle) для инициализации полей name и emissions
    }
}
/*
Создать класс Car, который наследуются от общего класса Vehicle (транспорт)

 */