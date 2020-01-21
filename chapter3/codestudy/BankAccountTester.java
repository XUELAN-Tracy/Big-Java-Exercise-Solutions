package chapter3.codestudy;

/**
 * A class to test BankAccount class.
 */

public class BankAccountTester {
/**
 * Tests the methods of the BankAccount class.
 * @param args not used
 */
	public static void main(String[] args) {
		BankAccount tracysChecking = new BankAccount();
		tracysChecking.deposit(2000);
		tracysChecking.withdraw(500);
		System.out.println(tracysChecking.getBalance());
		System.out.println("Expeced: 1500");
	}

}
