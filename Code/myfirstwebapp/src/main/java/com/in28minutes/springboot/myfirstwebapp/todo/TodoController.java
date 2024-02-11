package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    private ToDoService todoSvc;
    @RequestMapping(value="list-todos")
    public String listAllTodos(ModelMap model) {
        model.put("todos", todoSvc.findByUserName("Kamran"));
        return "listTodos";
    }

    @RequestMapping(value="add-todo", method=RequestMethod.GET)
    public String showNewTodoPage(ModelMap model) {
        var name = (String)model.get("name");
        var todo = new Todo(0, name, "", LocalDate.now().plusYears(1), false);
        model.put("todo", todo);
        return "todo";
    }

    @RequestMapping(value="add-todo", method=RequestMethod.POST)
    public String saveNewTodo(ModelMap model, Todo todo) {
        var name = (String)model.get("name");
        todoSvc.addTodo(name, todo.getDescription(), LocalDate.now().plusYears(1), false);
        return "redirect:list-todos";
    }
}