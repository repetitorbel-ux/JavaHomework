package org.example.task1;
//import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;

public class homework1 {
    /*
    1. Вывести в консоль фамилию разработчика, дату и время получения задания
2. Результат задания вывести в гите. (смотри задание №2)
     */
    public static void main(String[] args) {

        //LocalDateTime DateTimeTask = LocalDateTime.of(2025, 9, 10, 21, 0);
        LocalDate DateTask = LocalDate.of(2025, 9, 10);
        LocalTime TimeTask = LocalTime.of(21, 0);

        String name = "Ирчиц";

        System.out.println("Разработчик: " + name);
        //System.out.println("Дата и время получения задания: " + DateTimeTask);
        System.out.println("Дата и время получения задания: " + DateTask + " " + TimeTask);


    }
}
