package org.example.task6;
//4.* Создать массив (вручную). Отсортировать элементы массива в порядке возрастания. Вывести полученный массив. Выполнить с помощью цикла for
public class Task6_4 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 50, 90, 40};
//Топорный способ))
        int buf = 0;
        boolean isSorted = false;
        for(int j = 0; j < arr.length - 1; j++){
            for(int i = 0; i < arr.length - 1; i++){
                first:     if (arr[i] > arr[i + 1]) {
                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                } else{ break first;            }
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("------------------------------");
        arrwhile();
    }
    public static void arrwhile() {
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
        for (int x : arr) {
            System.out.print(x + " ");
        }
     }
}