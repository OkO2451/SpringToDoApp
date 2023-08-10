package com.learn.springboot.learnreilly.entity;

import java.util.HashMap;

import lombok.Data;

@Data
public class TodoList {
    private String name;
    private String description;
    private long id;
    private long userId;
    private HashMap<Long, TodoItem> todoItems;
    
    
    
}
