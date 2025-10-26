package org.example.task12;

public class Motorcycle extends Vehicle{ // Объявление публичного класса Motorcycle, который наследуется от класса Vehicle

    //Конструктор класса Motorcycle с параметрами
    public Motorcycle(String name, int emissions) {
        super(name, emissions); // Вызов конструктора родительского класса (Vehicle) для инициализации полей name и emissions
    }
}
/*
Создать классы Motorcycle, который наследуется от общего класса Vehicle (транспорт)

 */