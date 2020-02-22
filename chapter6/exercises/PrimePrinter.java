package chapter6.exercises;

import java.util.Scanner;

/**
 * @author LanXue
 * @date 2020-02-22 17:29
 */
public class PrimePrinter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        PrimeGenerator generator = new PrimeGenerator(number);

        boolean done =false;

        int prime = generator.nextPrime();
        while (!done) {
            if (prime >= number) {
                done = true;
            } else {
                System.out.println(prime);
                prime = generator.nextPrime();
            }

        }
    }
}
