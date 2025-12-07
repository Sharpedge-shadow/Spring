package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Vehicle1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @PreDestroy
    public void destroy(){
        System.out.println("As context is close ,Destroyed "+this.name+" Bean");
        this.name=null;
    }

    public void printHello(){
        System.out.println("Hello using component annotation");
    }
}
