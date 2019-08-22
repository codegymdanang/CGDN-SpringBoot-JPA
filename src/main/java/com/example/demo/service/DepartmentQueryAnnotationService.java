package com.example.demo.service;


import com.example.demo.entity.Department;
import com.example.demo.repositories.DepartmentAnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentQueryAnnotationService {

    @Autowired
    DepartmentAnnotationRepository departmentAnnotationRepository;

    public Department findByName(String name) {
        return departmentAnnotationRepository.findByName(name);
    }

}
