package com.appswallet.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class EmpDaoImpl implements EmpDao {
	
	@Autowired
	JdbcTemplate tmp;

	@Override
	public int save(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return tmp.query("select * from Employee",new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
