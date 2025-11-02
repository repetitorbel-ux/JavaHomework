package org.example.task13;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Faculty {
    private String nameOfFaculty;
    //Заводим список групп на факультете
    private List<Group> groups;

    //Конструктор
//    public Faculty(String nameOfFaculty, List<Group> groups) {
//        this.nameOfFaculty = nameOfFaculty;
//        this.groups = groups;
//    }

    //Конструктор
    public Faculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
        this.groups = new ArrayList<>();
    }

    //Геттеры
    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    //Сеттеры
    public void setNameOfFaculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    //
//    public void transferToGroup(Group newGroup){
//        for(Group gr : groups){
//            if (gr.getStudents().size() < 2){
//                newGroup.getStudents().addAll(students);
//            }
//        }
//    }

}
/*
Вызвав метод addAll() , можно добавить все содержимое одной коллекции в другую.

1. Создать класс факультет (Faculty).
У факультета: наименование факультета, список групп (List<Group> groups.)
Реализовать во всех классах методы геттеры и сеттеры.

1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)

1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup);
 */