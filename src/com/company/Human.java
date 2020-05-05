package com.company;

import com.company.urzadzenie.Car;
import com.company.urzadzenie.Phone;

public class Human extends Animal {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
    private Double salary = 1000.0;

    public Human() {
        super(  "homo sapiens");
    }


    public Double getSalary() {
        return salary;
    }
    public void riseMySalary() {
        this.salary *= 1.1;
    }


    public Car getCar() {
        return car;
    }
    public void setCar(Car car) throws Exception{
        if (car.value > this.salary * 12 ) {
            throw new Exception("nie udalo sie");
        } else {
            this.car = car;
        }

    }


}