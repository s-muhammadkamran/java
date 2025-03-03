package com.in28minutes.learnspringframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan //@ComponentScan("com.in28minutes.learnspringframework.examples.a0")
public class SimpleSpringContextLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(
                SimpleSpringContextLauncherApplication.class
        )) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}