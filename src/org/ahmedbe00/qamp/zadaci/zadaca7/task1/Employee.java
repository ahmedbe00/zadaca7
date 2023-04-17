package org.ahmedbe00.qamp.zadaci.zadaca7.task1;

public class Employee extends Person{
protected double annualSallary;
protected String insuranceNumber;
public Employee(String name,double annualSallary,String insuranceNumber){
    super(name);
    this.annualSallary=annualSallary;
    this.insuranceNumber=insuranceNumber;
    }
    public String toString(){
        return "name :{"+this.name+"}, "+" Annual salary :{"+this.annualSallary+"}, "+" Insurance number :{"+this.insuranceNumber+"}";
    }
}
