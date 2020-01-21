package chapter3.exercises;

/**
 * A class to test CashRegister.
 * @author xuelan
 */
public class CashRegisterTester {
	/**
     * Tests the methods of the CashRegister class.
     * @param args not used
     */
	public static void main(String[] args) {
	    CashRegister register = new CashRegister(0.06);
	    
	    // Day 1 with 2 customers
	    register.recordPurchase(29.50);
	    register.recordPurchase(9.25);
	    register.enterPayment(50);
	    
	    double change = register.giveChange();
	    
	    System.out.println(change);
	    System.out.println("The expected: 8.925");
	    
	    register.recordPurchase(100);
	    register.enterPayment(110);
	    change = register.giveChange();
	    System.out.println(change);
	    System.out.println("The expected: 4");
	    
	    double totalSales = register.getSalesTotal();
	    int salesNumber = register.getSalesCount();
	    
	    System.out.println("The total amount of sales of the day is: " + totalSales);
	    System.out.println("The total number of sales of the day is: " + salesNumber);
	    register.reset();
	    
	    // Day 2 with 1 customer
	    register.recordPurchase(20);
	    register.recordPurchase(10);
	    register.enterPayment(50);
	    
	    change = register.giveChange();
	    
	    System.out.println(change);
	    System.out.println("The expected: 18.2");
	    
	    totalSales = register.getSalesTotal();
	    salesNumber = register.getSalesCount();
	    
	    System.out.println("The total amount of sales of the day is: " + totalSales);
	    System.out.println("The total number of sales of the day is: " + salesNumber);
	    register.reset();    
	}

}
