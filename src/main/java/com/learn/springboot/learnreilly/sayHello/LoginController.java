package com.learn.springboot.learnreilly.sayHello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam(required = false) String name,
            @RequestParam(required = false) String password) {

        System.out.println("\n\n\nname: " + name+"\n\n\n");
        System.out.println("\n\n\npassword: " + password+"\n\n\n");
        return "login";
    }

}
