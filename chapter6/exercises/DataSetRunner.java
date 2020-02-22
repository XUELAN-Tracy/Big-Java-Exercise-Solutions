package chapter6.exercises;

import java.util.Scanner;

/**
 * This program can record the data values from input and print out the count,
 * the average and the standard deviation.
 * @author LanXue
 * @date 2020-02-22 16:39
 */
public class DataSetRunner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DataSet set =  new DataSet();

        boolean done = false;

        while (!done) {
            System.out.print("Enter the value (Q to quit): ");
            String input = in.next();
            if (input.equalsIgnoreCase("Q")) {
                done = true;
            } else {
                set.addValue(Double.parseDouble(input));
            }
        }

        System.out.println("Count of values: " + set.getCount());
        System.out.printf("Mean: %.3f\n", set.getMean());
        System.out.printf("Standard deviation: %.3f\n", set.getStandardDeviation());

    }

}
