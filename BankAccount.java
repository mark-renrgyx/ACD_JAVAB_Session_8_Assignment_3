package week1.day8.assignment3;

public class BankAccount implements Banking {
	private volatile int balance;
	
	public BankAccount() {
		balance = 0;
	}
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public boolean withdraw (int amount) {
		synchronized (this) {
			if (balance < amount)
				return false;
			else {
				balance -= amount;
				return true;
			}
		}
	}
	
	public void deposit (int amount) {
		synchronized(this) {
			balance += amount;
		}
	}
	
	public int getBalance() {
		synchronized(this) {
			return balance;
		}
	}
}
