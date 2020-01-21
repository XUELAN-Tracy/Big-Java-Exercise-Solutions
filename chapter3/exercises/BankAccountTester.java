package chapter3.exercises;

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
		tracysChecking.withdraw(400);
		System.out.println(tracysChecking.getBalance());
		System.out.println("Expeced: 100");
		
		tracysChecking = new BankAccount();
		tracysChecking.deposit(1000);
		tracysChecking.addInterest(10);
		System.out.println(tracysChecking.getBalance());
		System.out.println("Expected: 1100");
	}

}
