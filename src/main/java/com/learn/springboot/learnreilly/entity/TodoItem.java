package com.learn.springboot.learnreilly.entity;

import lombok.Data;
import java.util.Date;

@Data
public class TodoItem {
    private String name;
    private Boolean isCompleted;
    private long id;
    private Date dueDate;
    private User user;

    public TodoItem(String name) {
        this.name = name;
        this.isCompleted = false;
        this.dueDate = new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000);
        this.id = generateTodoItemId();
    }

    public long generateTodoItemId() {
        // random number between 1 and 1000
        return (long) (Math.random() * 1000 + 1);
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public void markAsUncompleted() {
        this.isCompleted = false;
    }

}
