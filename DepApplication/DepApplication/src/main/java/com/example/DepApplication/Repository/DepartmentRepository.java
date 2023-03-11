package com.example.DepApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DepApplication.Entity.Departments;

@Repository
public interface DepartmentRepository extends JpaRepository<Departments,Long>{

}
