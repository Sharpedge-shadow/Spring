package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.beans.Vehicle1;
import com.example.config.ProjectConfig;
import com.example.config.ProjectConfigUsingComponent;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

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

//        var context = new AnnotationConfigApplicationContext(ProjectConfigUsingComponent.class);
//        Vehicle vehicle = context.getBean(Vehicle.class);
//        System.out.println("Component Vehicle name rom Spring Context is : "+vehicle.getName());
//        vehicle.printHello();
//        context.close();


        //To check registerBean conditionally
//        var context = new AnnotationConfigApplicationContext(ProjectConfigUsingComponent.class);
//
//        Vehicle1 volkswagen = new Vehicle1();
//        volkswagen.setName("Volkswagen");
//        Supplier<Vehicle1> volkswagensupplier = () -> volkswagen;
//
//        Supplier<Vehicle1> Audisupplier = () -> {
//            Vehicle1 audi = new Vehicle1();
//            audi.setName("Audi");
//            return audi;
//        };
//
//        Random random = new Random();
//        int randomNumber = random.nextInt(10);
//        System.out.println("Random number: " + randomNumber);
//
//        if(randomNumber % 2 == 0){
//            context.registerBean("Volkswagen",Vehicle1.class,volkswagensupplier);
//        }
//        else{
//            context.registerBean("Audi",Vehicle1.class,Audisupplier);
//        }
//
//        Vehicle1 VolksVehicle =null;
//        Vehicle1 audiVehicle=null;
//
//        try{
//            VolksVehicle =context.getBean("Volkswagen",Vehicle1.class);
//        }
//        catch(NoSuchBeanDefinitionException e){
//            System.out.println("Error while creating bean VolksVehicle");
//        }
//        try{
//            audiVehicle=context.getBean("Audi",Vehicle1.class);
//        }catch(NoSuchBeanDefinitionException e){
//            System.out.println("Error while creating bean Audi");
//        }
//
//        if(VolksVehicle !=null){
//            System.out.println("Programming vehicle name from spring context is: "+VolksVehicle.getName());
//        }
//        else{
//            System.out.println("Programming vehicle name from spring context is: "+audiVehicle.getName());
//        }


        //Wiring
        var context =  new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);
        System.out.println("Vehicle name from spring context is: "+vehicle.getName());
        System.out.println("Person name from spring context is: "+person.getName());
        System.out.println("Vehicle that person own is:"+person.getVehicle());

    }
}
