package chapter6.exercises;

import java.util.Scanner;

/**
 * @author LanXue
 * @date 2020-02-22 20:20
 */
public class RootApproximator_Newton {

    int n;
    double a;
    double xOld;
    double xNew;

    public RootApproximator_Newton(double a, int n) {
        this.n = n;
        this.a = a;
        xOld = 1;
        xNew = a;
    }

    /**
     * Guesses the next root.
     * @return the next guess root.
     */
    public double getNextGuess() {
        xOld = xNew;
        xNew = xOld * (1 - 1/n) + a / (n * Math.pow(xOld, n - 1));
        return xNew;
    }

    public boolean hasMoreGuesses() {
        double EPSILON = 1E-14;
        return (Math.abs(xNew - xOld) > EPSILON);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = in.nextDouble();
        System.out.print("Which root of the number: ");
        int n = in.nextInt();

        RootApproximator_Newton approx = new RootApproximator_Newton(a, n);

        while (approx.hasMoreGuesses()) {
            System.out.println(approx.getNextGuess());
        }
    }
}
