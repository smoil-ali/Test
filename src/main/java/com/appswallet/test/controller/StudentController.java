package com.appswallet.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appswallet.test.dao.StudentDao;
import com.appswallet.test.model.Student;

@RestController
public class StudentController {
	
	
	@Autowired
	StudentDao dao;
	
	@GetMapping("/student")
	public List<Student> getAll(){
		return dao.getAll();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id) {
		return dao.getById(id);
	}
	
	@PostMapping("/student")
	public String save(@RequestBody Student e) {
		int result = dao.save(e);
		
		return result + " Row affected";
	}
	
	@PutMapping("/student/{id}")
	public String update(@RequestBody Student e,@PathVariable int id) {
		
		int result = dao.update(e, id);
		return result + " Row affected";
		
	}
	
	@DeleteMapping("/student/{id}")
	public String delete(@PathVariable int id) {
		int result = dao.delete(id);
		return result + " Row affected";
	}

}
