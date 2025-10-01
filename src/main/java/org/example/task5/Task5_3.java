package org.example.task5;

import java.util.Scanner;

public class Task5_3 {
    public static <string> void main(String[] args) {
        //3*. Ввести число с консоли, которое не заканчивается на 0. Вывести число в обратном порядке. Использовать оператор %.
        Scanner in = new Scanner(System.in);
        int number = 0, ostatok;

        System.out.print("Введите число, которое не заканчивается на 0: ");
        int a = in.nextInt();

        while (a > 0) {
            ostatok = a % 10; // записываем остаток в переменную
            number = number * 10 + ostatok; //накапливаем число
            a = a / 10; //отбрасываем дробную часть
        }
        System.out.println(number);
    }
}
