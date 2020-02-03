package chapter4.exercises;

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

    public double getSolution1() {
        try {
            x1 = (-b + Math.sqrt(b*b - 4 * a * c)) / (2 * a);
        } catch (Exception e){
            System.out.println(e);
        }
        return x1;
    }

    public double getSolution2() {
        try {
            x2 = (-b + Math.sqrt(b*b - 4 * a * c)) / (2 * a);
        } catch (Exception e){
            System.out.println(e);
        }
        return x2;
    }
}
