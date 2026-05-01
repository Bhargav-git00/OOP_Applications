package department_management;

import java.util.*;

public class HotelStaff {
	
	private String staffName;
	private int staffId;
	private String baseShift;
	
	public HotelStaff(String staffName,int staffId,String baseShift)
	{
		this.staffName = staffName;
		this.staffId = staffId;
		this.baseShift = baseShift;
	}
	
	// -- getters  ---   
	
	public String getName()
	{
		return this.staffName;
	}
	public int getId()
	{
		return this.staffId;
	}
	public String getShift()
	{
		return this.baseShift;
	}
	
	//  --   Setters  ----
	
	public void setName(String name)
	{
		this.staffName = name;
	}
	public void setId(int id)
	{
		this.staffId = id;
	}
	public void setShift(String shift)
	{
		this.baseShift = shift;
	}
	
}	

