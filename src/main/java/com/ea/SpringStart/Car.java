package com.ea.SpringStart;

import org.springframework.stereotype.Component;

@Component
public class Car {


    public Car() {
        System.out.println("********* car.java in  com.ea.SpringStart.Car instantiated");
    }

    public void getCar() {
        System.out.println("********* getCar() in  Toyota");
    }
}
