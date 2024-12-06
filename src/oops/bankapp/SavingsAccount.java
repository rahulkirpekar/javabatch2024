package oops.bankapp;

public class SavingsAccount extends Account
{
	double interestRate;
	
	public SavingsAccount(String accountNumber, String ownerName, double balance,double interestRate)
	{
		super(accountNumber, ownerName, balance);
		this.interestRate = interestRate;
	}
	
	public void addInterest() 
	{
		double interest = balance * (interestRate / 100);

		balance = balance + interest;
		
		System.out.println("Interest Added : " + interest);
		System.out.println("Updated Main Balance After Interest : " + balance);
	}
}
