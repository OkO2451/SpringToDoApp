package com.learn.springboot.learnreilly.entity;

public class User {
    private String name;
    private String password;
    private long id;
    private String email;

    // getters and setters
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public long getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password= password;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    

}
