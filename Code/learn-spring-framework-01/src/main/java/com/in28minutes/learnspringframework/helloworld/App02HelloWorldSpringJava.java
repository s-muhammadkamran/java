package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpringJava {
    public static void main(String[] args) {
        //1: Launch a Spring Context
        try(var context =
                new AnnotationConfigApplicationContext (HelloWorldConfiguration.class)) {
            //2: Configure the thing that we want Sprint to manage
            //   Using @Configuration class
            //   We did this using the HelloWorldConfiguration class

            //3: Retrieving Beans managed by Spring
            var name = context.getBean("GetMyName");
            var person = context.getBean("MyPerson");
            System.out.println(name.getClass());
            System.out.println(name);
            System.out.println(context.getBean("MyAge"));
            System.out.println(person);
            System.out.println(context.getBean("MyAddress"));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean(Citizen.class));
            System.out.println(context.getBean(Citizen1.class, "Shama", 50, "N Nazimabad", "Karachi"));

            //How many objects are managed by Spring container.
            System.out.println("\n\nList of Beans managed by Spring");
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}