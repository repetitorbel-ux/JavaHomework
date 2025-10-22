package org.example.task11;

public class RobotCooker implements Robot{
    private String model;
    private int power;
    private String madeOn;
    private String cookingUnit;
    private boolean isOn;

    //Конструктор
    public RobotCooker(String model, int power, String madeOn, String cookingUnit, boolean isOn) {
        this.model = model;
        this.power = power;
        this.madeOn = madeOn;
        this.cookingUnit = cookingUnit;
        this.isOn = isOn;
    }

    //Перепопределение абстрактных методов
    @Override
    public void turnOn(boolean b) {
        //this.isOn = b;
        if (isOn) {
            System.out.println("Робот-повар уже включен");
        } else {
            System.out.println("Включаем робота-повара");
            setOn(b);
        }
    }

    @Override
    public void turnOff(boolean b) {
        if(!isOn){
            System.out.println("Робот-повар уже выключен");
        }else {
            System.out.println("Выключаем робота-повара");
            setOn(b);
        }
    }

    @Override
    public void uniquePossibility() {
        System.out.println("Робот-повар вкусно готовит");
    }

    //Нужно переопределить, так как он переопределн в Robot
    @Override
    public void createItem() {
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

    public String getMadeOn() {
        return madeOn;
    }

    public void setMadeOn(String madeOn) {
        this.madeOn = madeOn;
    }

    public String getCookingUnit() {
        return cookingUnit;
    }

    public void setCookingUnit(String cookingUnit) {
        this.cookingUnit = cookingUnit;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
/*
РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).
 */