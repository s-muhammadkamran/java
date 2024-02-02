package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository jdbcRepo;

    @Autowired
    private CourseJpaRepository jpaRepo;

    @Autowired
    private CourseSpringDataJpaRepository dataJpaRepo;

    @Override
    public void run(String... args) throws Exception {
        jdbcRun();
        jpaRun();
        dataJpaRun();
    }

    private void jdbcRun() {
        jdbcRepo.insert(
                new Course(1,"Learn Java Now JDBC", "In28Minutes")
        );

        jdbcRepo.insert(
                new Course(2,"Learn Spring Now JDBC", "In28Minutes")
        );

        jdbcRepo.insert(
                new Course(3,"Learn DevOps Now JDBC", "In28Minutes")
        );

        jdbcRepo.insert(
                new Course(4,"Learn AWS Now JDBC", "In28Minutes")
        );

        /*var course = new Course();
        course.setId(1);
        repo.delete(course);*/

        jdbcRepo.deleteById(2);

        System.out.println(jdbcRepo.findById(1));
        System.out.println("Printing List of All records using JDBC");
        Arrays.stream(jdbcRepo.getAllCourses().toArray()).forEach(System.out::println);
    }

    private void jpaRun() {
        jpaRepo.insert(
                new Course(1,"Learn Java Now JPA", "In28Minutes")
        );

        jpaRepo.insert(
                new Course(2,"Learn Spring Now JPA", "In28Minutes")
        );

        jpaRepo.insert(
                new Course(3,"Learn DevOps Now JPA", "In28Minutes")
        );

        jpaRepo.insert(
                new Course(4,"Learn AWS Now JPA", "In28Minutes")
        );

        /*var course = new Course();
        course.setId(1);
        jpaRepo.delete(course);*/

        jpaRepo.deleteById(2);

        System.out.println(jpaRepo.findById(1));
        System.out.println("Printing List of All records using JPA");
        Arrays.stream(jpaRepo.getAllCourses().toArray()).forEach(System.out::println);
    }

    private void dataJpaRun() {
        dataJpaRepo.save(
                new Course(1,"Learn Java Now - Data JPA", "In28Minutes")
        );

        dataJpaRepo.save(
                new Course(2,"Learn Spring Now - Data JPA", "In28Minutes")
        );

        dataJpaRepo.save(
                new Course(3,"Learn DevOps Now - Data JPA", "In28Minutes")
        );

        dataJpaRepo.save(
                new Course(4,"Learn AWS Now - Data JPA", "In28Minutes")
        );

        /*var course = new Course();
        course.setId(1);
        jpaRepo.delete(course);*/

        dataJpaRepo.deleteById(2L);

        System.out.println(dataJpaRepo.findById(1L));
        System.out.println("Printing List of All records using JPA");
        Arrays.stream(dataJpaRepo.findAll().toArray()).forEach(System.out::println);

        System.out.println(dataJpaRepo.count());

        System.out.println(dataJpaRepo.findByName("Learn AWS Now - Data JPA"));
        System.out.println(dataJpaRepo.findByAuthor("In28Minutes"));
        System.out.println(dataJpaRepo.findByAuthor("In21Minutes"));
    }
}