package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;
import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private final static String INSERT_QUERY =
            """
               INSERT INTO COURSE (id, name, author)
               VALUES (?,?,?);
            """;
    private final static String DELETE_QUERY =
            """
               DELETE FROM COURSE WHERE ID = ?;
            """;

    private final static String SELECT_QUERY =
            """
               SELECT * FROM COURSE WHERE ID = ?;
            """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY,
                course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(Course course) {
        springJdbcTemplate.update(DELETE_QUERY, course.getId());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class), id);
    }

    public List<Course> getAllCourses() {
        String sql = "SELECT * FROM COURSE";
        return springJdbcTemplate.query(
                sql, new BeanPropertyRowMapper<>(Course.class)
        );
    }
}