package oops.bankapp;

public class CurrentAccount extends Account
{
	double overDraftLimit;	

	public CurrentAccount(String accountNumber, String ownerName, double balance,double overDraftLimit) 
	{
		super(accountNumber, ownerName, balance);
		this.overDraftLimit = overDraftLimit;
	}
	 // Overriding withdraw method to allow overdraft
	public void withdraw(double amount) 
	{
		if(amount <= (balance+overDraftLimit)) 
		{
			balance = balance - amount;
			System.out.println("Your Updated Main Balance  : " + balance);
		}else 
		{
			System.out.println("Overdraft limit exceeded!");
		}
	}
}
