package week1.day8.assignment3;

public class WithdrawalThread implements Runnable {
	
	private int withdrawalAmount;
	private Banking account;
	
	public WithdrawalThread (Banking account) {
		this.account = account;
	}
	
	public void setWithdrawalAmount(int amount) {
		this.withdrawalAmount = amount;
	}
	
	@Override
	public void run() {
		account.withdraw(withdrawalAmount);
	}
}
