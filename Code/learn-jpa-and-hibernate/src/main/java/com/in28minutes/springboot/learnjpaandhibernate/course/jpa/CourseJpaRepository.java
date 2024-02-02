package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public List<Course> getAllCourses() {
        var query = entityManager.createNamedQuery("getAllCourses", Course.class);
        return query.getResultList();
    }

    public void deleteById(long id) {
        var c = entityManager.find(Course.class, id);
        var no = 0;
        if (c != null) {
           entityManager.remove(c);
        }
    }
}
