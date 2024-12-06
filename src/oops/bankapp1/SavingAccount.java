package oops.bankapp1;

public class SavingAccount extends Account
{
	double interestRate;

	public SavingAccount(String accountHolder, double balance, double interestRate) 
	{
		super(accountHolder, balance);
		this.interestRate = interestRate;
	}
	
	public void calculateInterest() 
	{
		double interest = getBalance() * interestRate / 100;
		System.out.println("Interest for the month : " +interest);
	}
	@Override
	public void displayInfo() 
	{
		super.displayInfo();
		System.out.println(" Interest Rate : "+interestRate+"%");
	}
	

}
