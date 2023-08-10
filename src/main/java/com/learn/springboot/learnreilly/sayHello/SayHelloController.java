package com.learn.springboot.learnreilly.sayHello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller // it tells spring that this is a bean
public class SayHelloController {

    @RequestMapping("/say-hello")
    @ResponseBody // it tells spring that the return value of this method is the response
    public String sayHello() {
        return "Hello";
    }

    @RequestMapping("/html")
    @ResponseBody // it tells spring that the return value of this method is the response
    public String sayHelloHtml() {
        return "<h1>Hello</h1>";
    }

    @RequestMapping("jsp")
    public String sayHelloJsp() {
        return "hello" ;
    }
    // adding a file in git named ok.txt and then adding it to the staging area
    // then commiting it and then pushing it to the remote repository
    // commands : git add ok.txt
    // git commit -m "adding ok.txt"

    // making the jsp folder
    // src\main\resources\META-INF\resources\WEB-INF\jsp
}
