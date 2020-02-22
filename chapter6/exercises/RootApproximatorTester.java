package chapter6.exercises;

import java.util.Scanner;

/**
 * @author LanXue
 * @date 2020-02-22 18:39
 */
public class RootApproximatorTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = in.nextDouble();
        RootApproximator approx = new RootApproximator(number,1E-14);

        while (approx.hasMoreGuesses()) {
            System.out.println(approx.nextGuess());
        }
    }
}
