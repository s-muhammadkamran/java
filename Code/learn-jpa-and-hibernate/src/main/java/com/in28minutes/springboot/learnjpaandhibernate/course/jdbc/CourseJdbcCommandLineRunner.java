package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repo;
    @Override
    public void run(String... args) throws Exception {
        repo.insert(
                new Course(1,"Learn Java Now", "In28Minutes")
        );

        repo.insert(
                new Course(2,"Learn Spring Now", "In28Minutes")
        );

        repo.insert(
                new Course(3,"Learn DevOps Now", "In28Minutes")
        );

        repo.insert(
                new Course(4,"Learn AWS Now", "In28Minutes")
        );

        /*var course = new Course();
        course.setId(1);
        repo.delete(course);*/

        repo.deleteById(2);

        System.out.println(repo.findById(1));
        System.out.println(repo.findById(3));
        System.out.println(repo.findById(4));
    }
}
