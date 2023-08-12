package com.learn.springboot.learnreilly.sayHello;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.learn.springboot.learnreilly.service.TodoService;
import com.learn.springboot.learnreilly.entity.TodoItem;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/todo")
    public String todo(ModelMap model) {
        List<TodoItem> todoItems = todoService.getTodoItems();
        model.addAttribute("todoItems", todoItems);
        return "todo";
    }
}
