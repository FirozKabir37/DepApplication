package com.example.DepApplication.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DepApplication.Entity.Departments;
import com.example.DepApplication.Service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/")
	public String index() {
		return "Hello World";
		//return "index";
	}
	
	
 	@PostMapping("/departments")
	public Departments saveDepartments(@RequestBody Departments departments) {
		
		return departmentService.saveDepartmets(departments);
	}
    @GetMapping("/departmentList")
	public List<Departments> fetchDepartmentList(){
		
		return departmentService.fetchDepartmentList();
	}
    
    @GetMapping("/departments/{id}")
    public Departments findDepartmentById(@PathVariable("id") Long id) {
    	return departmentService.findDepartmentById(id);
    } 
}
