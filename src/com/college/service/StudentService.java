package com.college.service;

public class StudentService {
	
	double discount;
	public void calculateDiscountedFee(double fee,String department)
	{
		if(department.equals("it"))
		{
			discount = 0.1*fee;	
			System.out.println("Discount Applied : "+discount);
			System.out.println("Final Fee : "+(fee+discount));
	
		}
		else {
			System.out.println("No Discount");
		}
	}
	
}
