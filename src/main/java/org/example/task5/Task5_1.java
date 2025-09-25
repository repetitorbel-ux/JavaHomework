package org.example.task5;

public class Task5_1 {
    public static void main(String[] args) {
        //1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до100. (можно использовать цикл for)
        int i;
        for(i = 0; i < 100; i++){
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.println("числа кратные 7 или 3: " + i);
            }
        }
    }
}
