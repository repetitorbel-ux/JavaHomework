package org.example.task18.List.runnable;

import java.util.ArrayList;
import java.util.List;

public class MainTwoThreads {
    public static void main(String[] args) {

        parallel();
    }

    public static void parallel(){

        List<Car> carList = new ArrayList<>();

        Car audi = new Car("Audi A6", "2332", 1500);
        Car vw = new Car("VW Golf 7", "5792", 2500);

        carList.add(audi);
        carList.add(vw);

        for(Car car : carList){
            Thread carThread = new Thread(car);
            carThread.start();
        }
    }

}
/*
1.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки. Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).
1.1 Создать два потока (две машины которые будут ехать параллельно). Потоки запускайте в классе Main. Выносите методы в private static void согласно заданиям.
1.2 Дать возможность каждой машине останавливаться на определённое время. (метод sleep). Передавать в конструктор параметр по остановке, которое будет записываться в поле (время остановки). Впоследствии поток будет спать переданное время.
1.4 Сделать задачу 1.1 и 1.2 через интерфейс Runnable. Для этого создайте в пакете с домашнем заданием, пакет с названием runnable.  В этом пакете реализуйте (скопируйте) класс Авто с последующим изменением.
 */