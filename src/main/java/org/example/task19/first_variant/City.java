package org.example.task19.first_variant;

import java.util.Objects;

public class City {
    private int id;
    private String nameOfCity;
    private int countPopulation;
    private Continent nameOfContinent;

    public City(int id, String nameOfCity, int countPopulation, Continent nameOfContinent) {
        this.id = id;
        this.nameOfCity = nameOfCity;
        this.countPopulation = countPopulation;
        this.nameOfContinent = nameOfContinent;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof City city)) return false;
        return id == city.id && Double.compare(countPopulation, city.countPopulation) == 0 && Objects.equals(nameOfCity, city.nameOfCity) && nameOfContinent == city.nameOfContinent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfCity, countPopulation, nameOfContinent);
    }

//    @Override
//    public String toString() {
//        return "City{" +
//                "id=" + id +
//                ", nameOfCity='" + nameOfCity + '\'' +
//                ", countPopulation=" + countPopulation +
//                ", name=" + nameOfContinent +
//                '}';
//    }

    public String toString() {
        return  nameOfCity;
    }

    public int getId() {
        return id;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public int getCountPopulation() {
        return countPopulation;
    }

    public Continent getNameOfContinent() {
        return nameOfContinent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public void setCountPopulation(int countPopulation) {
        this.countPopulation = countPopulation;
    }

    public void setNameOfContinent(Continent nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }


}
/*
 1 Создать интерфейс, который будет обрабатывать входящий параметр типа String.
1.1 На основании этого интерфейса создать лямбда выражение, которое будет возвращать строку с большими буквами.
2. Создать класс Город. Поля id, имя города, население, континент (Enum)
1.1. Создать города
1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)
1.3. Найти город, с минимальным населением на континенте. (filter по континенту+ min)
1.4. Найти самый густонаселённый город (max)
1.5. Найти город с самым маленьким населением. (min)
1.6. Найти первый попавшиеся город, у которого население больше 1млн. (filter + findFirst).
1.7. Отобрать города с населением больше 1 млн. (filter)
1.8. Создать коллекцию из названий городов, на основании объектов (map)
 */