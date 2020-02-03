package chapter4.projects.cashregister;

import java.util.Scanner;

/**
 * A class to test CashRegister class.
 * @author LanXue
 */
public class CashRegisterTester {

    /**
     * Tests the methods of CashRegister class.
     * @param args noe used
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        CashRegister myRegister1 = new CashRegister();

        myRegister1.recordPurchase(5.5);
        myRegister1.recordPurchase(3.2);

        System.out.print("Which type of coins would you like to use? ");
        String coinName = in.nextLine();
        myRegister1.enterPayment(10, new Coin(coinName));
        System.out.println("\nYou have bought " + myRegister1.getItem() + " items");
        System.out.println("Here is the change: "
                + String.format("%.2f", myRegister1.giveChange()));
        System.out.println("Expected: 2, 1.3");
        System.out.println("Welcome again!");
        myRegister1.resetRegister();


        CashRegister myRegister2 = new CashRegister();
        myRegister2.recordPurchase(0.2);
        myRegister2.recordPurchase(0.5);

        System.out.print("\nWhich type of coins would you like to use? ");
        coinName = in.nextLine();
        myRegister2.enterPayment(4, new Coin(coinName));
        System.out.println("\nYou have bought " + myRegister2.getItem() + " items");
        System.out.println("Here is the change: "
                + String.format("%.2f", myRegister2.giveChange()));
        System.out.println("Expected: 2, 0.3");
        System.out.println("Welcome again!");
        myRegister2.resetRegister();

    }
}
