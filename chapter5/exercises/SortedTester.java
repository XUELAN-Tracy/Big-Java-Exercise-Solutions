package chapter5.exercises;

import java.util.Scanner;

/**
 * A class to test Sorted class.
 * @author LanXue
 */
public class SortedTester {

    /**
     * Test the methods of class Sorted.
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter three numbers: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();

        Sorted numbers = new Sorted(num1, num2, num3);
        System.out.println(numbers.getSorted());
    }
}
