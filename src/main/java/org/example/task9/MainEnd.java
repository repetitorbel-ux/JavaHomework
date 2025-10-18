package org.example.task9;

public class MainEnd {
    public static void main(String[] args) {

        //Объявляем пустой массив животных
        Animals[] animalsZoo = new Animals[0];
        //Создаем зоопарк и передаем ему этот массив животных
        Zoo myZoo = new Zoo(animalsZoo);

        //1.6 Используя метод по добавлению животного в зоопарк addAnimal(Animal animal) добавляем по три собаки и по три птицы
        Dog dog1 = new Dog("Белый.", 12, "мясо.", "Бим.", "питбуль.", 6);
        myZoo.addAnimal(dog1);
        Dog dog2 = new Dog("Рыжая.", 13, "мясо.", "Чарли.", "карело-финская лайка.", 5);
        myZoo.addAnimal(dog2);
        Dog dog3 = new Dog("Пятнистая.", 10, "мясо, корм", "Бонд.", "далматинец.", 10);
        myZoo.addAnimal(dog3);

        Bird bird1 = new Bird("Серый.", 5, "насекомые.", "Воробей.", 2);
        myZoo.addAnimal(bird1);
        Bird bird2 = new Bird("Черный.", 5, "насекомые.", "Ворона.", 3);
        myZoo.addAnimal(bird2);
        Bird bird3 = new Bird("Оранжевый.", 4, "черви.", "Попугай.", 7);
        myZoo.addAnimal(bird3);
        System.out.println();

        //1.7 Получение всех животных из зоопарка
        //Вызов метода getAnimals (из класса зоопарк), возвращающего всех животных в зоопарке
        animalsZoo = myZoo.getAnimals();//???Нужны пояснения, почему работает без создания нового объекта
        //Animals[] animalsFromZoo = myZoo.getAnimals(); //Создание вспомогательного объекта, куда записываем животных из зоопарка и выполняем вызов метода getAnimals
        System.out.println("В зоопарке живут:");
        //Вывод в строку животных зоопарка
        for(Animals s : animalsZoo){
            System.out.println(s.toString());
        }
        System.out.println();

        //Действия, характерные для всех видов животных
        System.out.println("Действия, характерные для всех видов животных:");
        dog1.makeSound();
        bird1.makeSound();
        dog2.jump();
        bird2.jump();
        dog2.play();
        bird2.play();
        System.out.println();

        //Действия, которые специфичны для конкретного вида животных
        System.out.println("Действия, которые специфичны для конкретного вида животных:");
        dog1.bark();
        bird1.peck();
        dog2.bite();
        bird2.nest();
        dog3.run();
        bird3.sing();
        System.out.println();

        //***equals & hashcode***
        Dog dog4 = new Dog("Белый.", 12, "мясо.", "Бим.", "питбуль.", 6);
        //Сравнение одинаковых по сути объектов
        System.out.println("Результат equals (д.б. true): " +  dog4.equals(dog1));
        System.out.println("Хешкоды должны быть равны: " + dog1.hashCode() + " = " + dog4.hashCode());
        System.out.println();

        //Сравнение разных объектов
        System.out.println("Результат equals (д.б. false): " +  bird1.equals(bird3));
        System.out.println("Хешкоды должны отличаться: " + bird1.hashCode() + " != " + bird3.hashCode());

    }
}
