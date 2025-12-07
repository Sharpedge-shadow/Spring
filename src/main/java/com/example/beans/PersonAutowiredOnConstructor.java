package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonAutowiredOnConstructor {
    private String name;

    private final Vehicle Vehicle;

    //Autowired here is optional as there is only single Constructor but there is more than one so to avoid ambiguity ,
    //Autowired needs to used compulsory
    @Autowired
    public PersonAutowiredOnConstructor(Vehicle vehicle) {
        System.out.println("Person Created");
        this.name = "JohnCena";
        this.Vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return Vehicle;
    }


}
