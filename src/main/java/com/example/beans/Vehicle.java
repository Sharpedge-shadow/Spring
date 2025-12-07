package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    public Vehicle() {
        System.out.println("Vehicle Created");
        this.name = "New Mercedes Benz";
    }

    @Override
    public String toString() {
        return "name= " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @PostConstruct
//    public void initialise(){
//        this.name="Range Rover";
//    }

//    @PreDestroy
//    public void destroy(){
//        System.out.println("As context is close ,Destroyed "+this.name+" Bean");
//        this.name=null;
//    }

    public void printHello(){
        System.out.println("Hello using component annotation");
    }
}
