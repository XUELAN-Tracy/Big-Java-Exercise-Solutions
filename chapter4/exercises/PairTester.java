package chapter4.exercises;

import java.util.Scanner;

/**
 * A class to test Pair.
 * @author LanXue
 */
public class PairTester {

    /**
     * Tests the methods of the Pair Class.
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("The first value: ");
        double first = in.nextDouble();
        System.out.println("The second value: ");
        double second = in.nextDouble();

        Pair pair = new Pair(first, second);

        System.out.println("Sum: " + pair.getSum());
        System.out.println("Difference: " + pair.getDifference());
        System.out.println("Production : " + pair.getProduction());
        System.out.println("Average: " + pair.getAverage());
        System.out.println("Distance: " + pair.getDistance());
        System.out.println("Maximum: " + pair.getMax());
        System.out.println("Minimum: " + pair.getMin());
    }
}
