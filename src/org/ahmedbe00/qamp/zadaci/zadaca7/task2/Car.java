package org.ahmedbe00.qamp.zadaci.zadaca7.task2;

public class Car extends Vehicle{
    private DieselEngine engine;
    protected Car(final String model, final double capacity) {
        super(model);
        this.engine = new DieselEngine(capacity);
    }

    @Override
    public double accelerate(double speed) {
        if (this.engine.capacity>0) {
            super.accelerate(speed);
        }
        this.engine.decreaseCapacity(0.2*speed);
        return this.speed;
    }
    @Override
    public String toString(){
        return super.toString()+ ", "+this.engine.toString();
    }

}
