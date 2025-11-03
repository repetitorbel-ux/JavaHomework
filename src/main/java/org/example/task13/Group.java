package org.example.task13;
import java.util.*;

//import static java.lang.Character.getName;

public class Group{
    
    //Поля класса
    private String numberOfGroup;

    //Поле класса: тип List, параметризованное типом Student???? Заводим список студентов в группах???
    private List<Student> students;
//*************************************************************
    //Конструктор с параметром номера группы
    public Group(String numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
        this.students = new ArrayList<>();
    }
//*************************************************************
    //Геттеры
    public String getGrade() {
        return numberOfGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    //Сеттеры
    public void setGrade(String grade) {
        this.numberOfGroup = numberOfGroup;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
//**********************************************************
    //Метод добавления студента в группу
    public void addStudent(Student student){
        students.add(student);
    }

    //Удаление будет работать без переопределения equals и hashCode так как в списках по ссылкам students и temp будут одни и те же ссылки на объект
    public void removeStudentsByMark(int mark){
        List<Student> temp = new ArrayList<>();//Создаем временный список для студентов с оценкой меньшей переданной
        for(Student s : students){//проходимся по студентам переданной группы
            if (s.getGrade() < mark){//если оценка меньше заданной
                temp.add(s);//добавляем студента во временный список
            }
        }
        students.removeAll(temp);//удаляем из списка students студентов, присутствующих в списке temp
    }

    //Удаление через Итератор
    public void removeStudentsByMarkIterator(int mark) {
        Iterator<Student> iterator = students.iterator();  // создаём итератор
        while (iterator.hasNext()) {
            Student s = iterator.next();                   // получаем следующего студента
            if (s.getGrade() < mark) {                   // если средний балл меньше 5
                iterator.remove();                         // удаляем текущего студента
            }
        }
    }

    //Метод переноса студентов в другую группу
    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.getStudents().addAll(students);// Переносим (добавляем) всех студентов исходя из условия в другую группу
            students.clear();// Очищаем текущую группу
        }
    }

    //Метод для округления
    public static double roundTo(double value, int digits) {
        double factor = Math.pow(10, digits);
        return Math.round(value * factor) / factor;
    }

    //Метод, который считает средний бал по группе
    public void gradeAverage(){
        double result = 0;
        int size = students.size();
        for(Student s : students){
            result = result + s.getGrade();
        }
        System.out.println("Средний бал по группе: " + roundTo(result / size, 2));
    }

//    public void sort(){
//        List<Student> sorted = new ArrayList<>(students);
//        sorted.sort(Student::comparing());
//        System.out.println(sorted);
//    }

    //Не заработал
//    public void toArr(){
//        Group[] arrayStudent = new Group[students.size()];
//        arrayStudent = students.toArray(arrayStudent);
//        System.out.println("Номер группы: " + numberOfGroup + '\'' + ", Студенты группы: " + Arrays.toString(arrayStudent));
//    }

    @Override
    public String toString() {
        return "Номер группы: " + numberOfGroup + '\'' + ", Студенты группы: " + students;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfGroup, getStudents());
    }

}
/*

1. Создать класс группа (Group).
У группы: номер группы, коллекция студентов (List<Student> students)
Реализовать во всех классах методы геттеры и сеттеры.

1.4. Реализовать метод в классе Group, который должен пройти по всем студентам в группе и удалить тех, у кого средний бал ниже переданной оценки в параметре метода. (метод remove). Сигнатура метода: public void removeStudentsByMark(int mark);
1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup);
1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.
 */