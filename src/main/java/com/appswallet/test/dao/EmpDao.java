package com.appswallet.test.dao;

import java.util.List;

import com.appswallet.test.model.Employee;



public interface EmpDao {

	int save(Employee employee);
	int update(Employee employee,int id);
	int delete(int id);
	List<Employee> getAll();
	Employee getById(int id);
	
}
