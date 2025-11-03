package org.example.task3;

public class task3_2 {
    public static void main(String[] args) {
        //x=x+5; y=y*9; z=z-6; Необходимо укоротить данные выражения, чтобы результат не изменился. х=8; y=9; z=12;
        // (операции присваивания, нужно просто написать по-другому)
        int x = 8, y = 9, z = 12;

        x += 5;
        y *= 9;
        z -= 18;

        System.out.print(x + "; ");
        System.out.print(y + "; ");
        System.out.print(z);

    }
}
