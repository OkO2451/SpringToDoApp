package com.learn.springboot.learnreilly.sayHello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register() {
        return "register";
    }
    @RequestMapping(value = "/register-success",method = RequestMethod.GET)
    public String registerUser(@RequestParam String username,
        @RequestParam String password, @RequestParam String confirmPassword) {

    // TODO: Validate the username and password
    // TODO: Save the user to the database

    return "redirect:/login";
}
}
