package chapter4.exercises;


/**
 * A cash register to calculate the change.
 * @author xuelan
 */
public class CashRegisterEnhance {

    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;

    public static final int PENNIES_PER_QUARTER = 25;
    public static final int PENNIES_PER_DIME = 10;
    public static final int PENNIES_PER_NICKEL = 5;
    public static final int PENNIES_PER_DOLLAR = 100;



    private double purchase;
    private double payment;
    private int itemNumber;

    /**
     * Constructs a cash register with no money in it.
     */
    public CashRegisterEnhance() {
        purchase = 0;
        payment = 0;
        itemNumber = 0;
    }

    /**
     * Records the purchase price of an item.
     * @param amount the price of the purchases item
     */
    public void recordPurchase(double amount) {
        purchase += amount;
        itemNumber += 1;
    }

    /**
     * Records the number of given dollars as a payment;
     * @param dollars the number of given dollars
     */
    public void enterDollars(int dollars) {
        payment = payment + dollars;
    }

    /**
     * Records the number of given quarters as a payment;
     * @param quarters the number of given quarters
     */
    public void enterQuarters(int quarters) {
        payment = payment + quarters * QUARTER_VALUE;
    }

    /**
     * Records the number of given dimes as a payment;
     * @param dimes the number of given dimes
     */
    public void enterDimes(int dimes) {
        payment = payment + dimes * DIME_VALUE;
    }

    /**
     * Records the number of given nickels as a payment;
     * @param nickels the number of given nickels
     */
    public void enterNickels (int nickels) {
        payment = payment + nickels * NICKEL_VALUE;
    }

    /**
     * Records the number of given pennies as a payment;
     * @param pennies the number of given pennies
     */
    public void enterPennies(int pennies) {
        payment = payment + pennies * PENNY_VALUE;
    }

    /**
     * Computes the change
     * @return the change due to the customer
     */
    public double giveChange() {
        double change = payment - purchase;
        return change;
    }

    public int getItem() {
        return itemNumber;
    }

    /**
     * Resets the machine for the next deal.
     */
    public void resetRegister() {
        payment = 0;
        purchase = 0;
        itemNumber = 0;
    }

    /**
     * Records the payment.
     * @param dollars the number of given dollars
     * @param quarters the number of given quarters
     * @param dimes the number of given dimes
     * @param nickels the number of given nickels
     * @param pennies the number of given pennies
     */
    public void enterPayment(int dollars, int quarters, int dimes, int nickels, int pennies) {
        payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }

    /**
     * Computes the number of dollars as given changes and returns it.
     * @return the number of dollars
     */
    public int giveDollars() {
        int dollars = (int) (payment - purchase);
        return dollars;
    }

    /**
     * Computes the number of quarters as given changes and returns it.
     * @return the number of quarters
     */
    public int giveQuarters() {
        double change = payment - purchase;
        int pennies = (int) Math.round((change - giveDollars()) * PENNIES_PER_DOLLAR);
        int quarters = (int) (pennies / PENNIES_PER_QUARTER);
        return quarters;
    }

    /**
     * Computes the number of dimes as given changes and returns it.
     * @return the number of dimes
     */
    public int giveDimes() {
        double change = payment - purchase;
        int pennies = (int) Math.round((change - giveDollars()) * PENNIES_PER_DOLLAR);
        int dimes = (int) (pennies - (giveQuarters() * PENNIES_PER_QUARTER)) / PENNIES_PER_DIME;
        return dimes;
    }

    /**
     * Computes the number of nickels as given changes and returns it.
     * @return the number of nickels
     */
    public int giveNickels() {
        double change = payment - purchase;
        int pennies = (int) Math.round((change - giveDollars()) * PENNIES_PER_DOLLAR);
        int nickels = (int) (pennies - (giveQuarters() * PENNIES_PER_QUARTER +
                giveDimes() * PENNIES_PER_DIME)) / PENNIES_PER_NICKEL;
        return nickels;
    }

    public int givePennies() {
        double change = payment - purchase;
        int pennies = (int) Math.round((change - giveDollars()) * PENNIES_PER_DOLLAR);
        int penniesNum = (int) (pennies - (giveQuarters() * PENNIES_PER_QUARTER +
                giveDimes() * PENNIES_PER_DIME +
                giveNickels() * PENNIES_PER_NICKEL)) / 1;
        return penniesNum;
    }

}
