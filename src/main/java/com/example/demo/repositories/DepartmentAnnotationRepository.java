package com.example.demo.repositories;

import com.example.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentAnnotationRepository extends JpaRepository<Department,Integer> {

    @Query("select department from Department department where department.name = ?1")
    Department findByName(String departmentName);

    @Query("select department from Department department where department.name like %?1")
    List<Department> findByFirstnameEndsWith(String departmentName);

    @Query(value = "select department from Department department where department.name = ?1", nativeQuery = true)
    Department findByName2(String departmentName);
}
