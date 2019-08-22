package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repositories.DepartmentQueryCreationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentQueryCreationService {

    @Autowired
    DepartmentQueryCreationRepository departmentQueryCreationRepository;

    public List<Department> findByDepartment(String name) {
        return departmentQueryCreationRepository.findByName(name);
    }
}
