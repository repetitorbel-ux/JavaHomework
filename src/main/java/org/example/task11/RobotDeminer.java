package org.example.task11;

public class RobotDeminer implements Robot, RobotEngineer{
    private String model;
    private int power;
    private String vin;
    private String material;
    private boolean isOn;

    //Конструктор
    public RobotDeminer(String model, int power, String vin, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.vin = vin;
        this.material = material;
        this.isOn = isOn;
    }

    //Перепопределение абстрактных методов
    @Override
    public void turnOn(boolean b) {
        //this.isOn = b;
        if (isOn) {
            System.out.println("Робот-сапер уже включен");
        } else {
            System.out.println("Включаем робота-сапера");
            setOn(b);
        }
    }

    @Override
    public void turnOff(boolean b) {
        if(!isOn){
            System.out.println("Робот-сапер уже выключен");
        }else {
            System.out.println("Выключаем робота-сапера");
            setOn(b);
        }
    }

    @Override
    public void uniquePossibility() {
        System.out.println("Робот-сапер умеет разминировать взрывчатые устройства");
    }

    @Override
    public void createItem() {
        System.out.println("Робот-сапер создаёт приспособление для разминирования");
    }

    //Переопределение дефолтного метода
    @Override
    public void repairRobot(){
        System.out.println("Робот-сапер на ремонте");
    }

    //Геттеры и сеттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}

/*
РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)
В классе РоботСапёр переопределите дефолтный метод (отремонтировать робота)
 */