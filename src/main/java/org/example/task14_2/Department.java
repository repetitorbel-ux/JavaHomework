package org.example.task14_2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Department {
    private String nameOfDepartment;
    Set<Ward> wards;

    //Крнструктор
    public Department(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
        wards = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameOfDepartment='" + nameOfDepartment + '\'' +
                ", wards=" + wards +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Department that)) return false;
        return Objects.equals(nameOfDepartment, that.nameOfDepartment) && Objects.equals(wards, that.wards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfDepartment, wards);
    }

    //Геттеры
    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public Set<Ward> getWards() {
        return wards;
    }

    //Сеттеры
    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public void setWards(Set<Ward> wards) {
        this.wards = wards;
    }

}
/*
1.3 У отделения поля: наименование отделения, список палат (коллекция Set)
 */