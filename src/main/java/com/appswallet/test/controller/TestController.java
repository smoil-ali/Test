package com.appswallet.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appswallet.test.dao.EmpDao;
import com.appswallet.test.model.Employee;


@RestController
public class TestController {

	
	@Autowired
	private EmpDao dao;
	
	@GetMapping("/employee")
	public List<Employee> getAll(){
		return dao.getAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return dao.getById(id);
	}
	
	@PostMapping("/employee")
	public String save(@RequestBody Employee e) {
		int result = dao.save(e);
		
		return result + " Row affected";
	}
	
	@PutMapping("/employee/{id}")
	public String update(@RequestBody Employee e,@PathVariable int id) {
		
		int result = dao.update(e, id);
		return result + " Row affected";
		
	}
	
	@DeleteMapping("/employee/{id}")
	public String delete(@PathVariable int id) {
		int result = dao.delete(id);
		return result + " Row affected";
	}
	

}
