package org.example.task4;

public class task4_1 {
    public static void main(String[] args) {
        //На вход даны 3 числа. Вывести в консоль только четные числа
        int a = 2, b = 5, c = 10, num;

        if (a % 2 == 0) {
            System.out.println(a);}
        if (b % 2 == 0) {
            System.out.println(b);}
        if (c % 2 == 0) {
            System.out.println(c);
        }
        //через тернарный оператор, но для нечетных в выводе будет пустая строка
        System.out.println(a % 2 == 0 ? a : "");
        System.out.println(b % 2 == 0 ? b : "");
        System.out.println(c % 2 == 0 ? c : "");
    }
}



