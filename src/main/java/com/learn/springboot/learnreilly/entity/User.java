package com.learn.springboot.learnreilly.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<TodoItem> todoItems = new ArrayList<TodoItem>();

    // constructors, getters, and setters
}