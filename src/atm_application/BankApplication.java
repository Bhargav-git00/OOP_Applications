package atm_application;

public class BankApplication {
	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private double balance;
	
	// Parameterized constructor

	public BankApplication(String customerName,String customerAddress,long phoneNumber,double balance)
	{
		this.customerName = customerName;
		this.customerAddress=customerAddress;
		this.phoneNumber = phoneNumber;
		this.setBalance(balance);	
	}

	// getters and setters
	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	// methods
	
	public void withdraw(double amount)
	{
		balance-=amount;
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
	}
	 
	
}
