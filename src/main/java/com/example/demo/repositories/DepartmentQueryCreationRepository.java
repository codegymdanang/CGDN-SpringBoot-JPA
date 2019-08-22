package com.example.demo.repositories;

import com.example.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DepartmentQueryCreationRepository extends JpaRepository<Department,Integer> {

    List<Department> findByName (String name);
    List<Department> findByNameLike (String name);
    List<Department> findByNameContaining (String name);
    List<Department> findByNameStartingWith(String name);
    List<Department> findByNameEndingWith(String name);
    List<Department> findByNameIgnoreCase(String name);


    /* List<Department> findByNameAndLocal(String name,String local);
    List<Department> findByNameOrLocal(String name,String local);
    List<Department> findByNameNot(String name);
    List<Department> findByDateAfter(Date date);
    List<Department> findByDateBefore (Date date);
    List<Department> findByDateBetween(Date from,Date to); */



}
