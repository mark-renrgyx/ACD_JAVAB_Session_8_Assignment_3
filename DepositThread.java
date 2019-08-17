package week1.day8.assignment3;

public class DepositThread implements Runnable {
	
	private int depositAmount;
	private Banking account;
	
	public DepositThread (Banking account) {
		this.account = account;
	}
	
	public void setDepositAmount(int amount) {
		this.depositAmount = amount;
	}
	
	@Override
	public void run() {
		account.deposit(depositAmount);
	}
}
