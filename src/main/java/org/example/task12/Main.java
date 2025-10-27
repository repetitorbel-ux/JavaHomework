package org.example.task12;

public class Main {
    public static void main(String[] args) {

        //Создание объектов 'car' класса Car и 'motorcycle' класса Motorcycle с
        Car car = new Car("Volga", 150);
        Motorcycle motorcycle = new Motorcycle("Yamaha", 50);

        //Создание экземпляров generic класса Garage
        Garage<Car> carGarage = new Garage<>(car);//будет работать с типом Car, значит в конструктор передаем ссылку car
        Garage<Motorcycle> motoGarage = new Garage<>(motorcycle);//будет работать с типом Motorcycle, в конструктор передаем ссылку motorcycle

        if (carGarage.isEntryPermitted()){ // Проверка, разрешен ли въезд для машины в гараж
            System.out.println(car.getName() + ": " + "Въезд разрешён"); // Если да, вывести сообщение о разрешении
        }else { // Если нет
            System.out.println(car.getName() + ": " + "Въезд запрещён"); // Вывести сообщение о запрете
        }

        if (motoGarage.isEntryPermitted()){ // Проверка, разрешен ли въезд для мотоцикла в гараж
            System.out.println(motorcycle.getName() + ": " + "Въезд разрешён"); // Если да, вывести сообщение о разрешении
        }else { // Если нет
            System.out.println(motorcycle.getName() + ": " + "Въезд запрещён"); // Вывести сообщение о запрете
        }

    }


}
/*
1.5 Класс Main. Создать 2 объекта класса Garage. Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж
 */