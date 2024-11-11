package com.appswallet.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.appswallet.test.model.Student;


@Repository
public class StudentDaoImpl implements StudentDao   {
	
	@Autowired
	JdbcTemplate tmp;

	@Override
	public int save(Student s) {
		
		 String sql = "INSERT into Student (id,name,number,course,fee,feeTaken,feeComplete,free,date) VALUES (?,?,?,?,?,?,?,?)";		    
		 return tmp.update(
				 sql, 
				 new Object[] {s.getName(),s.getNumber(),s.getCourse(),s.getFee(),
						 s.getFeeTaken(),s.isFeeComplete(),s.isFree(),s.getDate()}
				 );
	}

	@Override
	public int update(Student s, int id) {
		String query = "UPDATE Student set name = ?,number = ?,course = ?,fee = ?,feeTaken = ?,feeComplete = ?, free = ?,date = ? WHERE id = ?";
		return tmp.update(query,
				 new Object[] {s.getName(),s.getNumber(),s.getCourse(),s.getFee(),
						 s.getFeeTaken(),s.isFeeComplete(),s.isFree(),s.getDate(),id}
		);
	}

	@Override
	public int delete(int id) {
		String query = "DELETE FROM Student WHERE id = ?";
		return tmp.update(query,id);
	}

	@Override
	public List<Student> getAll() {
		String query = "SELECT * FROM Student";
		return tmp.query(query,new BeanPropertyRowMapper<Student>(Student.class));
	}

	@Override
	public Student getById(int id) {
		String query = "SELECT * FROM Student WHERE id = ?";
		return tmp.queryForObject(query,new BeanPropertyRowMapper<Student>(Student.class), id);
	}
	

}
