package com.learn.springboot.learnreilly.sayHello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoListController {

    @RequestMapping("/create-todo-list")
    public String createTodoList() {
        return "create-todo-list";
    }

    @PostMapping("/save-todo-list")
    public String saveTodoList(@RequestParam String name,
            @RequestParam String description) {

        // TODO: Save the todo list to the database

        return "redirect:/todo-lists";
    }

    @RequestMapping("/todo-lists")
    public String todoLists() {
        return "todo-lists";
    }
}
