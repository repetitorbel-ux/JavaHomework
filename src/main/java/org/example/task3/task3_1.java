package org.example.task3;

public class task3_1 {
    public static void main(String[] args) {
        //Дано уравнение x/6+25=98. Найти x и вывести его в консоль
        float x;

        x = (float) (98 - 25) / 6; //Приведение типа Int к float

        System.out.println("Значение х равно: " + x);

        System.out.println(String.format("%E", x));//запись ответа в научной форме
    }
}
