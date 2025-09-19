package org.example.task4;

public class task4_2 {
    public static void main(String[] args) {
        //На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5 (используйте оператор % для проверки деления без остатка)
        int a = 22, b = 55, c = 10, num;

        if (a % 2 == 0 & a % 5 == 0 ) {
            System.out.println(a);}
        if (b % 2 == 0 & b % 5 == 0 ) {
            System.out.println(b);}
        if (c % 2 == 0 & c % 5 == 0 ) {
            System.out.println(c);
        }
    }
}
