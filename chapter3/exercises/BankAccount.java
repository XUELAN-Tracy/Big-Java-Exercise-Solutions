package chapter3.exercises;

/** 
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */

public class BankAccount {
    
	private double balance;
   
    /**
     * Construct a bank account with a zero balance
	 */  
    public BankAccount(){
        balance = 0;
    }
    
    /**
     * Construct a bank account with a given balance.
     * @param initialBalance the amount of given valance
	 */  
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    
    /**
     * Deposits money into the bank account.
     * @param amount the amount of deposit
     */
    public void deposit(double amount) {
    	balance = balance + amount;
    }
    
    /**
     * Withdraws money from the bank account.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    
    /**
     * Adds interest to the bank account.
     * @param rate the interest rate
     */
    public void addInterest(double rate) {
    	balance = balance + balance*rate;
    }
    
    /**
     * Gets the current balance of the bank account.
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }
}
