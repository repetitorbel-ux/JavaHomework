package org.example.task19;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MainWithMethods {
    public static void main(String[] args) {

        System.out.println("****************************************");
        //1.1 На основании интерфейса ModifyString создать лямбда выражение, которое будет возвращать строку с большими буквами.
        String str = "Hello";
        ModifyString modifyString = (city -> {
            return city.toUpperCase();
        });

        String resultString = modifyString.toUpper(str);
        System.out.println(resultString);

        System.out.println("********************************************************************************************************");

        //1.1. Создать города
        City city1 = new City(1, "London", 1000000, Continent.EURASIA);
        City city2 = new City(2, "Paris", 2200000, Continent.EURASIA);
        City city3 = new City(3, "Antananarivo", 500000, Continent.AFRICA);
        City city4 = new City(4, "Warszawa", 3100000, Continent.EURASIA);
        City city5 = new City(5, "Chikago", 1000000, Continent.NORTH_AMERICA);
        City city6 = new City(6, "Toronto", 1200000, Continent.NORTH_AMERICA);

        //Коллекция городов
        List<City> cityList = List.of(city1, city2, city3, city4, city5, city6);

        //1.2. Найти самый густонаселённый город на континенте
        Optional<City> cityMax = findMaxByContinent(cityList, Continent.NORTH_AMERICA);
        Continent continentEnumMax = Continent.NORTH_AMERICA;
        if (cityMax.isPresent()) {
            City cityMaxPopulation = cityMax.get();
            System.out.println("Самый густонаселённый город на континенте " + continentEnumMax.getNameOfContinent() + ": " + cityMaxPopulation.getNameOfCity() + " с населением " + cityMaxPopulation.getCountPopulation() + " человек");
        }

        System.out.println("----------------------------------------------------------------------------------------");
        //1.3. Найти город, с минимальным населением на континенте.
        Optional<City> cityMin = findMinByContinent(cityList, Continent.EURASIA);
        Continent continentEnumMin = Continent.EURASIA;
        if (cityMin.isPresent()) {
            City cityMinPopulation = cityMin.get();
            System.out.println("Самый малочисленный город на континенте " + continentEnumMin.getNameOfContinent() + ": " + cityMinPopulation.getNameOfCity() + " с населением " + cityMinPopulation.getCountPopulation() + " человек");
        }

        System.out.println("********************************************************************************************************");

        //1.4. Найти самый густонаселённый город (max)
        Optional<City> cityMaxAllContinents = findMaxCity(cityList);
        if (cityMaxAllContinents.isPresent()) {
            City cityMaxPopulation = cityMaxAllContinents.get();
            System.out.println("Самый густонаселённый город в мире " + cityMaxPopulation.getNameOfCity() + " с населением " + cityMaxPopulation.getCountPopulation() + " человек");
        }

        System.out.println("----------------------------------------------------------------------------------------");

        //1.5. Найти город с самым маленьким населением. (min)
        Optional<City> cityMinAllContinents = findMinCity(cityList);
        cityMinAllContinents.ifPresent(city ->{
            System.out.println("Город с самым маленьким населением в мире " + city.getNameOfCity() + " с населением " + city.getCountPopulation() + " человек");
        });

        System.out.println("********************************************************************************************************");

        //1.6. Найти первый попавшиеся город, у которого население больше 1млн.
        Optional<City> firstCityOneMillion = findFirstCityOneMillion(cityList);
        firstCityOneMillion.ifPresent(city ->{
            System.out.println("Первый попавшиеся город, у которого население больше 1млн. " + city.getNameOfCity() + " с населением " + city.getCountPopulation() + " человек");
        });

        System.out.println("********************************************************************************************************");

        //1.7. города с населением больше 1 млн.
        List<City> cityOneMillion = findCityOneMillion(cityList);
        System.out.println("Список городов, у которых население больше 1 млн.: " + cityOneMillion.toString());

        System.out.println("----------------------------------------------------------------------------------------");

        List<String> cityOneMillion2 = findCityOneMillion2(cityList);
        System.out.println("Список городов, у которых население больше 1 млн.: " + cityOneMillion.toString());

        System.out.println("----------------------------------------------------------------------------------------");

        List<String> cityOneMillion3 = findCityOneMillion3(cityList);
        System.out.println("Список городов, у которых население больше 1 млн.: " + cityOneMillion);

        System.out.println("********************************************************************************************************");

        //1.8. Создать коллекцию из названий городов, на основании объектов
        List<String> namesOfCities = findNamesOfCities(cityList);
        System.out.println("Коллекция из названий городов: " + namesOfCities);

        System.out.println("----------------------------------------------------------------------------------------");

        List<String> namesOfCities2 = findNamesOfCities2(cityList);
        System.out.println("Города (строковое представление): " + namesOfCities2);

    }

    private static Optional<City> findMaxByContinent(List<City> cityList, Continent value) {
        Stream<City> cityStream = cityList.stream();
        return cityStream.filter((city) -> {
            return city.getContinent().equals(value);
        }).max(Comparator.comparing(city -> city.getCountPopulation()));
    }

    private static Optional<City> findMinByContinent(List<City> cityList, Continent value) {
        Stream<City> cityStream = cityList.stream();
        return cityStream.filter((city) -> {
            return city.getContinent().equals(value);
        }).min(Comparator.comparing(city -> city.getCountPopulation()));
    }

    private static Optional<City> findMaxCity(List<City> cityList) {
        return cityList.stream().max(Comparator.comparing(city -> {
            return city.getCountPopulation();
        }));
    }

    private static Optional<City> findMinCity(List<City> cityList) {
        return cityList.stream().min(Comparator.comparing(city -> {
            return city.getCountPopulation();
        }));
    }

    private static Optional<City> findFirstCityOneMillion(List<City> cityList) {
        return cityList.stream().filter(city -> {
           return city.getCountPopulation() > 1000000;
        }).findFirst();
    }

    //Метод, возвращающий коллекцию городов согласно фильтру
    private static List<City> findCityOneMillion(List<City> cityList) {
        return cityList.stream().filter(city -> {
            return city.getCountPopulation() > 1000000;
        }).toList();
    }

    //Метод, возвращающий названия городов согласно фильтру, используется строковое представление города и зависит от toString()
    private static List<String> findCityOneMillion2(List<City> cityList) {
        return cityList.stream().filter(city -> {
            return city.getCountPopulation() > 1000000;
        }).map(city -> String.valueOf(city)).toList();
    }

    //Метод, возвращающий названия городов согласно фильтру, используется "реальное" поле nameOfCity и не зависит от toString()
    private static List<String> findCityOneMillion3(List<City> cityList) {
        return cityList.stream().filter(city -> {
            return city.getCountPopulation() > 1000000;
        }).map(city -> city.getNameOfCity()).toList();
    }

    //Метод, возвращающий коллекцию из названий городов, на основании объектов (map)
    private static List<String> findNamesOfCities(List<City> cityList) {
        return cityList.stream().map(city -> {
            return city.getNameOfCity();
        }).toList();
    }

    private static List<String> findNamesOfCities2(List<City> cityList) {
        return cityList.stream().map(city-> String.valueOf(city)).toList();
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
1.8. Создать коллекцию из названий городов, на основании объектов (map) map(String.valueOf(c1))
 */