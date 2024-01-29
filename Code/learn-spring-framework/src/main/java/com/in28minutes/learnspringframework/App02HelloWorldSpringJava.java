package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpringJava {
    public static void main(String[] args) {
        //1: Launch a Spring Context

        var context =
                new AnnotationConfigApplicationContext (HelloWorldConfiguration.class);

        //2: Configure the thing that we want Sprint to manage
        //   Using @Configuration class
        //   We did this using the HelloWorldConfiguration class

        //3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
    }
}