package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentQueryCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CreationQueryController {


    @Autowired
    DepartmentQueryCreationService departmentQueryCreationService;

    @GetMapping("/creationFindbyDepartmentName/{name}")
    public ModelAndView findbyDepartment(@PathVariable("name") String name) {
        ModelAndView modelAndView = new ModelAndView("creation");
        List<Department> departments = departmentQueryCreationService.findByDepartment(name);
        modelAndView.addObject("departments",departments);
        return modelAndView;

    }
}
