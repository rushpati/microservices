package com.example.pocmicroservices.controllers;

import com.example.pocmicroservices.dao.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
private UserDaoService userDaoService;

    @GetMapping(path = "/getAll")
    public List<User> finUser(){
     return userDaoService.findAll();
    }


    @GetMapping(path = "/name")
    public String testone(@PathVariable String name){
        return  "test" + name;
    }

}

