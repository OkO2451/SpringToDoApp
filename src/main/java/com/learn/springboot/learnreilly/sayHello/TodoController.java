package com.learn.springboot.learnreilly.sayHello;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.learn.springboot.learnreilly.service.TodoService;

import com.learn.springboot.learnreilly.entity.TodoItem;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/view-todo-lists")
    public String viewTodoList(ModelMap model) {
        List<TodoItem> todoItems = todoService.getTodoList();
        model.addAttribute("todoItems", todoItems);
        return "view-todo-lists";
    }

    @GetMapping("/todo")
    public String todo(ModelMap model) {
        List<TodoItem> todoItems = todoService.getTodoList();
        model.addAttribute("todoItems", todoItems);
        return "todo";
    }

    @GetMapping("/create-todo-list")
    public String createTodoList(@RequestParam("name") String name, ModelMap model) {
        List<TodoItem> todoItems = todoService.getTodoList();
        todoItems.add(new TodoItem(name));
        model.addAttribute("todoItems", todoItems);
        model.addAttribute("message", "Todo list created successfully!");
        return "/todo-lists";
    }

    @PostMapping("/toggle-todo-item")
    public String toggleTodoItem(@RequestParam("id") Long id) {
        TodoItem todoItem = todoService.getTodoItemById(id);
        todoItem.setIsCompleted(!todoItem.getIsCompleted());
        todoService.saveTodoItem(todoItem);
        return "redirect:/view-todo-lists";
    }

    @PostMapping("/add-todo-item")
    public String addTodoItem(@RequestParam("name") String name) {
        if(!todoService.validateName(name)) {
            return "redirect:/view-todo-lists";
        }
        todoService.saveTodoItem(name);
        return "redirect:/view-todo-lists";
    }

}
