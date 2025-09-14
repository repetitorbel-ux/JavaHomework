package org.example.homework3;

public class task3_3 {
    public static void main(String[] args) {
        //Даны числа a=35, b=65.
        //Если а>b, то присвоить числу c значение 5 иначе, присвоить числу c значение 10. (тернарный оператор)
        int a = 35, b = 65, c;

        /*if (a > b){
            c = 5;
            System.out.println(c);
        } else {
            c = 10;
            System.out.println(c);
        } */
        c = (a > b) ? 5 : 10;
        System.out.println(c);
    }
}
