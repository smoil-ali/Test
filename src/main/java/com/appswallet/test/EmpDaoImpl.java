package com.appswallet.test;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.appswallet.test.Employee;


@Repository
public class EmpDaoImpl implements EmpDao {
	
	@Autowired
	JdbcTemplate tmp;

	@Override
	public int save(Employee employee) {
		

		 String sql = "INSERT into Employee (name) VALUES (?)";		    
		 return tmp.update(sql, new Object[] {employee.getName()});

	}

	@Override
	public int update(Employee employee,int id) {
		
		String query = "UPDATE Employee set name = ? WHERE id = ?";
		return tmp.update(query,new Object[] {employee.getName(),id});
	}

	@Override
	public int delete(int id) {
		String query = "DELETE FROM Employee WHERE id = ?";
		return tmp.update(query,id);
	}

	@Override
	public List<Employee> getAll() {
		String query = "SELECT * FROM Employee";
		return tmp.query(query,new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Employee getById(int id) {
		String query = "SELECT * FROM Employee WHERE id = ?";
		return tmp.queryForObject(query,new BeanPropertyRowMapper<Employee>(Employee.class), id);
	}
	
	

}
