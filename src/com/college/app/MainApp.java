package com.college.app;

import java.util.*;

import com.college.model.*;
import com.college.service.*;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name        : ");
		String name = sc.nextLine();
		System.out.print("Enter Age         : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Contact     : ");
		int contact = sc.nextInt();
		System.out.print("Enter Id          : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Department  : ");
		String dept = sc.nextLine();
		System.out.print("Enter CourseName  : ");
		String course = sc.nextLine();
		System.out.print("Enter CourseCode  : ");
		String courseCode = sc.nextLine();
		System.out.print("Enter CourseTitle : ");
		String courseTitle = sc.nextLine();
		System.out.print("Enter CourseFee   : ");
		double fee = sc.nextDouble();
		
		
		Course courseobj = new Course(name,age,contact,id,dept,course,courseCode,courseTitle,fee);
		
		StudentService serviceobj = new StudentService();
		
		courseobj.studentDetails();
		
		serviceobj.calculateDiscountedFee(courseobj.getCourseFee(), courseobj.getDept());
		
		
	}

}
