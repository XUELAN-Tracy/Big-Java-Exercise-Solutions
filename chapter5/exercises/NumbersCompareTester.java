package chapter5.exercises;

import java.util.Scanner;

/**
 * A class to test NumbersCompare class.
 * @author LanXue
 * @date 2020-02-11 17:34
 */
public class NumbersCompareTester {

    /**
     * Tests the methods of NumbersCompare class
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner in  =  new Scanner(System.in);
        System.out.println("Enter twp floating-point numbers: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();

        NumbersCompare compare = new NumbersCompare(num1, num2);
        System.out.println(compare.getResult());
    }
}
