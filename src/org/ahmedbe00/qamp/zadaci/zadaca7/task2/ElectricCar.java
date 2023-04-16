package org.ahmedbe00.qamp.zadaci.zadaca7.task2;

public class ElectricCar extends  Vehicle {
    private ElectricEngine electricEngine;

    protected ElectricCar(final String model, final double capacity) {
        super(model);
        this.electricEngine = new ElectricEngine(capacity);
    }
    @Override
    public double accelerate(double speed) {
        if (this.electricEngine.capacity>0) {
            super.accelerate(speed);
        }
        this.electricEngine.decreaseCapacity(0.4*speed);
        return this.speed;
    }
    @Override
    public double decelerate(double brakeSpeed){
        this.electricEngine.brake(brakeSpeed);
        return super.decelerate(brakeSpeed);
    }
    @Override
    public String toString(){
        return super.toString()+ ", "+this.electricEngine.toString();
    }
}
