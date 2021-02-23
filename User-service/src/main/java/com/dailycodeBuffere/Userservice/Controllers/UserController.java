package com.dailycodeBuffere.Userservice.Controllers;

import com.dailycodeBuffere.Userservice.entities.User;

import com.dailycodeBuffere.Userservice.vo.Department;
import com.dailycodeBuffere.Userservice.vo.ResponseTemplateVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dailycodeBuffere.Userservice.services.UserService;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
private  static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        log.info("save user called and saved ;successfully " +user );

             return userService.saveUser(user);
    }

    @GetMapping("/start")
    public  String start(){
        return  "successfully called ";
    }
    @GetMapping("/start2")
    public  String start1(){
        return  "successfully called ";
    }



    public ResponseTemplateVO getData(){

    ResponseTemplateVO vo = new ResponseTemplateVO();

    vo.setUser(new User((long) 11.0,"name","address"));
    vo.setDepartment(new Department("departmentNamed" ,"departmentAddress","100"));

        return vo;

    }
}
