package chapter5.exercises;

import java.util.Scanner;

/**
 * A class to test UnitConverter.
 * @author LanXue
 * @date 2020-02-12 17:14
 */
public class UnitConverterTester {

    /**
     * Tests the methods of UnitConverter class.
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Covert from: ");
        String from = in.next();
        System.out.println("Convert to: ");
        String to  = in.next();
        System.out.println("Value: ");
        double value = in.nextDouble();

        UnitConverter fromConverter = new UnitConverter(from, value);
        UnitConverter toConverter = new UnitConverter(to, value);

        if (from.equals("m")) {
            System.out.println(value + " " + from + " = " + toConverter.fromMeters() + " " + to);
        } else if (to.equals("m")) {
            System.out.println(value + " " + from + " = " + fromConverter.toMeters() + " " + to);
        }
    }
}

