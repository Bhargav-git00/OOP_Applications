package Abstraction;

abstract class Payment{
	
	public abstract void processPayment();
	public abstract void validateTransaction();
	public void generateTransactionId()
	{
		System.out.println("Generated Transaction ID : 123456789");
	}
	
}

class CreditCardPayment extends Payment{
	
	private int cardNumber;
	private int expireDate;
	private int cvv;
	
	public CreditCardPayment(int cardNumber,int expireDate,int cvv) {
		this.cardNumber = cardNumber;
		this.expireDate = expireDate;
		this.cvv = cvv;
	}

	@Override
	public void processPayment() {
		System.out.println("Processing credit card Payment");	
	}

	@Override
	public void validateTransaction() {
		System.out.println("Validating Card number, expiry, cvv");
		
	}
}

class UPIPayment extends Payment{
	
	private String upiId;
	private int phoneNumber;
	
	public UPIPayment(String upiId,int phoneNumber) {
		this.upiId = upiId;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void processPayment() {
		System.out.println("Processing UPI Payment");		
	
	}

	@Override
	public void validateTransaction() {
		System.out.println("Validating UPI Id and Phone number");
		
	}	
}

class PayPalPayment extends Payment{
	
	private String email;
	private int authToken;
	
	public PayPalPayment(String email, int authToken) {
		this.email = email;
		this.authToken = authToken;
	}
	
	@Override
	public void processPayment() {
		System.out.println("Processing paypa; payment");		
	
	}

	@Override
	public void validateTransaction() {
		System.out.println("Validating email and Authentication");
		
	}	
}


public class PaymentProcessing {
	public static void main(String[] args) {
		
	Payment p;
	
	p = new CreditCardPayment(1223,3456,677);
	p.processPayment();
	p.validateTransaction();
	p.generateTransactionId();
	
	System.out.println();
	
	p = new UPIPayment("mail@gmail.com",1234);
	p.processPayment();
	p.validateTransaction();
	p.generateTransactionId();
	
	System.out.println();
	
	p = new PayPalPayment("bhargav@gmail.com",123);
	p.processPayment();
	p.validateTransaction();
	p.generateTransactionId();
}
}
