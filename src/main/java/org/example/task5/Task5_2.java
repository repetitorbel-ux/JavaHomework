package org.example.task5;
import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
        //2. Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа до другого.
        // (Используйте цикл while). Подсказка: до цикла объявите переменную int sum=0.
        // В самом цикле перезаписывайте в эту переменную сумму чисел.
        int n, sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int x1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int x2 = in.nextInt();

        n = x1;

        while(n >= x1 & n <= x2){
            sum = sum + n;
            n++;
        }

        System.out.println("Сумма: " + sum);

    }
}