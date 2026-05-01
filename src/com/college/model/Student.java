package com.college.model;

import com.college.model.*;

public class Student extends Person{
	
	private int studentId;
	private String department;
	private String courseName;
	
	public Student(String name,int age,int contactNumber,int studentId,String department,String courseName)
	{
		super(name,age,contactNumber);
		this.studentId = studentId;
		this.department = department;
		this.courseName = courseName;
	}
	
	//   ---  getters  ----
	
	public int getId()
	{
		return this.studentId;
	}
	public String getDept()
	{
		return this.department;
	}
	public String getCourse()
	{
		return this.courseName;
	}
	
	//  ----  setters   ----
	
	public void setId(int id)
	{
		this.studentId = id;
	}
	public void setDept(String department)
	{
		this.department = department;
	}
	public void setCourse(String course)
	{
		this.courseName = course;
	}
	
	public void studentDetails()
	{
		System.out.println(" -----    Student Details    -----");
		System.out.println("Name        : "+this.getName());
		System.out.println("Age         : "+this.getAge());
		System.out.println("Contact     : "+this.getContact());
		System.out.println("Student Id  : "+this.getId());
		System.out.println("Department  : "+this.getDept());
		System.out.println("Course      : "+this.getCourse());
	}
	
}
