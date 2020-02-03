package chapter4.projects.cashregister;

public class CashRegister {

    private double purchase;
    private double payment;
    private int itemNumber;

    /**
     * Constructs a cash register with no money in it.
     */
    public CashRegister() {
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
     * Records the payment and which type of coins has been used, then computes with dollars or euros
     * @param amount the amount of payment
     * @param coin the name of the coins
     */
    public void enterPayment(double amount, Coin coin) {
        payment += amount * coin.getValue();
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
}
