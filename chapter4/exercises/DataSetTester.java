package chapter4.exercises;
import java.util.Scanner;

/**
 * A class to test DataSet class.
 * @author LanXue
 */
public class DataSetTester {

    /**
     * Tests the methods of the DataSet class.
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DataSet set = new DataSet();

        set.addValue(in.nextInt());
        set.addValue(in.nextInt());
        set.addValue(in.nextInt());
        set.addValue(in.nextInt());

        System.out.println("The sum is: " + set.getSum());
        System.out.println("The expected is 14");

        System.out.println("The average is: " + set.getAverage());
        System.out.println("The expected is 3.5");

    }
}
