package chapter4.exercises;

/**
 * A class to test Ballon class
 * @author LanXue
 */
public class BalloonTester {

    /**
     * Tests the methods of Balloon class.
     * @param args not used
     */
    public static void main(String[] args) {

        Balloon balloon = new Balloon();

        balloon.addAir(100);
        System.out.println("The current volume is: " + balloon.getVolume());
        System.out.println("Expected: 100" );
        System.out.println("The current radius is: " + String.format("%.2f", balloon.getRadius()));
        System.out.println("Expected: 2.88");
        System.out.println("The current surface area is: " + String.format("%.2f", balloon.getSurfaceArea()));
        System.out.println("Expected: 104.18");

        balloon.addAir(100);
        System.out.println("\n" + "The current volume is: " + balloon.getVolume());
        System.out.println("Expected: 200" );
        System.out.println("The current radius is: " + String.format("%.2f", balloon.getRadius()));
        System.out.println("Expected: 3.63");
        System.out.println("The current surface area is: " + String.format("%.2f", balloon.getSurfaceArea()));
        System.out.println("Expected: 165.39");
    }
}
