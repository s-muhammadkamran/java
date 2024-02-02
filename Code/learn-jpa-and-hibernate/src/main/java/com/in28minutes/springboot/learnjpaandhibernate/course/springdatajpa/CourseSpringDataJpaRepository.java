package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    //Follow the naming convention of your method to use findByColumnName in DB
    //This way Spring Data JPA will implement it automatically and return
    public List<Course> findByAuthor(String author);
    public List<Course> findByName(String name);
}
