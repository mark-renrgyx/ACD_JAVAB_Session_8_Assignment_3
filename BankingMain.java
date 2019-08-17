package week1.day8.assignment3;

public class BankingMain {

	public static void main(String[] args) {
		// First use synchronized bank app
		
		BankAccount account = new BankAccount(10000);
		
		DepositThread depositThread = new DepositThread(account);
		WithdrawalThread withdrawalThread = new WithdrawalThread(account);
		
		depositThread.setDepositAmount(800);
		withdrawalThread.setWithdrawalAmount(800);
		
		for (int i = 0; i < 1000; i++)
		{
			depositThread.run();
			withdrawalThread.run();
		}
		
		System.out.println("Balance: " + account.getBalance());

		// Now unsynchronized bank app

		UnsyncedBankAccount oopsAccount = new UnsyncedBankAccount(10000);

		depositThread = new DepositThread(oopsAccount);
		withdrawalThread = new WithdrawalThread(oopsAccount);

		depositThread.setDepositAmount(800);
		withdrawalThread.setWithdrawalAmount(800);
		
		DepositThread depositThread2 = new DepositThread(oopsAccount);
		WithdrawalThread withdrawalThread2 = new WithdrawalThread(oopsAccount);

		depositThread2.setDepositAmount(1200);
		withdrawalThread2.setWithdrawalAmount(1200);

		for (int i = 0; i < 100000; i++)
		{
			depositThread.run();
			withdrawalThread.run();
			depositThread2.run();
			withdrawalThread2.run();
		}
		
		System.out.println("Balance: " + oopsAccount.getBalance());
	}
}
