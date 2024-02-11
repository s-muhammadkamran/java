package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class ToDoService {
    private final static List<Todo> todos = new ArrayList<Todo>();

    static {
        //todos = new List<Todo>();

        todos.add(new Todo(
           1, "in28minutes", "Learn AWS",
                LocalDate.now().plusYears(1), false
        ));

        todos.add(new Todo(
                2, "in28minutes", "Learn DevOps",
                LocalDate.now().plusYears(2), false
        ));

        todos.add(new Todo(
                3, "in28minutes", "Learn Full Stack Development",
                LocalDate.now().plusYears(3), false
        ));
    }

    public List<Todo> findByUserName(String userName) {
        return ToDoService.todos;
    }

    public void addTodo(String userName, String description, LocalDate targetDate, boolean isDone) {
        ToDoService.todos.add(new Todo(todos.size()+1, userName, description, targetDate, isDone));
    }
}