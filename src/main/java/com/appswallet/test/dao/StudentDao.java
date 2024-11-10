package com.appswallet.test.dao;

import java.util.List;

import com.appswallet.test.model.Student;

public interface StudentDao {

	
	int save(Student s);
	int update(Student s,int id);
	int delete(int id);
	List<Student> getAll();
	Student getById(int id);
	
}
