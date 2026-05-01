package com.college.model;

public class Course extends Student{
	
	private String coursecode;
	private String courseTitle;
	private double courseFee;
	
	public Course(String name,int age,int contactNumber,int studentId,String department,String courseName,String courseCode,String courseTitle,double courseFee)
	{
		super(name,age,contactNumber,studentId,department,courseName);
		this.coursecode = courseCode;
		this.courseTitle = courseTitle;
		this.courseFee = courseFee;
	}
	
	//   ----   getters   ----  
	
	public String getCoursecode() {
		return coursecode;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public double getCourseFee() {
		return courseFee;
	}
	
	//  ----  setters  ---- 
	
	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
}