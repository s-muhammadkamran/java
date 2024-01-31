package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainClass {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(MainClass.class)) {
            var max = context.getBean(BusinessCalculationService.class).findMax();
            System.out.println(max);
        }
    }
}
