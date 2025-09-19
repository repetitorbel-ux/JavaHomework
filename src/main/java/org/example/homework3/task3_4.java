package org.example.homework3;

public class task3_4 {
    public static void main(String[] args) {
        //Даны значения: x=5; y=2; c=x*y; Расставьте операции инкремента декремента так, чтобы
        // после выполнения операции (c=x*y):
        int x = 5, y = 2, c;

        //++x: x становится 6, в выражение идёт 6. y--: в выражение идёт 2, затем y уменьшится до 1.
        c = ++x * y--;

        System.out.print("x = " + x + "; ");
        System.out.print("y = " + y + "; ");
        System.out.print("c = x * y = " + c);
    }
}