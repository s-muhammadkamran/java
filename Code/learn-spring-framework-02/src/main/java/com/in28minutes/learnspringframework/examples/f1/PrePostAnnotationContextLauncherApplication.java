package com.in28minutes.learnspringframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency dependency;
    public SomeClass(SomeDependency dep) {
        super();
        this.dependency = dep;
        System.out.println("Some class is initialized");
    }

    @PostConstruct
    public void PostInitialize() {
        System.out.println("SomeClass and it's dependencies are fully initialized");
        this.dependency.getReady();
    }

    @PreDestroy
    public void PreDestroyed() {
        System.out.println("SomeClass is about to be destroyed");
        this.dependency.doCleanUp();
    }
}

@Component
class SomeDependency {
    public SomeDependency() {
        super();
        System.out.println("Some Dependency is initialized");
    }

    public void getReady() {
        System.out.println("Some Business Logic is performed in dependency");
    }

    public void doCleanUp() {
        System.out.println("Clean up is being done in dependency");
    }
}

@Configuration
@ComponentScan //@ComponentScan("com.in28minutes.learnspringframework.examples.a0")
public class PrePostAnnotationContextLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(
                PrePostAnnotationContextLauncherApplication.class
        )) {
            context.getBean(SomeClass.class);
        }
    }
}