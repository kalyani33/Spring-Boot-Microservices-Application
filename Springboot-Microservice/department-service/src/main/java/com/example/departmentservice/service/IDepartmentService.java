package com.example.departmentservice.service;

import com.example.departmentservice.dto.DepartmentDto;

public interface IDepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByDepartmentCode(String departmentCode);
}
