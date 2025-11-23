package org.example.task18.Runnable;

public class MainCarRunnable {
    public static void main(String[] args)  { //throws InterruptedException

        twoThreads();
    }

    public static void twoThreads(){

        CarRunnable audi = new CarRunnable("Audi A6", "2332", 1500);
        CarRunnable vw = new CarRunnable("VW Golf 7", "5792", 2500);

        Thread audiThread = new Thread(audi);
        Thread vwThread = new Thread(vw);

        audiThread.start();
        vwThread.start();
    }

}
/*
1.1 Создать два потока (две машины, которые будут ехать параллельно). Потоки запускайте в классе Main. Выносите методы в private static void согласно заданиям.
1.2 Дать возможность каждой машине останавливаться на определённое время. (метод sleep). Передавать в конструктор параметр по остановке, которое будет записываться в поле (время остановки). Впоследствии поток будет спать переданное время.
1.4 Сделать задачу 1.1 и 1.2 через интерфейс Runnable. Для этого создайте в пакете с домашним заданием, пакет с названием runnable.  В этом пакете реализуйте (скопируйте) класс Авто с последующим изменением.
 */