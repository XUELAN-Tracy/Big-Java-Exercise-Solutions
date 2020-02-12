package chapter5.exercises;

import java.util.Scanner;

/**
 * A class to test PayCheck class.
 * @author LanXue
 * @date 2020-02-12 16:50
 */
public class PayCheckTester {

    /**
     * Tests the methods of PayCheck class.
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter hourly wage: ");
        double hourlyPay = in.nextDouble();
        System.out.print("How many hours did you work this week? ");
        double hours = in.nextDouble();

        PayCheck pay = new PayCheck(hours, hourlyPay);
        System.out.println("Weekly pay: " + pay.getPay());

    }
}
