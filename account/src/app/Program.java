package app;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		BusinessAccount bacc = new BusinessAccount(1002, "John", 0.0, 500.0);


		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1025, "Carl", 1000.0, 0.01));
		list.add(new SavingsAccount(1028, "Madalene", 1000.0, 0.01));
		list.add(new BusinessAccount(1030, "Robert", 1000.0, 300.0));
		list.add(new BusinessAccount(1032, "Brad", 1000.0, 500.0));

		double sum = 0.0;
		for (Account acc10 : list) {
			sum += acc10.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

	}
}
