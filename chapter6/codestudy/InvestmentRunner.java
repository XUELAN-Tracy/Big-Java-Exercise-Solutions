package chapter6.codestudy;

/**
 * This program computes how long it takes for an investment.
 * @author LanXue
 * @date 2020-02-15 14:59
 */
public class InvestmentRunner {

    public static void main(String[] args) {

        final double INITIAL_BALANCE = 10000;
        final double RATE = 5;
        final int YEARS = 20;
        Investment invest1 =  new Investment(INITIAL_BALANCE, RATE);
        invest1.waitForBalance(2 * INITIAL_BALANCE);
        System.out.println("The investment doubled after " + invest1.getYears() + " years");

        Investment invest2 =  new Investment(INITIAL_BALANCE, RATE);
        invest2.waitYears(YEARS);
        double balance = invest2.getBalance();
        System.out.printf("The balance after %d years is %.2f\n", YEARS, balance);
    }

}
