package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    private ToDoService todoSvc;
    @RequestMapping(value="list-todos")
    public String listAllTodos(ModelMap model) {
        model.put("todos", todoSvc.findByUserName(model.get("name").toString()));
        return "listTodos";
    }
}
