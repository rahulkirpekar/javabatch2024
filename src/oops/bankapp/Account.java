package oops.bankapp;

public class Account 
{
	 String accountNumber;
	 String ownerName;
	 double balance;
	public Account(String accountNumber, String ownerName, double balance) 
	{
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	// Deposite Money
	public void depositAmount(double amount) 
	{
		balance = balance + amount;
		System.out.println("Deposited Amount : " + amount);
		System.out.println("Your Updated Main Balance  : " + balance);
	}
	// Withdraw Money
	public void withdrawAmount(double amount) 
	{
		if(amount <= balance) 
		{
			balance = balance - amount;
			System.out.println("Withdraw Amount : " + amount);
			System.out.println("Your Updated Main Balance  : " + balance);
		}else 
		{
			System.out.println("Insufficient Balance in you account");
		}
	}
	public void displayAccountDetails() 
	{
		System.out.println(accountNumber+" " + ownerName+" " + balance);
	}
}
