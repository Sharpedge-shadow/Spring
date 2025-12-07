package com.example.beans;

public class Person {
    private String name;
    private Vehicle Vehicle;

    public Person(){
        System.out.println("Person Created");
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
    public void setVehicle(Vehicle Vehicle) {
        this.Vehicle = Vehicle;
    }
}

