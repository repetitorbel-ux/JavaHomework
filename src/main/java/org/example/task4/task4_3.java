package org.example.task4;
import java.util.Scanner;

public class task4_3 {
    public static void main(String[] args) {
        //Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления.
        // Написать программу, которая будет выводить разный текст, в зависимости от значения result. В случае result=3,
        // вывести: "Результат деления равен 3" В случае result=5 вывести: "Результат деления равен 5"
        // В других случаях вывести: "Результат деления равен дробному числу".
        // При этом в последнем случае вывести точный результат деления (использовать приведение типов). Использовать оператор switch- case
        int result;

        //класс Scanner создает новый объект, считывающий стандартный поток ввода (клавиатура) и помещает этот объект в переменную scanner:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число x: ");
        int x = scanner.nextInt(); //объявление переменной типа int и присвоение ей введенного значения типа int
        result = 15 / x;
        scanner.close();//закрывает Scanner для освобождения системных ресурсов (для избежания утечек памяти)
        switch (x) {
            case 1:
                System.out.println("Результат деления равен 15");
                break;
            case 3:
                System.out.println("Результат деления равен 5");
                break;
            case 5:
                System.out.println("Результат деления равен 3");
                break;
            case 15:
                System.out.println("Результат деления равен 1");
                break;
            default:
                System.out.println("Результат деления равен дробному числу: " + (float) 15 / x);
        }
    }
}
/*
Scanner - класс для чтения ввода
scanner - переменная-объект (экземпляр класса Scanner)
new Scanner() - создание нового объекта Scanner
System.in - источник ввода (стандартный поток ввода = клавиатура)
 */