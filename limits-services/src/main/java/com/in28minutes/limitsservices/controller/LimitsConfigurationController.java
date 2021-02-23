package com.in28minutes.limitsservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private  LimitsConfiguration configuration;

    @GetMapping(path = "/limits")
    public LimitsConfiguration configuration(){
    System.out.println("hello limits");
    //return new LimitsConfiguration(10,20);


        return  new LimitsConfiguration( configuration.getMax(),configuration().getMin());

    }

}
