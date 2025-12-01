package org.example.task19.first_variant;

import org.example.task19.ModifyString;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MainJustLambda {
    public static void main(String[] args) {

        System.out.println("****************************************");
        //1.1 На основании интерфейса ModifyString создать лямбда выражение, которое будет возвращать строку с большими буквами.
        String str = "Hello";
        ModifyString modifyString = (city ->{
            return city.toUpperCase();
        });

        String resultString = modifyString.toUpper(str);
        System.out.println(resultString);

        System.out.println("****************************************");

        City city1 = new City(1, "London", 1000000, Continent.EURASIA);
        City city2 = new City(2, "Paris", 2200000, Continent.EURASIA);
        City city3 = new City(3, "Antananarivo", 500000, Continent.AFRICA);
        City city4 = new City(4, "Warszawa", 3100000, Continent.EURASIA);
        City city5 = new City(5, "Chikago", 100000, Continent.NORTH_AMERICA);
        City city6 = new City(6, "Toronto", 100000, Continent.NORTH_AMERICA);

        List<City> cityList = List.of(city1, city2, city3, city4, city5, city6);

        //1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)
        List<City> cityListNew = cityList.stream().filter((continent) ->{
            if(continent.getNameOfContinent().equals(Continent.EURASIA)){
                return true;
            }
            return false;
        }).toList();
        System.out.println("Список городов континента " + Continent.EURASIA.getNameOfContinent() + ": " + cityListNew);
        System.out.println();

        Stream<City> cityStream = cityListNew.stream();
        Optional<City> resultOptinal = cityStream.max(Comparator.comparing(city -> city.getCountPopulation()));
            if (resultOptinal.isPresent()) {
                City cityMaxPopulation = resultOptinal.get();
                System.out.println("Самый густонаселённый город на континенте " + Continent.EURASIA.getNameOfContinent() + ": " + cityMaxPopulation);
            } else {
                return;
            };
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
map(String.valueOf(c1))
 */