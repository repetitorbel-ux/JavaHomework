package org.example.task11;

public class RobotBuilder implements Robot, RobotEngineer{
    private String model;
    private int power;
    private String madeOn;
    private String buildUnit;
    private String material;
    private boolean isOn;

    //Конструктор
    public RobotBuilder(String model, int power, String madeOn, String buildUnit, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.madeOn = madeOn;
        this.buildUnit = buildUnit;
        this.material = material;
        this.isOn = isOn;
    }

    //Перепопределение абстрактных методов
    @Override
    public void turnOn(boolean b) {
        //this.isOn = b;
        if (isOn) {
            System.out.println("Робот-строитель уже включен");
        } else {
            System.out.println("Включаем робота-строителя");
            setOn(b);
        }
    }

    @Override
    public void turnOff(boolean b) {
        if(!isOn){
            System.out.println("Робот-строитель уже выключен");
        }else {
            System.out.println("Выключаем робота-строителя");
            setOn(b);
        }
    }

    @Override
    public void uniquePossibility() {
        System.out.println("Робот-строитель умеет строить разные сооружения");
    }

    @Override
    public void createItem() {
        System.out.println("Робот-строитель создаёт бетон");
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

    public String getBuildUnit() {
        return buildUnit;
    }

    public void setBuildUnit(String buildUnit) {
        this.buildUnit = buildUnit;
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
РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)
 */