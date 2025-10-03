package org.example.task7;

class Student{
    int id, course, grade;
    String name, surname, faculty, group;
// Параметризованный конструктор
    Student(int i_d, String n, String sn, String fct, int crs, String grp, int grd) {
        id = i_d;
        name = n;
        surname = sn;
        faculty = fct;
        course = crs;
        group = grp;
        grade = grd;
    }

//Конструктор без параметров
    Student(){
    }

//2 Метод, выводящий информацию по полям класса Students
    void info() {
        System.out.println("Студент " + id + name + surname + faculty + course + group + "Средня оценка " + grade);
    }

//3 Метод, изменяющий текущую группу студента (в качестве параметра принимает новую группу)
    public void setGroup(String newGroup) {
        this.group = newGroup;
        //System.out.println(group);
    }

//4 Метод, возвращающий текущую группу студента
    public String currentGroup(){
        //System.out.print("Студент: " + name + surname);
        //System.out.println(group);
        return group;
        }

//5 Метод, изменяющий оценку студента и группу студента
    //public void setGroupAndGrade(String newGroup, int newGrade){
public void setGroupAndGrade(){
        this.group = " Группа 112 ";
        this.grade = grade + 1;
    }

//7Метод, принимающий массив студентов и возвращающий из этих студентов массив студентов у которых оценка выше переданной оценке в методе.
    public static Student[] getStudents(Student[] student, int mark) {
        int count = 0;
        //подсчет кол-ва студентов, имеющих оценку выше передаваемой
        for (int i = 0; i < student.length-1; i++){
            if(student[i].grade > mark){
                count++;
            }
        }
        //создание массива размером, найденным на предыдущем шаге
        Student[] studentsHighGrade = new Student[count];
        //заполнение массива
        int j = 0;
        for (int i = 0; i < student.length-1; i++){
            if(student[i].grade > mark){
                studentsHighGrade[j] = student[i];
                j++;
            }
        }
        return studentsHighGrade;
    }
}

public class Main{
    public static void main(String[] args) {

    //Создание массива из пяти студентов
        Student[] student = new Student[5];
        student[0] = new Student(1, " Сергей ", "Иванов ",  "Радиотехника ", 1, " Группа 101 ", 8);
        student[1] = new Student(2, " Иван ", "Петров " , "Радиотехника ", 1, " Группа 102 ", 7);
        student[2] = new Student(3, " Матвей ", "Канончик ",  "Радиотехника ", 1, " Группа 102 ", 7);
        student[3] = new Student(4, " Василий ", "Гайда " , "Радиосистемы ", 2, " Группа 100 ", 9);
        student[4] = new Student(5, " Евгений ", "Данейко " , "Радиосистемы ", 2, " Группа 100 ", 6);

        System.out.println(" "); //пустая строка

    //3. Вызов метода, который будет изменять текущую группу, например студента 1 (в метод в качестве параметра передается новая группа)
        student[0].setGroup(" Группа 111 ");

    //4. Вызов метода, возвращающего текущую группу того студента, которому изменили группу
        String newGroup = student[0].currentGroup();
        System.out.println("Новая группа студента: " + newGroup);

        System.out.println(" "); //пустая строка

    //5. Вызов метода, изменяющего текущую группу и оценку, например, второго студента
        student[1].setGroupAndGrade();

    //7. Получение массива студентов, у которых оценка выше переданной оценке в методе
        Student[] filteredStudents; //Объявление переменной, в которой будет лежать массив отфильтрованных студентов
        filteredStudents = Student.getStudents(student, 7);//Вызов метода, фильтрующего студентов с оценкой выше заданной и присваивание результат переменной

    //п. Вывод студентов, у которых оценка выше переданной оценке в методе filteredStudents()
        System.out.println("Студенты с оценкой выше 7:");
        for(int i = 0; i < filteredStudents.length; i++){
            filteredStudents[i].info();
        }
    }
}