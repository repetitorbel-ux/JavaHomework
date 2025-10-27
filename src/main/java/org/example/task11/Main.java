package org.example.task11;
public class Main {

    public static void main(String[] args) {

        //1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар) и вызовите метод отремонтировать робота (результаты выполнения методы выведите в консоль)

        RobotCooker robotCooker1 = new RobotCooker("Model 1C", 1200, "Gemany", "Ножи", false);
        robotCooker1.repairRobot();

        RobotDeminer robotDeminer1 = new RobotDeminer("Model 1D", 1500, "Japan", "steel", true);
        robotDeminer1.repairRobot();

        RobotBuilder robotBuilder1 = new RobotBuilder("Model 1B", 1800, "Poland", "UniversalUnit", "steel", true);
        robotBuilder1.repairRobot();
        System.out.println();

        //1.3 Включение и выключение робота (в качестве параметра передаем: для включения - true; для выключения - false.
        System.out.println("Первоначальное состояние робота-повара: " + robotCooker1.getIsOn());
        robotCooker1.turnOn(true);//Попытка включения
        System.out.println("Состояние робота-повара после попытки включения и оно же первоначальное для выключения: " + robotCooker1.getIsOn());
        robotCooker1.turnOff(false);//Попытка выключения
        System.out.println("Состояние робота-повара после попытки выключения: " + robotCooker1.getIsOn());
        System.out.println();

        System.out.println("Первоначальное состояние робота-сапера: " + robotDeminer1.getIsOn());
        robotDeminer1.turnOn(true); //Попытка включения
        System.out.println("Состояние робота-сапера после попытки включения и оно же первоначальное для выключения: " + robotDeminer1.getIsOn());
        robotDeminer1.turnOff(false); //Выключение робота
        System.out.println("Состояние робота-сапера после попытки выключения: " + robotDeminer1.getIsOn());
        System.out.println();

        System.out.println("Первоначальное состояние робота-строителя: " + robotBuilder1.getIsOn());
        robotBuilder1.turnOff(false); //Попытка выключения
        System.out.println("Состояние робота-строителя после попытки выключения и оно же первоначальное для включения: " + robotBuilder1.getIsOn());
        robotBuilder1.turnOn(true); //Включение робота
        System.out.println("Состояние робота-строителя после попытки включения: " + robotBuilder1.getIsOn());
        System.out.println();

        //***Изменение состояния (включен/выключен) через геттеры и сеттеры без использования методов turnOn и turnOff
//        System.out.println("Первоначальное состояние робота-повара: " + robotCooker1.getIsOn());
//        robotCooker1.setOn(!(robotCooker1.getIsOn())); //В параметрах сеттера получаем и "инвертируем" состояние робота
//        System.out.println("Состояние робота-повара после переключения: " + robotCooker1.getIsOn());
//
//        System.out.println("Первоначальное состояние робота-сапера: " + robotDeminer1.getIsOn());
//        robotDeminer1.setOn(!(robotDeminer1.getIsOn()));
//        System.out.println("Состояние робота-сапера после переключения: " + robotDeminer1.getIsOn());
//
//        System.out.println("Первоначальное состояние робота-строителя: " + robotBuilder1.getIsOn());
//        robotBuilder1.setOn(!(robotBuilder1.getIsOn()));
//        System.out.println("Состояние робота-строителя после переключения: " + robotBuilder1.getIsOn());
//        System.out.println();

        //1.6 Создание 3-х выставок (массива) роботов
        //1.6.1 Создание выставки 1 (все типы роботов)
        Robot[] exhibition1 = {robotCooker1, robotDeminer1, robotBuilder1};

        //1.6.2 Создание выставки 2 (роботы-инженеры)
        RobotEngineer[] exhibition2 = {robotBuilder1, robotDeminer1};//Тип должен быть RobotEngineer, чтобы нельзя было добавить роботов др. типов

        //1.6.3 Создание выставки 3 (саперы)
        RobotDeminer[] exhibition3 = {robotDeminer1};

        //1.6.4 Демонстрация способностей роботов с выставки 1
        for(Robot r : exhibition1){
            r.uniquePossibility();
        }
        System.out.println();

        //1.6.5 Демонстрация дополнительных способностей роботов-инженеров с выставки 2
        for(RobotEngineer r : exhibition2){
            r.createItem();
        }

    }

}
/*
1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар) и вызовите метод отремонтировать робота (результаты выполнения методы выведите в консоль)
1.6 Создать 3 выставки (массива) роботов в классе Main. Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель). Вторая выставка- только для инженерных роботов. Третья выставка- для роботов сапёров. Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility)
Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров, вызвав метод createItem на каждом Роботе, который есть на выставке.
 */