package chapter6.exercises;

import java.util.Scanner;

/**
 * @author LanXue
 * @date 2020-02-22 17:05
 */
public class FactorPrinter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = in.nextInt();
        FactorGenerator generator = new FactorGenerator(number);

        while (generator.hasMoreFactors()) {
            System.out.println(generator.nextFactor());
        }

    }
}
