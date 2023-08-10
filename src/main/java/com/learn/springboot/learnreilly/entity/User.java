package com.learn.springboot.learnreilly.entity;

import lombok.Data;

@Data
public class User {
    private String name;
    private String password;
    private long id;
    private String email;

}
