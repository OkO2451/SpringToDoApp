package com.learn.springboot.learnreilly.sayHello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    // this is the login page
    @RequestMapping("/login")
    public String login(@RequestParam(required = false) String name,
            @RequestParam(required = false) String password,
            ModelMap model) {

        return "login";
    }
    // this is the login page if s
    @RequestMapping("/login-success")
    public ModelAndView loginSuccess(@RequestParam String name,
            @RequestParam String password) {

        ModelAndView mav = new ModelAndView("login-success");
        mav.addObject("name", name);
        mav.addObject("password", password);
        return mav;
    }

}
