package org.example.task14_2;

public class Patient {
    private int id;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    private Gender type;

    public Patient(int id, String name, String surname, String diagnosis, int age, Gender type) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.age = age;
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Patient)) {
            return false;
        }
        Patient patient = (Patient) obj;
        if(getId() == patient.getId() && getName().equals(patient.getName()) && getSurname().equals(patient.getSurname())
                && getDiagnosis().equals(patient.getDiagnosis()) && getAge() == patient.getAge() && getType().equals(patient.getType())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = id * 31 + name.hashCode() + surname.hashCode() + diagnosis.hashCode() + age * 31 + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return id + ", Имя: '" + name + '\'' + ", Фамилия: '" + surname + '\'' + ", диагноз: '" + diagnosis + '\'' +
                ", возраст: " + age + ", пол: " + type;
    }

    //Геттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getAge() {
        return age;
    }

    public Gender getType() {
        return type;
    }

    //Сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(Gender type) {
        this.type = type;
    }
}
/*
1.1 У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст, пол (сделать enum класс: Мужской, Женский).
 */