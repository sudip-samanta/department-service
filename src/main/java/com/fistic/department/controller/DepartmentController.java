package com.fistic.department.controller;

import com.fistic.department.entity.Department;
import com.fistic.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController.");
        return  departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepatmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside findDepatmentById method of DepartmentController.");
        return departmentService.findDepartmentById(departmentId);
    }


}
