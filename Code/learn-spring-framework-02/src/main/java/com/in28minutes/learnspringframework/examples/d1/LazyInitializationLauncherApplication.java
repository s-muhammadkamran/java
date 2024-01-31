package com.in28minutes.learnspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class A {
    public A() {
        super();
        System.out.println("Eager Initialization of A at loading");
    }
}

@Component
@Lazy
class B {
    private A a;
    public B(A a) {
        super();
        this.a = a;
        System.out.println("Lazy Initialization of B when used");
    }
}

//@ComponentScan("com.in28minutes.learnspringframework.examples.a0")
@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(
                LazyInitializationLauncherApplication.class
        )) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            context.getBean(B.class);
        }
    }
}