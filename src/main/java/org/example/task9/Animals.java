package org.example.task9;

public class Animals extends Zoo{
    private String color;
    private int maxOfLife;
    private String typeOfFood;

    //Конструктор без параметров
    public Animals() {
    }

    //Конструктор с параметрами
    public Animals(String color, int maxOfLife, String typeOfFood) {
        //super();//Автоматически подставляет super() и вызывается конструктор Zoo
        this.color = color;
        this.maxOfLife = maxOfLife;
        this.typeOfFood = typeOfFood;
    }

    //***Геттеры
    public String getColor() {
        return color;
    }

    public int getMaxOfLife() {
        return maxOfLife;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    //Методы, реализующие действия, характерные для всех видов животных
    public void makeSound() {
        System.out.println("Животное издает звуки ");
    }

    public void play() {
        System.out.println("Животное играет ");
    }

    public void jump() {
        System.out.println("Животное или птица прыгают ");
    }

    //Метод, который будет выводить информацию о животном (toString)
    @Override
    public String toString(){ // Получение данных из этого класса
        String result = "";
        result = result + " Цвет: " + color + " " + " Продолжительность жизни: " + maxOfLife + " " + " Тип еды: " +  typeOfFood;
        return result;
    }

    //Переопределение метода equals
    public boolean equals(Object obj) {
        if (!(obj instanceof Animals)) {
            return false;
        }
        Animals animalsZoo = (Animals) obj;
        if (color.equals(animalsZoo.getColor())
                && maxOfLife == animalsZoo.getMaxOfLife()
                && typeOfFood.equals(animalsZoo.getTypeOfFood())){
            return true;
        }
        return false;
    }

    //Переопределение метода hashCode
    public int hashCode() {
        int result = color.hashCode() + maxOfLife * 10 +  typeOfFood.hashCode();
        return result;
    }

}

/*
 public String makeSound() {
        String result = "";
        result = result + "Животное издает звуки ";
        return result;
    }
1. Поля в классе животное: окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения).
Определить методы в классе животное: (издание звуков, животное играет)
 */