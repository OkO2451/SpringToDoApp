package com.learn.springboot.learnreilly;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// this class is used to read the properties from application.properties
// and map them to the fields of this class
// so we can use them in the application

@ConfigurationProperties(prefix = "currency-service")
@Component // so spring can manage it
public class CurrencyServiceConfiguration {
    private String key,url,username;
    
    // getters
    public String getKey() {
        return key;
    }
    public String getUrl() {
        return url;
    }
    public String getUsername() {
        return username;
    }

    // setters
    public void setKey(String key) {
        this.key = key;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setUsername(String username) {
        this.username = username;
    }

}
