package chapter5.exercises;

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
		tracysChecking.deposit(1000);
		tracysChecking.withdraw(500);
		tracysChecking.withdraw(600);
		System.out.println(tracysChecking.getBalance());
		System.out.println("Expected: There is not enough money to withdraw.");
	}

}
