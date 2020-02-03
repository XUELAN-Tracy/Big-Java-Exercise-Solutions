package chapter4.projects.triangles;

import java.util.Scanner;

/**
 * A class to test class Triangle.
 * @author LanXue
 */
public class TriangleTester {

    /**
     * Tests the methods of Triangle class.
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asks the user to give the coordinates of corner point A
        System.out.print("The x-coordinate of corner point A is: ");
        double aX = in.nextDouble();
        System.out.print("The y-coordinate of corner point A is: ");
        double aY = in.nextDouble();

        // Asks the user to give the coordinates of corner point B
        System.out.print("The x-coordinate of corner point B is: ");
        double bX = in.nextDouble();
        System.out.print("The y-coordinate of corner point B is: ");
        double bY = in.nextDouble();

        // Asks the user to give the coordinates of corner point C
        System.out.print("The x-coordinate of corner point C is: ");
        double cX = in.nextDouble();
        System.out.print("The y-coordinate of corner point C is: ");
        double cY = in.nextDouble();

        Coordinate a = new Coordinate(aX, aY);
        Coordinate b = new Coordinate(bX, bY);
        Coordinate c = new Coordinate(cX, cY);

        Triangle myTriangle = new Triangle(a, b, c);

        // Prints out the triangle
        System.out.println("\nHere is your triangle");
        System.out.print("Point A: " + "\t");
        System.out.println(a);
        System.out.print("Point B: " + "\t");
        System.out.println(b);
        System.out.print("Point C: " + "\t");
        System.out.println(c);
        System.out.println("---------------------------");

        // Prints out the side lengths, perimeter, area and 3 angles at all corners
        System.out.println("\nThe lengths of all sides");
        System.out.println("side AB: " + "\t" + String.format("%.2f", myTriangle.getSideAB()));
        System.out.println("side AC: " + "\t" + String.format("%.2f", myTriangle.getSideAC()));
        System.out.println("side BC: " + "\t" + String.format("%.2f", myTriangle.getSideBC()));
        System.out.println("---------------------------");

        System.out.println("Perimeter: " + "\t" + String.format("%.2f", myTriangle.getPerimeter()));
        System.out.println("Area: " + "\t" + String.format("%.2f", myTriangle.getArea()));
        System.out.println("---------------------------");

        System.out.println("The angles at all corners");
        System.out.println("Corner A: " + "\t" + String.format("%.2f", myTriangle.getAngleA()));
        System.out.println("Corner B: " + "\t" + String.format("%.2f", myTriangle.getAngleB()));
        System.out.println("Corner C: " + "\t" + String.format("%.2f", myTriangle.getAngleC()));
        System.out.println("---------------------------");

    }
}
