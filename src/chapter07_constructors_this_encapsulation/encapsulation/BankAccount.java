package chapter07_constructors_this_encapsulation.encapsulation;

public class BankAccount {
	private int number;
	private String holder;
	private double balance;

	public BankAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
}
