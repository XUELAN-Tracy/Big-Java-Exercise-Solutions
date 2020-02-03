package chapter4.exercises;

/**
 * A class to test CashRegisterEnhance.
 * @author xuelan
 */
public class CashRegisterEnhanceTester {

    /**
     * Tests the methods of the CashRegister class.
     * @param args not used
     */
    public static void main (String[] args) {

        CashRegisterEnhance register = new CashRegisterEnhance();
        register.recordPurchase(20.37);
        register.recordPurchase(18.02);
        register.recordPurchase(7);
        register.enterDollars(50);
        register.enterQuarters(2);
        register.enterDimes(20);
        System.out.println("Change: " + "\t" +register.giveChange());
        System.out.println("The number of items: " +"\t" + register.getItem());
        register.resetRegister();
        System.out.println("Expected: 7.11, 3");



        CashRegisterEnhance register1 = new CashRegisterEnhance();

        register1.recordPurchase(8.37);
        register1.enterPayment(10, 0 ,0, 0, 0);
        System.out.println("\n");
        System.out.println("Dollars: " + register1.giveDollars());
        System.out.println("Expected: 1");
        System.out.println("Quarters: " + register1.giveQuarters());
        System.out.println("Expected: 2");
        System.out.println("Dimes: " + register1.giveDimes());
        System.out.println("Expected: 1");
        System.out.println("Nickels: " + register1.giveNickels());
        System.out.println("Expected: 0");
        System.out.println("Pennies: " + register1.givePennies());
        System.out.println("Expected: 3");
    }
}
