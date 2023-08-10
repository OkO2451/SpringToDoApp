package com.learn.springboot.learnreilly;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CurrencyConfigController {
    
    @Autowired // so spring can manage it and inject it, it was created as @Component
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-config") 
    public CurrencyServiceConfiguration retriveSHit(){
        return configuration;
    } 

}
