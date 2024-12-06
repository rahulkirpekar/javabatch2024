package oops.bankapp1;

public class BankApplication 
{
	public static void main(String[] args) 
	{
		SavingAccount savingAccount = new SavingAccount("Rahul", 10000, 1.5);

		CurrentAccount currentAccount = new CurrentAccount("Kunal", 20000, 10000);	
		
		savingAccount.displayInfo();
		currentAccount.displayInfo();
		
		System.out.println("Performing Operation on Saving Account : ");
		savingAccount.deposite(50000);
		savingAccount.withdraw(55000);
		savingAccount.calculateInterest();
		
		
		System.out.println("Performing Operation on Current Account : ");
		currentAccount.deposite(10000);
		System.out.println("Current Account Balance : "+currentAccount.getBalance());
		
		
		currentAccount.withdraw(30000);
		
		currentAccount.displayInfo();
		
//		currentAccount.withdraw(35000);
		
		
	}
}
