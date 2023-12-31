package com.example.employeeservice.service;

import com.example.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "DEPARTMENT-SERVICE")
public interface APIFeignClinet {

    @GetMapping("api/departments/{department-code}")
    DepartmentDto getDepartmentByDepartmentCode(@PathVariable("department-code") String departmentCode);
}
