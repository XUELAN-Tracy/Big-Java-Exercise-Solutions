package chapter3.exercises;

/**
 * A bank saving account has a balance that can be changed with interests.
 * @author xuelan
 */
public class SavingsAccount {
    private double balance;
    private double interestRate;
    
    /**
     * Creates a saving account with 1000 as initial balance and 10% as interest rate.
     * @param initialBalance the initial balance
     * @param rate the interest rate
     */
    public SavingsAccount(double initialBalance, double rate)  {
    	    balance = initialBalance;
    	    interestRate = rate;
    }
    
    /**
     * Adds interest to the bank account.
     */
    public void addInterest() {
    	    balance = balance + balance*interestRate;
    }
    
    /** 
     * Gets the account balance.
     */
    public double getBalance() {
    	    return balance;   	
    }
}
