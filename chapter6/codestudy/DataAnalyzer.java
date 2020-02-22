package chapter6.codestudy;

import java.util.Scanner;

/**
 * This program computes the average and maximum of a set of input values.
 * @author LanXue
 * @date 2020-02-15 20:20
 */
public class DataAnalyzer {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DataSet data = new DataSet();

        boolean done = false;
        while (!done) {
            System.out.printf("Enter a value, Q to quit: ");
            String input = in.next();
            if (input.equalsIgnoreCase("Q")) {
                done = true;
            } else {
                double x = Double.parseDouble(input);
                data.add(x);
            }
        }
        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMax());
    }
}
