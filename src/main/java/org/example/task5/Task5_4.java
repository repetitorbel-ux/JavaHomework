package org.example.task5;

import java.util.Scanner;

public class Task5_4 {
    public static void main(String[] args) {
        //4*. Ввести число с консоли, которое не заканчивается на 0.
        // Вывести чётные и нечётные числа через while and if. Использовать оператор %.

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число, которое не заканчивается на 0: ");
        int a = in.nextInt();

        while (a > 0) {
            int ostatok = a % 10; // записываем остаток в переменную
            if (ostatok % 2 == 0){
                System.out.println("Цифра " + ostatok + ":" + " четная");
            } else{
                System.out.println("Цифра " + ostatok + ":" + " не четная");
            }
            a = a / 10;
        }
    }
}