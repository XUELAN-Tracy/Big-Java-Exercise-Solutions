package chapter6.exercises;

import java.util.Scanner;

/**
 * This program can convert U.S. dollars to euro values.
 * @author LanXue
 * @date 2020-02-21 22:57
 */
public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Today's price of one dollar in euro is: ");
        double price = in.nextDouble();

        boolean done = false;
        while (!done) {
            System.out.print("Enter dollars or Q to quit: ");
            String input = in.next();
            if (input.equalsIgnoreCase("Q")) {
                done = true;
            } else {
                double dollars = Double.parseDouble(input);
                double euros = dollars * price;
                System.out.println(dollars + " dollars is equal to " + euros + " euros.");
            }
        }
    }
}
