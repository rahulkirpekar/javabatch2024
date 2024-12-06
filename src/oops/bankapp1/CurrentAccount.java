package oops.bankapp1;

public class CurrentAccount extends Account
{
	double overdraftLimit;

	public CurrentAccount(String accountHolder, double balance, double overdraftLimit) 
	{
		super(accountHolder, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) 
	{
		if ((amount > 0) && ( amount <= (balance+overdraftLimit))) {
			
			super.withdraw(amount);

		} else 
		{
			System.out.println("Invalid amount , Insufficient Balance Or Overdraft limit exceedeed.");
		}
	}
	@Override
	public void displayInfo() 
	{
		super.displayInfo();
		System.out.println(" Overdraft Limit : "+overdraftLimit);
	}
}
