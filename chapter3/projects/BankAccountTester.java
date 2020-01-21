package chapter3.projects;

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
		tracysChecking.deposit(1000);
		tracysChecking.withdraw(200);
		tracysChecking.withdraw(100);
		tracysChecking.deductMonthlyCharge();
		System.out.println(tracysChecking.getBalance());
		System.out.println("Expeced: 790");
		
		tracysChecking.deposit(1000);
		tracysChecking.withdraw(500);
		tracysChecking.withdraw(400);
		tracysChecking.deposit(1000);
		tracysChecking.withdraw(200);
		tracysChecking.withdraw(100);
		tracysChecking.deductMonthlyCharge();
		System.out.println(tracysChecking.getBalance());
		System.out.println("Expeced: 1580");
		
		tracysChecking = new BankAccount();
		tracysChecking.deposit(1000);
		tracysChecking.addInterest(10);
		System.out.println(tracysChecking.getBalance());
		System.out.println("Expected: 1100");
	}

}
