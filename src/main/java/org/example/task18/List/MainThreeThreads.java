package org.example.task18.List;

import java.util.ArrayList;
import java.util.List;

public class MainThreeThreads {
    public static void main(String[] args) throws InterruptedException {

        twoThreads();
    }

    public static void twoThreads(){

        List<Car> carList = new ArrayList<>();

        Car audi = new Car("Audi A6", "2332", 1500);
        Car vw = new Car("VW Golf 7", "5792", 2500);
        Car mazda = new Car("Mazda 3", "9788", 2000);

        carList.add(audi);
        carList.add(vw);
        carList.add(mazda);

        for(Car car : carList){
            if(car.equals(carList.get(0))){
                car.start();
                try {
                    car.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else car.start();
        }

    }

}
/*
1.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки. Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).
1.1 Создать два потока (две машины которые будут ехать параллельно). Потоки запускайте в классе Main. Выносите методы в private static void согласно заданиям.
1.2 Дать возможность каждой машине останавливаться на определённое время. (метод sleep). Передавать в конструктор параметр по остановке, которое будет записываться в поле (время остановки). Впоследствии поток будет спать переданное время.
1.4 Сделать задачу 1.1 и 1.2 через интерфейс Runnable. Для этого создайте в пакете с домашнем заданием, пакет с названием runnable.  В этом пакете реализуйте (скопируйте) класс Авто с последующим изменением.
//    public static void twoThreads2(){
//
//        List<Car> carList = new ArrayList<>();
//
//        Car audi = new Car("Audi A6", "2332", 1500);
////        Car vw = new Car("VW Golf 7", "5792", 2500);
//
//        carList.add(audi);
////        audi.creatCar(audi);
////        vw.creatCar();
//
////        Thread threadcarList = new Thread(carList);
//
////        threadcarList.start();
//
//    }
 */
