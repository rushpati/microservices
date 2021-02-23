package com.dailycodeBuffere.Department.controllers;

import com.dailycodeBuffere.Department.entities.Department;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import com.dailycodeBuffere.Department.services.DepartmentService;


@RestController
public class DepartmentController {

    Logger log = LoggerFactory.getLogger(DepartmentController.class);


    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
       System.out.println("Here will be Department Data " + department.toString());

    log.info("Inside Department Controller");
    log.debug("debug log from Department Controller---------");

        return  departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
    log.info("Hello Department id method");
        return departmentService.findDepartmentById(departmentId);
    }

    @GetMapping("/harsh")
    public void test(){
        log.info("tet get called by controller ");
    }
}
