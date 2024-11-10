package com.appswallet.test.model;

public class Student {

	int id;
	String name;
	String number;
	String course;
	String fee;
	String feeTaken;
	boolean feeComplete;
	boolean free;
	String date;
	
	public Student() {
		
	}
	

	

	public Student(int id, String name, String number, String course, String fee, String feeTaken, boolean feeComplete,
			boolean free, String date) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.course = course;
		this.fee = fee;
		this.feeTaken = feeTaken;
		this.feeComplete = feeComplete;
		this.free = free;
		this.date = date;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getFeeTaken() {
		return feeTaken;
	}

	public void setFeeTaken(String feeTaken) {
		this.feeTaken = feeTaken;
	}

	public boolean isFeeComplete() {
		return feeComplete;
	}

	public void setFeeComplete(boolean feeComplete) {
		this.feeComplete = feeComplete;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}
	
	
	
	
	
}
