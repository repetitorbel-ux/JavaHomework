package org.example.task17.seriaDeserial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainCar {
    public static void main(String[] args) {

        String path = "src\\main\\java\\org\\example\\folderToHW17\\audi.txt";
        Car car = new Car("Audi", 260, "Gemany");
        serialize(car, path);
        Car carOutput = deserialize(path);
        System.out.println(carOutput.toString());
    }

    private static void serialize(Car car, String file) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(car);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка");
        }
    }

    private static Car deserialize(String file) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Car carResult = (Car) objectInputStream.readObject();
            return carResult;
        } catch (Exception e) {
            throw new RuntimeException("Ошибка");
        }
    }
}
/*
2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства)
В классе Main создать объект автомобиль. Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main
2.2 Выполнить десериализацию автомобиля и вывести его в консоли. Реализуйте соответствующий метод в классе Main
 */