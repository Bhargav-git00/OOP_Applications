package Abstraction;

abstract class Vechile{
	
	public String name;
	
	
	public Vechile(String name)
	{
		this.name = name;	
	}
	
	public abstract void startEngine();
	public void fuelType() {
		
		System.out.println("Vechile uses fule as diesel or petrol or electric power");
		System.out.println(name);
	}
	
}

class Car extends Vechile{
	
	public Car(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void startEngine()
	{
		System.out.println("car starts with key ignition");
	}
	
}

class Bike extends Vechile{
	
	public Bike(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void startEngine()
	{
		System.out.println("Bike starts with Kick-start or self-start mechanism");
	}
}

class Truck extends Vechile {
	
	public Truck(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void startEngine()
	{
		System.out.println("Truck starts with heavy-load engine");
	}
	
}



public class VechileManagement {
	public static void main(String[] args) {
		

	Vechile v1 = new Car("Bhargav");
	v1.startEngine();
	v1.fuelType();
	
	Vechile v2 = new Bike("Bhargav");
	v2.startEngine();
	v2.fuelType();
	
	Vechile v3 = new Bike("Bhargav");
	v3.startEngine();
	v3.fuelType();
	

	
}
}