package com.in28minutes.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Arrays;

@Component
class YourBusinessClass {
    //@Autowired
    private Dependency1 dependency1;
    //@Autowired
    private Dependency2 dependency2;

    //In this case no Autowiring is required.
    //All the dependencies are set at 1 place.
    //@Autowired //Not needed Autowired in constructor injection
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor Injection your business class");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    //@Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("setDependicy1 is invoked");
        this.dependency1 = dependency1;
    }

    //@Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("setDependicy2 is invoked");
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1 {}

@Component
class Dependency2 {}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(
                DepInjectionLauncherApplication.class
        )) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}