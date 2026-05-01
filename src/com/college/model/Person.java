package com.college.model;

public class Person {

		private String name;
		private int age;
		private int contactNumber;
		
		public Person(String name,int age,int contactNumber)
		{
			this.name = name;
			this.age = age;
			this.contactNumber = contactNumber;
		}
		
		//    ----    getters   ----
		
		public String getName()
		{
			return this.name;
		}
		public int getAge()
		{
			return this.age;
		}
		public int getContact()
		{
			return this.contactNumber;
		}
		
		//   -----    Setters   ---- 
		
		public void setName(String name)
		{
			this.name=name;
		}
		public void setAge(int age)
		{
			this.age = age;
		}
		public void setContact(int contact)
		{
			this.contactNumber = contact;
		}		
}





