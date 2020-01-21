package chapter3.exercises;

/**
 * A cash register to caculate the change.
 * @author xuelan
 */
public class CashRegister {
    private double purchase;
    private double payment;
    private double taxRate;
    private double sales;
    private double totalSales;
    private int salesNumber;
    
    /**
     * Counstrcuts a cash register with no money in it.
     */
    public CashRegister(double rate)  {
    	purchase = 0.0;
    	sales = 0.0;
    	taxRate = rate;
    }
    
    /**
     * Records the sale of an item.
     * @price the price of the item
     */
    public void recordPurchase(double price) {
    	purchase = purchase + price;
    	salesNumber += 1;
    	totalSales = totalSales + price;
    	recordTaxablePurchase(price);
    }
    
    /**
     * Enters the payment received from the customer.
     * @param amount the amount of the payment.
     */
    public void enterPayment(double amount) {
    	payment = amount;
    }
    
    /**
     * Records the sale of a taxable item.
     * @param price the price of the item
     */
    public void recordTaxablePurchase(double price) {
    	sales = sales + price;
    }
    
    /**
     * Computes the total tax.
     * @return the total tax
     */
    public double getTotalTax() {
    	double totalTax = sales * taxRate;
    	return totalTax;
    }
    
    /**
     * Computes the total amount of sales of the day.
     * @return the total sales
     */
    public double getSalesTotal() {
    	return totalSales;
    }
    
    /**
     * Computes the total number of sales of the day.
     * @return the total number of sales
     */
    public int getSalesCount() {
    	return salesNumber;
    }
    
    /**
     * Computes the change due and resets the machine for the next deal.
     * @return the change due to the customer
     */
    public double giveChange() {
    	double totalTax = getTotalTax();
    	double change = payment -  purchase - totalTax;
    	purchase = 0;
    	payment = 0;
    	sales = 0;
    	return change;
    }
    
    /**
     * Resets the counter and makes total sales & total sale number zero.
     */
    public void reset() {
    	totalSales = 0;
    	salesNumber = 0;
    }

    public void enterPayment(int dollars, int quarters, int dimes, int nickels, int pennies) {
    }
}
