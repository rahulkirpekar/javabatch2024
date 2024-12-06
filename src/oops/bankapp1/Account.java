package oops.bankapp1;

public class Account 
{
	String accountHolder;
	double balance;
	
	public Account(String accountHolder, double balance) 
	{
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	// deposite money
	public void deposite(double amount) 
	{
		if (amount > 0) 
		{
			balance = balance + amount;
			System.out.println(amount+" deposited succeessfully.");
		} else 
		{
			System.out.println("Invalid amount");
		}
	}
	public void withdraw(double amount) 
	{
		if((amount > 0) && (amount <= balance)) 
		{
			balance = balance - amount;
			System.out.println(amount + " withdrawn successfully.");
		}else 
		{
			System.out.println("Invalid or Insufficient balance");
		}
	}
	public double getBalance() 
	{
		return this.balance;
	}
	public void displayInfo() 
	{
		System.out.print(accountHolder+" " + balance);
	}
}
