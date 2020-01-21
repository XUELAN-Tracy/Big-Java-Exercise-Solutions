package chapter3.exercises;

/**
 * A class to test SavingsAccount.
 * @author xuelan
 */
public class SavingsAccountTester {
    /**
     * Tests the methods of the SavingsAccount class.
     * @param args not used
     */
	public static void main(String[] args) {
		SavingsAccount saving = new SavingsAccount(1000, 0.1);
		saving.addInterest();
		System.out.println(saving.getBalance());
		System.out.println("The expected: 1100");
	}
}
