
public class BankDetails {
	
	String accountHolderName;
	String accountNumber;
	double balance;
	
	
	public BankDetails(){
		
		this.accountHolderName = "Unknown";
	this.accountNumber = "0000";
	this.balance = 00;
	}
	public BankDetails(String accountHolderName, String accountNumber, double balance){
	this.accountHolderName = accountHolderName;
	this.accountNumber = accountNumber;
	this.balance = balance;
	
	}
	
	public void deposit(double amount){
	
	 if(amount > 0){
		 this.balance += amount;
		 System.out.println("amount deposited"+amount);
	 } else {
		 System.out.println("Invalid Details");
	 }
	 
	}
	public void withdraw(double amount){
		if(amount > 0 && this.balance >= amount){
			this.balance -= amount;
			System.out.println("amount withdrawn"+amount);
		} else if (amount > 0){
		System.out.println("Insuficent Amount");

		} else {
				System.out.println("Invalid amount withdrawal");
		}
	
	}
	
	public void showAccountDetails() {
	 System.out.println("Bank Acount Name = "+accountHolderName);
  System.out.println("Bank Account Number = "+accountNumber);
   System.out.println("Balance = "+balance);
	}
	
	public static void main(String[] args){
		BankDetails bank;
	bank = new BankDetails();
	bank.showAccountDetails();
		
	BankDetails bank1;
	bank1 = new BankDetails();
	bank1.accountHolderName = "Prathamesh";
	bank1.accountNumber = "78425982";
	bank1.balance = 200;
	bank1.deposit(10);
	bank1.withdraw(20);
	bank1.showAccountDetails();
	
	}
}