package com.learn.springboot.learnreilly.entity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class defaultControler {
    

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    
}
