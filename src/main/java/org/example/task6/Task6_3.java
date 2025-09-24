package org.example.task6;

public class Task6_3 {
    public static void main(String[] args) {
        //3.* Создать массив вручную. Заменить максимальный и минимальный элемент массива.
        // Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.
        int[] arr = {4, 2, 50, 90, 40};

        int buf = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        arr[0] = -1000;
        arr[arr.length - 1] = 1000;
        for (int x : arr) {
            System.out.print(x + " ");

        }
    }
}