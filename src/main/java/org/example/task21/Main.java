package org.example.task21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        /** 1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String*/
        LocalDate localDate1 = LocalDate.now();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd MMMM yyy");
        String resultlocalDate1 = localDate1.format(dtf1);
        System.out.print("Дата по формату \"1 апреля 2023\": " + resultlocalDate1 + "\n");

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd' 'MMMM' 'yyy");
        String resultlocalDate2 = localDate1.format(dtf2);
        System.out.print("Дата по формату \"1 апреля 2023\" c исп-м ' ': " + resultlocalDate2 + "\n");
        System.out.println("*******************************************************************");

        /** 2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String*/
        LocalDateTime localDateTime2 = LocalDateTime.now();
        DateTimeFormatter ldt2 = DateTimeFormatter.ofPattern("dd MMMM yyy', 'hh:mm:ss a");
        String resultLDT2 = localDateTime2.format(ldt2);
        System.out.println("Дата по формату \"1 апреля 2023, 10:59:20 PM\": " + resultLDT2);
        System.out.println("*******************************************************************");

        /** 3.Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию*/
        String resultString = "2023-03-19 : 10:12:24 AM";
        LocalDateTime localDateTime3 = LocalDateTime.now();

        DateTimeFormatter toLocalDateTime3 = DateTimeFormatter.ofPattern("yyyy-MM-dd' : 'hh:mm:ss a");

        System.out.println("before format: " + resultString);
        LocalDateTime ldt3 = LocalDateTime.parse(resultString, toLocalDateTime3);
        System.out.print("after format to LocalDateTime: " + ldt3 + "\n");
        System.out.println("*******************************************************************");

        /** 4.Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию*/
        String resultString4 = "пн 20.03.23 г. время: 15:07:28";
        LocalDateTime localDateTime4 = LocalDateTime.now();

        DateTimeFormatter toLocalDateTime4 = DateTimeFormatter.ofPattern("E dd.MM.yy' г. время: 'HH:mm:ss");

        System.out.println("before format: " + resultString4);
        LocalDateTime ldt4 = LocalDateTime.parse(resultString4, toLocalDateTime4);
        System.out.print("after format to LocalDateTime: " + ldt4 + "\n");
        System.out.println("*************************************************************************************************************");

//        System.out.println(Locale.getDefault());

        /** 5. *Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM). На выходе дата должна быть класса String*/
        LocalDateTime localDateTime5 = LocalDateTime.now();
        DateTimeFormatter ldt5 = DateTimeFormatter.ofPattern("EEEE dd MMMM yyy' время: 'HH:mm:ss a");
        String resultLDT5 = localDateTime5.format(ldt5);
        System.out.println("Дата по формату \"понедельник 20 марта 2023 время: 11.54.06 PM\": " + resultLDT5 + "\n");

    }
}
/*
1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String
3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
4. Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию:
5. *Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM). На выходе дата должна быть класса String

С количеством букв вам нужно будет разобраться, Посмотрев дополнительно класс: DateTimeFormatterBuilder (строки кода для ориентира в этом классе 1537,1661, 2051). Там описаны буквы, участвующие в паттернах для дат.
 */