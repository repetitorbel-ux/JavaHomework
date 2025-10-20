package org.example.task9;

public class Dog extends Animals {
    private String name;
    private String breedOfDog;
    private int weightAverage;

    //Конструктор без параметров
    public Dog() {
    }

    //***Конструктор с параметрами родителя и собственными
    public Dog(String color, int maxOfLife, String typeOfFood, String name, String breedOfDog, int weightAverage) {
        super(color, maxOfLife, typeOfFood); //Вызов конструктор родителя Animals
        this.name = name;
        this.breedOfDog = breedOfDog;
        this.weightAverage = weightAverage;
    }

    //***Геттеры
    public String getName() {
        return name;
    }

    public String getBreedOfDog() {
        return breedOfDog;
    }

    public int getWeightAverage() {
        return weightAverage;
    }

    //***Методы характерные для собаки
    public void bark() {
        System.out.println(name + "лает");
    }

    public void bite() {
        System.out.println(name + "кусает");
    }

    public void run() {
        System.out.println(name + "бегает");
    }

    //***Переопределенные методы родительского класса, характерные для всех видов животных***
    @Override
    public void makeSound() {
        System.out.println(name + "лает ");
    }

    @Override
    public void play() {
        System.out.println(name + "играет с мячиком.");
    }

    @Override
    public void jump() {
        System.out.println(name +" прыгает");
    }

    //***Метод (переопределенный), который будет выводить информацию о собаке
    @Override
    public String toString(){ // Получение данных из этого класса
        String result = super.toString();
        result = result + " Имя: " + name + " " + " Порода: " + breedOfDog + " " + " Средний вес: " +  weightAverage;
        return result;
    }

    //Переопределение метода equals
    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) obj;
        if (name.equals(dog.getName())
                && breedOfDog.equals(dog.getBreedOfDog())
                && weightAverage == dog.getWeightAverage()
                && getColor().equals(dog.getColor())
                && getMaxOfLife() == dog.getMaxOfLife()
                && getTypeOfFood().equals(dog.getTypeOfFood())){
            return true;
        }
        return false;
    }

    //Переопределение метода hashCode
    public int hashCode() {
        int result = name.hashCode() + breedOfDog.hashCode() + weightAverage * 10;
        return result;
    }

}
/*
В классе собака определить имя, порода, средний вес. В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать. При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
 */