package bank;

public class DebitAccount extends AccountFactory {

	public DebitAccount(String name, String accountID, int balance){
		super();
		public void depositFunds(int transaction) {
			// same as balance = balance + transaction
			balance += transaction;
		}
	}
	

	public void withdrawFunds(int transaction) {
		if (balance >= transaction) {
			balance -= transaction;
		}
		else {
			balance = 0;
		
	}

}