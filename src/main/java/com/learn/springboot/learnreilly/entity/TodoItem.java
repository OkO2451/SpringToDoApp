package com.learn.springboot.learnreilly.entity;

import lombok.Data;

@Data 
public class TodoItem {
    private String name;
    private Boolean isCompleted;
    private long id;
    private long todoListId;


}
