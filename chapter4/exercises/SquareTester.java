package chapter4.exercises;

/**
 * A class to test Square class.
 * @author LanXue
 */
public class SquareTester {

    /**
     * Tests the methods of Square class.
     * @param args not used
     */
    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println("The area is: " + square.getArea());
        System.out.println("The expected area is 100.");

        System.out.println("\n" + "The perimeter is: " + square.getPerimeter());
        System.out.println("The expected perimeter is 40.");

        System.out.println("\n" + "The diagonal is: " + square.getDiagonal());
        System.out.println("The expected diagonal is 14.14.");
    }
}
