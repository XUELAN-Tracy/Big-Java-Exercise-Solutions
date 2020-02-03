package chapter4.exercises;

/**
 * A class to test Month class.
 * @author LanXue
 */
public class MonthTester {
    /**
     * Tests the methods of Month class.
     * @param args not used
     */
    public static void main(String[] args) {

        Month month = new Month(3);
        System.out.println("The month's name is: " + month.getName());

        Month month1 = new Month(5);
        System.out.println("The month's name is: " + month1.getName());
    }
}
