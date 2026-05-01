package department_management;

import java.util.*;

public class DepartmentStaff extends HotelStaff{

	private String departmentName;
	private String departmentLevel;
	
	public DepartmentStaff(String staffName,int staffId,String baseShift,String departmentName,String departmentLevel)
	{
		super(staffName,staffId,baseShift);
		this.departmentName = departmentName;
		this.departmentLevel = departmentLevel;
		System.out.println("STAFF PROFILE HAS BEEN CREATED !");
	}
	
	//  --- getters  -- 
	
	public String getdeptName()
	{
		return this.departmentName;
	}
	public String getdeptLevel()
	{
		return this.departmentLevel;
	}
	
	//  --  setters  --- 
	
	public void setdeptName(String deptName)
	{
		this.departmentName = deptName;
	}
	public void setdeptLevel(String deptLevel)
	{
		this.departmentLevel = deptLevel;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Staff Name  : ");
		String name = sc.nextLine();
		System.out.print("Enter Staff Id    : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Base Shift  : ");
		String shift = sc.nextLine();
		System.out.print("Enter dept Name   : ");
		String deptName = sc.nextLine();
		System.out.print("Enter dept Level  : ");
		String deptLevel = sc.nextLine();
		
		DepartmentStaff dept = new DepartmentStaff(name,id,shift,deptName,deptLevel);
		boolean flag = true;
		while(flag)
		{
			System.out.println();
			System.out.println("1.Update Responsibility Level");
			System.out.println("2.Update Department Name");
			System.out.println("3.View Staff Profile Details");
			System.out.println("4.Exit the program");
			System.out.println();
			System.out.print("Choose Option From Above : ");
			int opt = sc.nextInt();
			sc.nextLine();
			switch(opt)
			{
				case 1:{
					System.out.print("Enter Updated value :");
					dept.setdeptLevel(sc.nextLine());
					System.out.println("Value updated");
					break;
				}
				case 2:{
					System.out.print("Enter Updated Value :");
					dept.setdeptName(sc.nextLine());
					System.out.println("Value updated");
					break;
				}
				case 3:{
					System.out.println(" ---    STAFF DETAILS    --- ");
					System.out.println();
					System.out.println("Name   : "+dept.getName());
					System.out.println("Id     : "+dept.getId());
					System.out.println("Dept Name : "+dept.getdeptName());
					System.out.println("Resp level : "+dept.getdeptLevel());
					break;
				}
				case 4 :{
					System.out.println("Exit..");
					flag = false;
					break;
				}
				default:{
					System.out.println(" Enter Above Options Only... ");
					break;
				}
			}
		}
		
	}
}