package chapter4.exercises;

import java.util.Scanner;

/**
 * A class to test DataSet46 class.
 * @author LanXue
 */
public class DataSet46Tester {

    /**
     * Tests the methods of the DataSet46 class.
     * @param args not used
     */
    public static void main(String[] args) {

        DataSet46 set46 = new DataSet46();
        Scanner in = new Scanner(System.in);

        set46.addValue(in.nextInt());
        set46.addValue(in.nextInt());
        set46.addValue(in.nextInt());
        set46.addValue(in.nextInt());

        System.out.println("The smallest is: " + set46.getSmallest());
        System.out.println("The expected is -5");

        System.out.println("The largest is: " + set46.getLargest());
        System.out.println("The expected is 5");

    }
}
