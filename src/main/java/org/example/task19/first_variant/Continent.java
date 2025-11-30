package org.example.task19.first_variant;

public enum Continent {
    //Статические переменные
    EURASIA ("Евразия"),
    AFRICA ("Африка"),
    NORTH_AMERICA ("Северная Америка");

    //Объявляем поле
    private String nameOfContinent;

    Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }
}
