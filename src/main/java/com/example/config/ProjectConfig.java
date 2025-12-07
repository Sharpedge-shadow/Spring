package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        var vehicle = new Vehicle();
        vehicle.setName("Audi-8");
        return vehicle;
    }

    @Bean(value="RangeRoverValueBeanVehicle")
    Vehicle vehicle2(){
        var vehicle = new Vehicle();
        vehicle.setName("Ferari");
        return vehicle;
    }
    //for custom naming of the Bean there are three approaches name, value , or default parameter
    @Primary // to make bean default for context when there is ambiguity
    @Bean(name="RangeRoverNameBeanVehicle")
    Vehicle vehicle3(){
        var vehicle = new Vehicle();
        vehicle.setName("Range Rover");
        return vehicle;
    }

    @Bean("RangeRoverWithoutNameAndValueBeanVehicle")
    String hello(){
        return  "Hello World";
    }

    @Bean
    Integer number(){
        return 16;
    }
}
