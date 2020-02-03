package chapter4.codestudy;


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
	    
		CashRegister04 register = new CashRegister04();
	    
	    
	    register.recordPurchase(0.75);
	    register.recordPurchase(1.50);
	    register.enterPayment(2, 0, 5, 0, 0); 
	    System.out.println("change: " + register.giveChange());
	    System.out.println("The expected: 0.25");
	    
	    register.recordPurchase(2.25);
	    register.recordPurchase(19.25);
	    register.enterPayment(23, 2, 0, 0, 0);
	    System.out.println("change: " + register.giveChange());
	    System.out.println("The expected: 2.0");     
	}
}
