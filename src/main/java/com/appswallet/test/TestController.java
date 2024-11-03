package com.appswallet.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.appswallet.test.EmpDao;
import com.appswallet.test.Employee;


@RestController
public class TestController {

	
	@Autowired
	private EmpDao dao;
	
	@GetMapping("/employee")
	public List<Employee> getAll(){
		return dao.getAll();
	}
}
