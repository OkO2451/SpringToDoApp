package com.learn.springboot.learnreilly.sayHello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.learn.springboot.learnreilly.service.AuthService;

@Controller
public class LoginController {

    @Autowired
    private AuthService authService;

    // this is the login page
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {

        return "login";
    }

    // this is the login page if s
    @RequestMapping("/login-success")
    public ModelAndView loginSuccess(@RequestParam String name,
            @RequestParam String password, ModelMap model) {

        if (authService.authenticate(name, password)) {
            ModelAndView mav = new ModelAndView("login-success");
            mav.addObject("name", name);
            mav.addObject("password", password);
            return mav;
        } else {
            model.put("message", "Login Failed!");
            return new ModelAndView("login");
        }

    }

}