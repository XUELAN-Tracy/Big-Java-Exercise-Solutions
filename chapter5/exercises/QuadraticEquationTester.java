package chapter5.exercises;

/**
 * A class to test QuadraticEquation class.
 * @author LanXue
 */
public class QuadraticEquationTester {

    /**
     * Tests the methods of QuadraticEquation class.
     * @param args not used
     */
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(-1, 3, -2);
        System.out.println("x1 = " + equation.getSolution1());
        System.out.println("x2 = " + equation.getSolution2());

        QuadraticEquation equationWrong = new QuadraticEquation(1, -1, 2);
        System.out.println("\n");
        System.out.println("x1 = " + equationWrong.getSolution1());
        System.out.println("x2 = " + equationWrong.getSolution2());
    }
}
