package org.ahmedbe00.qamp.zadaci.zadaca7.task2;

public class Vehicle {
    protected double speed;
    private String model;

    public Vehicle(String model) {
        this.model = model;
        this.speed = 0.0;
    }

    public double accelerate(double speed) {
        this.speed += speed;
        return this.speed;
    }

    public double decelerate(double speed) {
        double newSpeed = this.speed - speed;
        if (newSpeed < 0) {
           return this.speed = 0.0;
        } else {
           return this.speed = newSpeed;
        }
    }
    public String toString(){
        return "Vehicle :{"+this.model+"}, "+"Speed :{"+this.speed+"}";
    }
}
