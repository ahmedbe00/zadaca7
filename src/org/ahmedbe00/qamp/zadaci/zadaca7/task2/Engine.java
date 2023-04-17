package org.ahmedbe00.qamp.zadaci.zadaca7.task2;

public class Engine {
    protected double capacity;
    public Engine(double capacity){
        this.capacity=capacity;
    }
    public double increaseCapacity(double capacity){
        this.capacity+=capacity;
        return  this.capacity;
    }
    public double decreaseCapacity(double capacity){
        this.capacity-=capacity;
        return  this.capacity;
    }
    public String toString(){
        return "Capacity :{"+this.capacity+"}";
    }
   // protected double getCapacity(){
     //  return this.capacity;
    //}
}
