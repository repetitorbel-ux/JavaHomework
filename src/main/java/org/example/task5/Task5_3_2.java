package org.example.task5;

import java.util.Scanner;

public class Task5_3_2 {
    public static void main(String[] args) {
        //3*. Ввести число с консоли, которое не заканчивается на 0. Вывести число в обратном порядке. Использовать оператор %.
        Scanner in = new Scanner(System.in);
        int number = 0, ostatok, i;

        System.out.print("Введите число, которое не заканчивается на 0: ");
        int a = in.nextInt();

        for (i = 1; i < a; i++){
            ostatok = a % 10; // записываем остаток в переменную
            number = number * 10 + ostatok; //накапливаем число
            a = a / 10; //отбрасываем дробную часть
        }
        number = number * 10 + a;
        System.out.println(number);
    }
}