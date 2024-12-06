package oops.bankapp;

public class BankApplication 
{
	public static void main(String[] args) 
	{
		SavingsAccount savings = new SavingsAccount("SA123", "Rahul", 5000, 4);
        savings.displayAccountDetails();
        savings.depositAmount(2000);
        savings.addInterest();
        savings.withdrawAmount(3000);
		
		System.out.println("--------------------");
		savings.displayAccountDetails();
		System.out.println("------------------------------------------------------------");

		 // Create a CurrentAccount object
        CurrentAccount current = new CurrentAccount("CA456", "Kirpekar", 10000, 5000);
        current.displayAccountDetails();
        current.withdraw(12000); // Within overdraft limit
        current.withdraw(7000); // Exceeds overdraft limit
	}
}
