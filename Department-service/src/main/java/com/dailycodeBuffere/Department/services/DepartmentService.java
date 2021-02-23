package com.dailycodeBuffere.Department.services;

import com.dailycodeBuffere.Department.entities.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dailycodeBuffere.Department.repositories.DepartmentRepo;

import java.util.logging.Logger;

@Service
@Slf4j
public class DepartmentService {
 Logger logger = Logger.getLogger(DepartmentService.class.getName());
    @Autowired
    private DepartmentRepo departmentRepo;

    public Department saveDepartment(Department department) {

        return departmentRepo.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return  departmentRepo.findByDepartmentId(departmentId);
    }
}
