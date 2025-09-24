package org.example.task6;

public class Task6_2 {
    public static void main(String[] args) {
        //2. Создать массив из 5 чисел и заполните этот массив вручную. Создайте второй массив с размерностью больше на 1 чем первый массив.
        // Необходимо скопировать первый массив со всеми значениями во второй массив.
        // Последний элемент во втором массиве пусть будет 0. Выведите второй массив в консоль с помощью цикла for each.
        int[] arr1 = {6, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length + 1];

        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for(int x : arr2){
            System.out.print(x + " ");
        }
    }
}
