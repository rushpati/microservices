package com.example.pocmicroservices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello-world ";
    }

    @GetMapping(path = "/hello-world-bean/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean("hello-world-+ "+ name);
    }
    @GetMapping(path = "/hello-world/{name}")
    public String helloWorldBeanpath(@PathVariable String name){
        return name;
    }
}
