package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import com.example.config.ProjectConfigUsingComponent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Honda City");
//        System.out.println("Vehicle from non spring context is: "+vehicle.getName());


      //  var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //getBean with only vehicle type class if we have two or more bean same return type then we can pass the name of bean as well
        //check line 21
       // Vehicle veh= (Vehicle) context.getBean(Vehicle.class);
       // System.out.println("Vehicle from spring context is: "+veh.getName());

       // Vehicle veh= (Vehicle) context.getBean("vehicle2",Vehicle.class);
       // System.out.println("Vehicle from spring context is: "+veh.getName());

        //Vehicle veh= (Vehicle) context.getBean("RangeRoverNameBeanVehicle",Vehicle.class);
         //System.out.println("Vehicle from spring context with custom bean name is: "+veh.getName());

//        Vehicle veh= (Vehicle) context.getBean(Vehicle.class);
//        System.out.println("Vehicle from spring context with Primary annotation for default bean is: "+veh.getName());
//
//        String hello = context.getBean(String.class);
//        System.out.println("Hello from Spring Context: "+hello);
//
//        Integer num = context.getBean(Integer.class);
//        System.out.println("Number from Spring Context: "+num);

        var context = new AnnotationConfigApplicationContext(ProjectConfigUsingComponent.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle name rom Spring Context is : "+vehicle.getName());
        vehicle.printHello();
    }
}
