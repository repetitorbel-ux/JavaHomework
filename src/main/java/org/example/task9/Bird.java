package org.example.task9;

public class Bird extends Animals {
    private String family;
    private int maxOfFlight;

    //Конструктор с параметрами родителя и собственными
    public Bird(String color, int maxOfLife, String typeOfFood, String family, int maxOfFlight) {
        super(color, maxOfLife, typeOfFood);
        this.family = family;
        this.maxOfFlight = maxOfFlight;
    }

    //Конструктор без параметров
    public Bird() {
    }

    //**Геттеры
    public String getFamily() {
        return family;
    }

    public int getMaxOfFlight() {
        return maxOfFlight;
    }

    //***Методы характерные для птицы
    public void sing() {
        System.out.println(family + "поёт");
    }

    public void peck() {
        System.out.println(family + "клюёт");
    }

    public void nest() {
        System.out.println(family + "высиживает птенцов");
    }

    //***Переопределенные методы родительского класса, характерные для всех видов животных***
    @Override
    public void makeSound() {
        System.out.println(family + "поёт ");
    }

    @Override
    public void play() {
        System.out.println(family + "качается на проводах");
    }

    @Override
    public void jump() {
        System.out.println(family + "прыгает");
    }

    //***Метод (переопределенный), который будет выводить информацию о птице
    @Override
    public  String toString(){ // Получение данных из этого класса
        String result = super.toString(); //вызов метода родительского класса, чтобы toString выводил все поля и родительские и дочерние
        result = result + " Семейство: " + family + " " + " Максимальная высота полета: " + maxOfFlight; //
        return result;
    }

    //Переопределение метода equals
    public boolean equals(Object obj) {
        if (!(obj instanceof Bird)) {
            return false;
        }
        Bird bird = (Bird) obj;
        if (family.equals(bird.getFamily())
                && maxOfFlight == bird.getMaxOfFlight()
                && getColor().equals(bird.getColor())
                && getMaxOfLife() == bird.getMaxOfLife()
                && getTypeOfFood().equals(bird.getTypeOfFood())){
            return true;
        }
        return false;
    }

    //Переопределение метода hashCode
    public int hashCode() {
        int result = family.hashCode() + maxOfFlight * 10;
        return result;
    }
}
/*
Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь, клевать, высиживать птенцов.
При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт). Использовать наследование, где суперкласс-Животное.
 */