package com.learn.springboot.learnreilly.sayHello;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.learn.springboot.learnreilly.service.TodoService;

import ch.qos.logback.core.model.Model;

import com.learn.springboot.learnreilly.entity.TodoItem;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
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

    


}
