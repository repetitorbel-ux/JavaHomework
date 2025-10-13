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

    //5 Метод, изменяющий оценку и группу студента
    public void setGroupAndGrade(){
        this.group = " Группа 112 ";
        this.grade = grade + 1;
    }
    //Переопределение метода, изменяющего оценку и группу студента (параметризованный метод)
    public void setGroupAndGrade(String newGroup, int newGrade){
        this.group = newGroup;
        this.grade = newGrade;
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
