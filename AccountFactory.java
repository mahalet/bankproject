package bank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccountFactory { 
	public Account read(String filepath) throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader(filepath));
		String name = buffer.readLine();
		String accountID = buffer.readLine();
		String initialBalance = buffer.readLine();
		String accountType = buffer.readLine();
		int balance = Integer.parseInt(initialBalance);
		Account account ;
		if(accountType.equals("Checking")) {
		 account = createCheckingAccount(name, accountID, balance);
		}else if(accountType.equals("Saving")){
	   	  account = createSavingAccount(name, accountID, balance);
	    try{
	    	}catch(Exception e){
	    		System.out.println("error happend");
	    		throw e;
	    	
	    	}finally{
	    	System.out.println("after exception");
	    	}
		
		return account;
	}
	}
	private Account createSavingAccount(String name, String accountID,
			int balance) {
		return new createSavingAccount(name, accountID, balance);
	}

	private Account createCheckingAccount(String name, String accountID,
			int balance) {
		return new createCheckingAccount(name, accountID, balance);
	}
}

	    