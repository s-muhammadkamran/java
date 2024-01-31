package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {}
record Address (String firstLine, String city) {}

record Citizen (Person p, Address s) {}

record Citizen1 (String name, int age, String firstLine, String city) {
    static Citizen c;

    public Citizen1(String name, int age, String firstLine, String city) {
        this.name = name;
        this.age = age;
        this.firstLine = firstLine;
        this.city = city;
        c = new Citizen(
                new Person(this.name, this.age),
                new Address(this.firstLine, this.city)
        );
    }
}

@Configuration
public class HelloWorldConfiguration {

    @Bean(name="GetMyName")
    public String name() {
        return "Kamran";
    }

    @Bean(name="MyAge")
    public int age() {
        return 15;
    }

    @Bean(name="MyPerson")
    public Person person() {
        return new Person("Kamran", 46);
    }

    @Bean(name="MyAddress")
    public Address address() {
        return new Address("King Fahd District", "Riyadh");
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age());
    }

    @Bean(name="MyCitizen")
    public Citizen citizen() {
        return new Citizen(
          new Person("Abdullah", 46), new Address("House Street", "Toronto")
        );
    }

    @Bean(name="MyCitizen1")
    public Citizen1 citizenWithParameters(String name, int age, String firstLine, String city) {
        return new Citizen1(name, age, firstLine, city);
    }
}