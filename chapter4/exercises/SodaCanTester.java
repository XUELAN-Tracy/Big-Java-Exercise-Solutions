package chapter4.exercises;

/**
 * A class to test SodaCan class.
 * @author LanXue
 */
public class SodaCanTester {

    /**
     * Tests the methods of SodaCan class.
     * @param args not used
     */
    public static void main(String[] args) {

        SodaCan can = new SodaCan(10, 2);

        System.out.println("The volume is: " + String.format("%.2f", can.getVolume()));
        System.out.println("The expected volume is 125.66");

        System.out.println("The surface area is: " + String.format("%.2f", can.getSurfaceArea()));
        System.out.println("The expected surface area is 150.80");
    }
}
