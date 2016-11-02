package bank;

public class createSavingAccount extends DebitAccount {

	public static int minimumBalance = 300;
	public createSavingAccount(String name, String accountID, int balance) {
		super(name, accountID, balance);
	}
	@Override
	public void withdrawFunds(int transaction) {
		if (balance - minimumBalance >= transaction) {
			balance -= transaction;
		}
		else {
			balance = minimumBalance;

	}

	}
}
