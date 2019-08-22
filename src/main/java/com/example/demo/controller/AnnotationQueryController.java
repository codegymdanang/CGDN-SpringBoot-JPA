package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentQueryAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnnotationQueryController {

    @Autowired
    DepartmentQueryAnnotationService departmentQueryAnnotationService;

    @GetMapping("/annotationFindbyDepartmentName/{name}")
    public ModelAndView annotationQuery(@PathVariable("name") String name) {
        ModelAndView modelAndView = new ModelAndView("annotation");
        Department department = departmentQueryAnnotationService.findByName(name);
        modelAndView.addObject("department",department);
        return modelAndView;
    }

}
