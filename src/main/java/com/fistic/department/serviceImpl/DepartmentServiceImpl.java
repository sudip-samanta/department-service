package com.fistic.department.serviceImpl;

import com.fistic.department.entity.Department;
import com.fistic.department.repository.DepartmentRepository;
import com.fistic.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department ) {
        log.info("Inside saveDepartment method of DepartmentService.");
        return departmentRepository.save( department );
    }

    @Override
    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentService.");
        Optional<Department> optional = departmentRepository.findById(departmentId);
        return optional.get();
    }

}
