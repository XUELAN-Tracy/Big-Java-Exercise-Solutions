package chapter4.codestudy;

import java.util.Scanner;
/**
 * This program simulates a transaction in which a user pays for an item and receive change.
 * @author xuelan
 */

public class CashRegisterSimulator {

    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        CashRegister04 register04 = new CashRegister04();

        System.out.println("Enter price: ");
        double price = in.nextDouble();
        register04.recordPurchase(price);

        System.out.print("Enter dollars: ");
        int dollars = in.nextInt();
        System.out.print("Enter quarters: ");
        int quarters = in.nextInt();
        System.out.print("Enter dimes: ");
        int dimes = in.nextInt();
        System.out.print("Enter nickel: ");
        int nickels = in.nextInt();
        System.out.print("Enter pennies: ");
        int pennies = in.nextInt();
        register04.enterPayment(dollars, quarters, dimes, nickels, pennies);

        System.out.print("Your change: ");
        System.out.println(register04.giveChange());

    }
}
