package org.example.task12;

public class Garage<T extends Vehicle>   { // Объявление generic класса Garage, который может работать только с типами, наследующимися от Vehicle

    private T transport; // Поле для хранения объекта транспортного средства (тип T)

    // Конструктор
    public Garage(T t) {
        this.transport = t;
    }

    // Метод для проверки, разрешен ли въезд
    public boolean isEntryPermitted(){
        if(transport.getEmissions() > 100){ // Если уровень выбросов транспортного средства больше 100
            return false; // Вернуть false (въезд запрещен)
        }else return true; // В противном случае вернуть true (въезд разрешен)
    }

}
/*
1.3 Создать generic класс Garage<T extends Vehicle >, который может хранить только объекты типа наследуемого от Vehicle.
1.4 Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж в зависимости от количество выбросов транспортного средства. (Boolean isEntryPermitted()); Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.

 */