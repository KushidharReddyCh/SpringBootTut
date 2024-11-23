package com.kushidhar.Sprintboot.tutorial.service;

import com.kushidhar.Sprintboot.tutorial.entity.Department;
import com.kushidhar.Sprintboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;
public interface DepartmentService {

    public Department saveDepartment(Department department);
    public List<Department>  fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);

}
