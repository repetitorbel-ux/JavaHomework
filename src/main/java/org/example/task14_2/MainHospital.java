package org.example.task14_2;

public class MainHospital {
    public static void main(String[] args) {

        //Создание пациентов
        Patient patient1 = new Patient(1, "Dima", "Ivanov", "ОРВИ",28, Gender.MALE);
        Patient patient2 = new Patient(2, "Vasya", "Antonov", "ОРВИ",36, Gender.MALE);
        Patient patient3 = new Patient(3, "Olya", "Kuzma", "ОРЗ",57, Gender.FEMALE);
        Patient patient4 = new Patient(4, "Lena", "Kuzma", "ОРЗ",57, Gender.FEMALE);
        Patient patient5 = new Patient(5, "Natasha", "Petrova", "ОРЗ",22, Gender.FEMALE);

        //Создание палат
        Ward ward1 = new Ward(1, Gender.MALE_WARD);
        Ward ward2 = new Ward(2, Gender.FEMALE_WARD);

        //Распределение пациентов по палатам
        ward1.getPatients().add(patient1);
        ward1.getPatients().add(patient2);
        ward2.getPatients().add(patient3);
        ward2.getPatients().add(patient4);
        ward2.getPatients().add(patient5);

        //Добавление пациентов с одинаковыми полями
        Patient patient6 = new Patient(3, "Olya", "Kuzma", "ОРЗ",57, Gender.FEMALE);
        Patient patient7 = new Patient(2, "Vasya", "Antonov", "ОРВИ",36, Gender.MALE);

        //Распределение пациентов с одинаковыми полями по палатам
        ward1.getPatients().add(patient7);
        ward2.getPatients().add(patient6);

        //Создание отделения и добавление палат в него
        Department department = new Department("Терапевтическое отделение");
        department.getWards().add(ward1);
        department.getWards().add(ward2);

        //1.5 Вывод количества мужчин и женщин в отделении
        System.out.println();
        System.out.println("Количество мужчин: " + ward1.countOfPatients());
        System.out.println("Количество женщин: " + ward2.countOfPatients());
        System.out.println("**********************************************************************************************************************************");

        //1.6 Добавление пациента на основе диагноза (три разных случая)
        Patient patient8 = new Patient(8, "Ignat", "Fetov", "Бронхит",27, Gender.MALE);
        ward1.addPacient(patient8);//Вызов метода для добавления на основе диагноза
        System.out.println("**********************************************************************************************************************************");
        Patient patient9 = new Patient(9, "Olya", "Kuzma", "ОРЗ",57, Gender.FEMALE);
        ward2.addPacient(patient9);
        System.out.println("**********************************************************************************************************************************");
        Patient patient10 = new Patient(10, "Vitya", "Shepelev", "ОРВИ",29, Gender.MALE);
        ward1.addPacient(patient10);
        System.out.println("**********************************************************************************************************************************");

        //1.7 Вывод информации по всем пациентам в палатах
        System.out.println("Вывод информации по палатам");
        System.out.println(ward1.info());//в палате 1
        System.out.println("**********************************************************************************************************************************");
        System.out.println(ward2.info());//в палате 2

    }
}
/*
1.4 Создать пациентов. Распределить их по палатам. В одной палате по 3 пациента максимум. При этом попробуйте добавит двух пациентов, с одинаковыми полями. Если количество пациентов в палате увеличилось, значит неправильно реализованы equals и hashСode. Палаты распределить по отделениям.
1.5 Посчитать количество мужчин и женщин в отделении.
1.6 Реализовать метод добавления пациента в палату на основе диагноза. Т.е, в палате должны лежать пациенты с одинаковыми диагнозами. Метод реализовать в классе Палата.
1.7 В классе Палата создать метод, которые выводить информацию по всем пациентам в палате.
 */