package chapter3.projects;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */

public class BankAccount {
    
	private double balance;
	private double fee;
	private int count;
	private int countMax;
   
    /**
     * Construct a bank account with a zero balance
	 */  
    public BankAccount(){
        balance = 0;
        fee = 10;
        countMax = 5;
    }
    
    /**
     * Construct a bank account with a given balance.
     * @param initialBalance the amount of given valance
	 */  
    public BankAccount(double initialBalance) {
        balance = initialBalance;
        fee = 10;
        countMax = 5;
    }
    
    /**
     * Deposits money into the bank account.
     * @param amount the amount of deposit
     */
    public void deposit(double amount) {
    	balance = balance + amount;
    	count += 1;
    }
    
    /**
     * Withdraws money from the bank account.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
    	balance = balance - amount;
    	count += 1;    
    }
    
    /**
     * Determines whether the number of transactions exceed the number of free transactions and charge the fee.
     */
    public void deductMonthlyCharge() {
    	if (count > countMax) {
    		balance = balance - (count-countMax)*fee;
    	}
    	count = 0;
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
