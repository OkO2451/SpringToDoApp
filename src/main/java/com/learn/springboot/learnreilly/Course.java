package com.learn.springboot.learnreilly;

public class Course {
    private String id;
    private String name;
    private String auth;

    public Course(String id, String name, String auth) {
        this.id = id;
        this.name = name;
        this.auth = auth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", auth=" + auth + "}";
    }
    
}
