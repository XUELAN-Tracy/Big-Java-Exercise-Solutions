package chapter4.exercises;

/**
 * A class to test Easter class.
 * @author LanXue
 */
public class EasterTester {

    /**
     * Tests the methods of Easter class.
     * @param args not used
     */
    public static void main(String[] args) {

        Easter myEaster = new Easter(2001);

        System.out.println("The month of Easter Sunday in 2001 is: " + myEaster.getEasterSundayMonth());
        System.out.println("Expected: 4");

        System.out.println("The date of Easter Sunday in 2001 is: " + myEaster.getEasterSundayDay());
        System.out.println("Expected: 15");
    }
}
