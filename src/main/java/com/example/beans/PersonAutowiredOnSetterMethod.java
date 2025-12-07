package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonAutowiredOnSetterMethod {
    private String name;

    private Vehicle Vehicle;

    public PersonAutowiredOnSetterMethod(){
        System.out.println("Person Created");
        this.name = "JohnCena";
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
    @Autowired
    public void setVehicle(Vehicle Vehicle) {
        this.Vehicle = Vehicle;
    }
}
