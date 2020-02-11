package chapter5.exercises;

import chapter5.codestudy.TaxReturn;

import java.util.Scanner;

/**
 * A program to calculate a simple tax return.
 * @author LanXue
 * @date 2020-02-10 17:16
 */
public class TaxReturnTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your income: ");
        double income = in.nextDouble();

        System.out.print("Are you married? (Y/N) ");
        String input = in.next();

        int status;
        if (input.equalsIgnoreCase("Y")) {
            status = chapter5.codestudy.TaxReturn.MARRIED;
        } else {
            status = chapter5.codestudy.TaxReturn.SINGLE;
        }

        chapter5.codestudy.TaxReturn myTaxReturn = new TaxReturn(income, status);

        System.out.println("Tax: " + myTaxReturn.getTax());
    }
}


