package org.ahmedbe00.qamp.zadaci.zadaca7.task2;

public class ElectricEngine extends Engine{

    protected ElectricEngine(double capacity) {
        super(capacity);
   }

    protected double brake(double brakeSpeed) {
        return this.capacity += 0.1 * brakeSpeed;
    }
}
