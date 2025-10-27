package org.example.task11;

public interface Robot {

    //Абстрактные методы
    void turnOn(boolean b);
    void turnOff(boolean b);
    void uniquePossibility();



    //Дефолтный метод Ремонт робота
    default void repairRobot() {
           System.out.println("Робот на ремонте");
    }

    //Переопределенный метод (для возможности вызова методов для классов implements RobotEngineer
    void createItem();
}

/*
1. Создать интерфейс Робот. В нём определены методы:
Дефолтный метод:  Отремонтировать робота и абстрактные методы: включить робота, выключить, продемонстрировать уникальные способности (uniquePossibility).
 */