package bank;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class AccountFactoryTest {

	@Test
	// arrange
	public void shouldreadname() throws IOException {
		AccountFactory myfactory = new AccountFactory();
		String filepath = "C:\\Users\\WeCanCodeIT\\workspace\\bank\\src\\bank\\FILE1";
		// act
		Account myAccount = myfactory.read(filepath);
		String name = myAccount.getName();
		// assert
		Assert.assertEquals("JOJO MCcony", name);
	}

	@Test
	// arrange
	public void shouldreadID() throws IOException {
		AccountFactory myfactory = new AccountFactory();
		String filepath = "C:\\Users\\WeCanCodeIT\\workspace\\bank\\src\\bank\\FILE1";
		// act
		Account myAccount = myfactory.read(filepath);
		String ID = myAccount.getID();
		// assert
		Assert.assertEquals("15367788909", ID);
	}

	@Test
	// arrange
	public void shouldreadBalance() throws IOException {
		AccountFactory myfactory = new AccountFactory();
		String filepath = "C:\\Users\\WeCanCodeIT\\workspace\\bank\\src\\bank\\FILE1";
		// act
		Account myAccount = myfactory.read(filepath);
		String balance = myAccount.getbalance();
		// assert
		Assert.assertEquals("456", balance);
	}
	@Test
	// arrange
	public void shouldreadsaving() throws IOException {
		AccountFactory myfactory = new AccountFactory();
		String filepath = "C:\\Users\\WeCanCodeIT\\workspace\\bank\\src\\bank\\FILE1";
		// act
		Account myAccount = myfactory.read(filepath);
		String balance = myAccount.saving();
		// assert
		Assert.assertEquals("saving", balance);
}
	@Test
	// arrange
	public void shouldreadChecking() throws IOException {
		String filepath = " C:\\Users\\WeCanCodeIT\\workspace\\bank\\src\\bank\\FILE2";
		AccountFactory myfactory = new AccountFactory();
		// act
		Account myAccount = myfactory.read(filepath);
		String balance =myAccount.Checking();
		// assert
		Assert.assertEquals("checking", balance);
	}
	 
}
