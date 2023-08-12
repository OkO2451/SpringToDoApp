package com.learn.springboot.learnreilly.service;
import java.util.ArrayList;
import java.util.List;
import com.learn.springboot.learnreilly.entity.TodoItem;



public class TodoService {

    private static List<TodoItem> todoItems = new ArrayList<TodoItem>();
    // apparently if you want to initialize a static var
    // you have to do it in a static block
    static {
        todoItems.add(new TodoItem("Learn Spring Boot"));
        todoItems.add(new TodoItem("Learn React"));
    }
    public List<TodoItem> getTodoItems() {
        return todoItems;
    }
    
    
}
