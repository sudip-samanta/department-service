package com.fistic.department.service;

import com.fistic.department.entity.Department;

public interface DepartmentService {

    public Department saveDepartment(Department department );

    public Department findDepartmentById(Long departmentId);
}
