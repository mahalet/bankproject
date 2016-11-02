package bank;

public class Account {
	private static final String String = null;
	private static final java.lang.String Stringfile = null;
	private static final java.lang.String Checking = null;
	private java.lang.String accountID1;
	
	private String name;
	private String accountID;
	private String balance;
	public Account(String newname, String newAccountID, String newbalance,String newsaving) {
		name = newname;
		accountID = newAccountID;
		balance = newbalance;
	}
	public String getbalance() {
		return balance;	
	}
	public String getName() {
		return name;
	}

	public String getID() {
		return accountID;
	}
	public String saving(){
		return saving;
	}
	public String getChecking() {
		return accountID ;
	}
	public String Checking() {
		return Checking;
	}
    
}