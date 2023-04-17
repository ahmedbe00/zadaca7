package org.ahmedbe00.qamp.zadaci.zadaca7.task2;

public class Main {
    public static void main(String[] args) {
        final Vehicle vehicle=new Vehicle("Golf");
        vehicle.accelerate(50);
        vehicle.decelerate(40);
        System.out.println(vehicle.toString());
        System.out.println("\n");

        final Car car=new Car("Ferrari",100);
        System.out.println(car.toString());
        car.accelerate(100);
        car.decelerate(50);
        System.out.println(car.toString());
        System.out.println("\n");

        final ElectricCar electricCar=new ElectricCar("Tesla",1000);
        System.out.println(electricCar.toString());
        electricCar.accelerate(100);
        electricCar.decelerate(80);
        System.out.println(electricCar.toString());
    }
}
