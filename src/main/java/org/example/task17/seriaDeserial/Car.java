package org.example.task17.seriaDeserial;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String marka;
    private int speedMax;
    private String country;

    public Car(String marka, int speedMax, String country) {
        this.marka = marka;
        this.speedMax = speedMax;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return getSpeedMax() == car.getSpeedMax() && Objects.equals(getMarka(), car.getMarka()) && Objects.equals(getCountry(), car.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarka(), getSpeedMax(), getCountry());
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", speedMax=" + speedMax +
                ", country='" + country + '\'' +
                '}';
    }

    public String getMarka() {
        return marka;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public String getCountry() {
        return country;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
/*
2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства). Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи).
В классе Main создать объект автомобиль. Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main
2.2 Выполнить десериализацию автомобиля и вывести его в консоли. Реализуйте соответствующий метод в классе Main
 */