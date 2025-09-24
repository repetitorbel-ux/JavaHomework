package org.example.task6;

public class Task6_1 {
    public static void main(String[] args) {
        //1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
        // Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int x : arr){
            System.out.print(x);
            }
        System.out.println();
        for(int x : arr){
            if (arr[x] != 0){
                arr[x] = 0;
                }
            System.out.print(x);
        }
    }
}
