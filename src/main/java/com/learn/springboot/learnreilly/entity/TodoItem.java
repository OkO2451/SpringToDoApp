package com.learn.springboot.learnreilly.entity;

import lombok.Data;

@Data
public class TodoItem {
    private String name;
    private Boolean isCompleted;
    private long id;

    private User user;

    public TodoItem(String name) {
        this.name = name;
        this.isCompleted = false;
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
