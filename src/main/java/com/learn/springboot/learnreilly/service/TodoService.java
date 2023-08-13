package com.learn.springboot.learnreilly.service;
import java.util.ArrayList;
import java.util.List;
import com.learn.springboot.learnreilly.entity.TodoItem;
import org.springframework.stereotype.Service;

@Service 
public class TodoService {

    private static List<TodoItem> itemList = new ArrayList<TodoItem>();
    // apparently if you want to initialize a static var
    // you have to do it in a static block
    static {
        itemList.add(new TodoItem("Learn Spring Boot"));
        itemList.add(new TodoItem("Learn React"));
    }
    public List<TodoItem> getitemList() {
        return itemList;
    }
    public void addTodoItem(String todoItem) {
        itemList.add(new TodoItem(todoItem));
    }

    public TodoItem getTodoItemById(long id) {
        for (TodoItem todoItem : itemList) {
            if (todoItem.getId() == id) {
                return todoItem;
            }
        }
        return null;
    }
    public List<TodoItem> getTodoList() {
        System.out.println("\n\n\nit has accessed this path\n\n\n");
        return itemList;
    }
    
    public void saveTodoItem(TodoItem todoItem) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId() == todoItem.getId()) {
                itemList.set(i, todoItem);
                return;
            }
        }
        itemList.add(todoItem);
    }
    public boolean validateName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public void saveTodoItem(String name) {
        TodoItem todoItem = new TodoItem(name);
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId() == todoItem.getId()) {
                itemList.set(i, todoItem);
                return;
            }
        }
        itemList.add(todoItem);
    }
    
    
    
}
