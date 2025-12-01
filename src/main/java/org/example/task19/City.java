package org.example.task19;

import java.util.Objects;

public class City {
    private int id;
    private String nameOfCity;
    private int countPopulation;
    private Continent continent;

    public City(int id, String nameOfCity, int countPopulation, Continent continent) {
        this.id = id;
        this.nameOfCity = nameOfCity;
        this.countPopulation = countPopulation;
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof City city)) return false;
        return getId() == city.getId() && getCountPopulation() == city.getCountPopulation() && Objects.equals(getNameOfCity(), city.getNameOfCity()) && getContinent() == city.getContinent();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNameOfCity(), getCountPopulation(), getContinent());
    }

    @Override
//    public String toString() {
//        return "City{" +
//                "id=" + id +
//                ", nameOfCity='" + nameOfCity + '\'' +
//                ", countPopulation=" + countPopulation +
//                ", continent=" + continent +
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

        public Continent getContinent() {
        return continent;
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

    public void setContinent(Continent continent) {
        this.continent = continent;
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