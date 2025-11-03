package org.example.task14_2;

import java.util.HashSet;
import java.util.Set;

public class Ward {
    private int numberOfWard;
    private Gender type;
    Set<Patient> patients;

    //Конструктор с двумя параметрами (кроме объекта)
    public Ward(int numberOfWard, Gender type) {
        this.numberOfWard = numberOfWard;
        this.type = type;
        patients = new HashSet<>();
    }

    //Метод подсчета количества мужчин и женщин в отделении
    public int countOfPatients() {
        return patients.size();
    }

    //Метод добавления в палату с проверкой диагноза
    public void addPacient(Patient patient){
        //Если палата пустая, добавляем пациента
        if (patients.isEmpty()){
            patients.add(patient);
            System.out.println("Пациент " + patient.getSurname() + " добавлен в пустую палату.");
        }else {
            //Проверка на соответствие диагноза и на переполнение палаты
            String diagnosisOfPatients = "";
            for (Patient p : patients) {//Цикл перебора пациентов
                diagnosisOfPatients = p.getDiagnosis();//Получение диагноза (пациент не важен, так как в палате все с одинаковыми диагнозами)
                break; // выходим сразу после получения диагноза
            }
            if (diagnosisOfPatients.equals(patient.getDiagnosis())){//Сверяем полученный диагноз с диагнозом поступающего пациента
                if (patients.size() < 3){//Если пациент диагнозы одинаковые - проверяем, чтобы в палате не оказалось больше 3-х пациентов
                    patients.add(patient);//Добавляем пациента
                    System.out.println("Пациент " + patient.getSurname() + " добавлен в палату " + getNumberOfWard());
                }else System.out.println("Палата " + + getNumberOfWard() + " переполнена!");
            }else {
                System.out.println("Нельзя добавить пациента с другим диагнозом: " + patient.getDiagnosis());
            }
        }
    }

    //Метод вывода пациентов
    public String info() {
        return '{' + "Номер палаты: " + numberOfWard + ", тип палаты: " + getType() + ", Пациенты: " + patients + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ward)) {
            return false;
        }
        Ward ward = (Ward) obj;
        if(numberOfWard == ward.getNumberOfWard() && getType().equals(ward.getType()) && getPatients().equals(ward.getPatients())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = numberOfWard * 10 + type.hashCode() + patients.hashCode();
        return result;
    }

    //Геттеры
    public int getNumberOfWard() {
        return numberOfWard;
    }

    public Gender getType() {
        return type;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    //Сеттеры
    public void setNumberOfWard(int numberOfWard) {
        this.numberOfWard = numberOfWard;
    }

    public void setType(Gender type) {
        this.type = type;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }


}
/*
1.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов

 */