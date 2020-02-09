package chapter5.exercises;

/**
 * A program that can get solutions of the quadratic equation.
 * @author LanXue
 */
public class QuadraticEquation {

    double a;
    double b;
    double c;
    double x1;
    double x2;

    /**
     * Constructs an equation with given coefficients.
     * @param aA coefficient a
     * @param aB coefficient b
     * @param aC coefficient c
     */
    public QuadraticEquation(double aA, double aB, double aC) {
        a = aA;
        b = aB;
        c = aC;
    }

    /**
     * Checks whether the discriminant is negative or not.
     * @return the boolean value
     */
    public boolean hasSolutions() {
        boolean status = true;
        if ((Math.pow(b, 2) - 4 * a * c) < 0) {
            status = false;
        }
        return status;
    }

    public double getSolution1() {
        if (hasSolutions()) {
            if (a < 0) {
                x1 = (-b + Math.sqrt(b*b - 4 * a * c)) / (2 * a);
            } else {
                x1 = (-b - Math.sqrt(b*b - 4 * a * c)) / (2 * a);
            }
        } else {
            x1 = 0;
            System.out.println("There is no solution.");
        }
        return x1;
    }

    public double getSolution2() {
        if (hasSolutions()) {
            if (a < 0) {
                x2 = (-b - Math.sqrt(b*b - 4 * a * c)) / (2 * a);
            } else {
                x2 = (-b + Math.sqrt(b*b - 4 * a * c)) / (2 * a);
            }
        } else {
            x2 = 0;
            System.out.println("There is no solution.");
        }
        return x2;
    }
}
