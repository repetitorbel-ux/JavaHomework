package org.example.task19;

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

    public void setNameOfContinent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }
}
