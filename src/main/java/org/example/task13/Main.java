package org.example.task13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Создаем студентов
        Student student1 = new Student("Andrei", "Andreev", "28.01.2000", "Lida", 7.7);
        Student student2 = new Student("Ivan", "Ivanov", "14.05.1999", "Grodno", 6.7);
        Student student3 = new Student("Alexsei", "Sidorov", "28.01.2000", "Lida", 8.3);
        Student student4 = new Student("Mikhail", "Potapov", "14.05.1999", "Grodno", 6.2);
        Student student5 = new Student("Dmitriy", "Koch", "14.10.2001", "Ostrovets", 5.4);
        Student student6 = new Student("Mikhail", "Potapov", "14.05.1999", "Grodno", 5.2);

        //Создаем группы
        Group group1 = new Group("101");
        Group group2 = new Group("102");
        Group group3 = new Group("103");

        //Распределение студентов в группы через метод addStudent()
        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student5);
        group2.getStudents().add(student4);
        group3.getStudents().add(student3);
        group1.getStudents().add(student6);

        //Создание Факультета
        Faculty faculty = new Faculty("IT");

        //Добавление групп в факультет
        //"Явное" добавление через временный список
        List<Group> group1List = faculty.getGroups();
        group1List.add(group1);

        //Добавление групп в факультет с обращением напрямую к коллекции
        faculty.getGroups().add(group2);
        faculty.getGroups().add(group3);

        //Начальный список студентов
        System.out.println(group1.toString());
        System.out.println(group2.toString());
        System.out.println(group3.toString());

        //Вызов метода для удаления студента с оценкой ниже переданной в параметрах
        group1.removeStudentsByMark(6);
        //group1.removeStudentsByMarkIterator(6);

        //Вызов метода для перемещения студента(ов) в другую группу
        group3.transferToGroup(group2);//перемещение из гр.3 в гр.2

        System.out.println("***************************************************");
        //Вызов метода для подсчета среднего балл по группе
        group1.gradeAverage();

        System.out.println("***************************************************");

        //Список студентов после удаления и перевода
        System.out.println(group1.toString());
        System.out.println(group2.toString());
        System.out.println(group3.toString());





    }
}
/*
1.1. Создать несколько студентов.
1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)
1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)
 */