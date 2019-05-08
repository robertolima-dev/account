package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "John", 0.0, 500.0);

		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Carl", 0.0, 300.0);
		Account acc3 = new SavingsAccount(1004, "Morgan", 0.0, 0.01);

		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			// System.out.println("Loan!");
		}

		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			// System.out.println("Update!");
		}

		Account acc6 = new Account(1005, "Mary", 1000.0);
		acc6.withdraw(200.0);
		// System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1006, "Melody", 1000.0, 0.01);
		acc7.withdraw(200.00);
		// System.out.println(acc7.getBalance());
		
		Account acc8 = new BusinessAccount(1007, "Tedy", 1000.0, 500.00);
		acc8.withdraw(200.00);
		// System.out.println(acc8.getBalance());
		
		Account x = new Account(1010, "David", 1000.0);
		Account y = new SavingsAccount(1020, "Joane", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		// System.out.println(x.getBalance());
		// System.out.println(y.getBalance());
		
		Account acc9 = new Account(1023, "Andrey", 1000.0);
		Account acc10 = new SavingsAccount(1025, "Alan", 1000.0, 0.01);
		Account acc11 = new BusinessAccount(1028, "Robert", 1000.0, 500.0);
	}
}
