package org.example.task14_2;

public enum Gender {

    //Статические переменные
    MALE ("Мужской"),
    FEMALE ("Женский"),
    MALE_WARD ("Мужская"),
    FEMALE_WARD ("Женская");


    //Объявляем поле
    private String enumType;
    private String name;

    //Конструктор
    Gender(String enumType) {
        this.enumType = enumType;
    }

//    Gender(String enumType, String name) {
//        this.enumType = enumType;
//        this.name = name;
//    }

    @Override
    public String toString() {
        return  enumType;
    }

    //Геттер
    public String getEnumType() {
        return enumType;
    }

    public String getName() {
        return name;
    }

    //Сеттер
    public void setEnumType(String enumType) {
        this.enumType = enumType;
    }
}
/*
1.1 У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст,
пол (сделать enum класс: Мужской, Женский).
 */