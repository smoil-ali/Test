package com.appswallet.test;

import java.util.List;
import com.appswallet.test.Employee;



public interface EmpDao {

	int save(Employee employee);
	int update(Employee employee);
	int delete(int id);
	List<Employee> getAll();
	Employee getById(int id);
	
}
