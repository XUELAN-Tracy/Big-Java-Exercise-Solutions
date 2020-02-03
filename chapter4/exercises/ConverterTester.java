package chapter4.exercises;

/**
 * A class to test Converter class.
 * @author LanXue
 */
public class ConverterTester {

    /**
     * Tests the methods of Converter class.
     * @param args not used
     */
    public static void main(String[] args) {

        final double MILE_TO_KM = 1.609;
        Converter milesToMeters = new Converter(100 * MILE_TO_KM);

        System.out.println("10 miles = " +  milesToMeters.convertTo(10) + " meters.");
        System.out.println("1609 meters = " + milesToMeters.convertFrom(1609) + " miles.");

    }
}
