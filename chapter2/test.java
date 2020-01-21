package chapter2;


/** 
 *  A bank account has a balance that can be changed by deposits and withdrawals.
 */

public class test {
	
	private double value;
    
	/**
     * Construct a bank account with a given balance.
     * @param initialBalance the amount of given valance
     */
    public test(double initialBalance) {
        value = initialBalance;
    }  
    
    /**
     * Withdraw money from the bank account.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        value = value - amount;
    }
    
    /**
     * Gets the current balance of the bank account.
     * @return the current balance
     */
    public double getBalance() {
        return value;
    }
}
