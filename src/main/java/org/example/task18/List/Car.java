package org.example.task18.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Car extends Thread {
    private String nameCar;
    private String number;
    private long timeToStop;

    public Car(String nameCar, String number, long timeToStop) {
        this.nameCar = nameCar;
        this.number = number;
        this.timeToStop = timeToStop;
    }

    public void drive() throws InterruptedException{
        int lowerBorder = 500;
        int higherBorder = 1500;
        int sub = higherBorder -  lowerBorder;
        for (int i = 0; i < 6; i++) {
            //техническая остановка для "перемешивания" потоков через рандом, генерирующий случайные числа в заданном промежутке
            Random random = new Random();
            int r = lowerBorder + random.nextInt(sub);
            Thread.sleep(r);
            System.out.println("Автомобиль " + nameCar + " гос.номер " + number + " едет");
        }
        //Остановка на время, передаваемое в конструктор
        Thread.sleep(timeToStop);
    }

    @Override
    public void run() {
        try {
            drive();
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                ", number='" + number + '\'' +
                ", timeToStop=" + timeToStop +
                "} " + super.toString();
    }

    public String getNameCar() {
        return nameCar;
    }

    public String getNumber() {
        return number;
    }

    public long getTimeToStop() {
        return timeToStop;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return getTimeToStop() == car.getTimeToStop() && Objects.equals(getNameCar(), car.getNameCar()) && Objects.equals(getNumber(), car.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameCar(), getNumber(), getTimeToStop());
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTimeToStop(long timeToStop) {
        this.timeToStop = timeToStop;
    }
}
/*
1.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки. Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).
 */