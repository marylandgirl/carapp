package com.example.carapp;

public class Porche implements Car {
    private String startStr = "";
    private String color = "";
    private String make = "";
    private String model = "";
    private int speed;
    private String emitCheck = "";


    public Porche(){
        startStr = "A Porche has started.";
        make = "Volkswagen";
        model = "Porche";
        speed = 0;
        emitCheck = "pass";

    }

    public String getStartStr(){
        return startStr;
    }

    public Porche(String color){
        this();
        this.color = color;
    }

    public String start() {
        return getStartStr();
    }


    public String drive() {
        return "The " + color + " " + model + " is going " + speed + " mph";
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String accelerate() {
        setSpeed(speed += 5);
        return "The " + color + " " + model + " is accelerating";
    }

    public String stop() {
        return "The " + color + " " + model + " is stopped";
    }

    public String emmisStatus() {
        return getEmitCheck();
    }

    public void setEmitCheck(String status) {
        emitCheck = status;
    }

    public String getEmitCheck() {
        return emitCheck;
    }
}
