package com.example.DepApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DepApplication.Entity.Departments;
import com.example.DepApplication.Repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Departments saveDepartmets(Departments departments) {
		
	return 	departmentRepository.save(departments);
	}
	
	public List<Departments> fetchDepartmentList(){
		return departmentRepository.findAll();
	}
    
	public Departments findDepartmentById(Long id) {
		
		return departmentRepository.findById(id).get();
	}
}
