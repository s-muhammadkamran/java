package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String userName;
    private String description;
    private LocalDate target;
    private boolean isDone;

    public Todo(int id, String userName, String description, LocalDate target, boolean isDone) {
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.target = target;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTarget() {
        return target;
    }

    public void setTarget(LocalDate target) {
        this.target = target;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", target=" + target +
                ", isDone=" + isDone +
                '}';
    }
}
