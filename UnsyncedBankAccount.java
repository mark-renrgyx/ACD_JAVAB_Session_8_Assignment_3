package week1.day8.assignment3;

public class UnsyncedBankAccount implements Banking {
	private int balance;

	public UnsyncedBankAccount() {
		balance = 0;
	}

	public UnsyncedBankAccount(int balance) {
		this.balance = balance;
	}

	public boolean withdraw (int amount) {

		if (balance < amount)
			return false;
		else {
			balance -= amount;
			return true;
		}
	}

	public void deposit (int amount) {

		balance += amount;
	}

	public int getBalance() {
		return balance;
	}
}
