package chapter6.exercises;

import java.util.Scanner;

/**
 * This program will multiply a given number for twelve times.
 * @author LanXue
 * @date 2020-02-21 23:26
 */
public class PowerGeneratorRunner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double factor = in.nextDouble();

        PowerGenerator generator = new PowerGenerator(factor);

        System.out.println(generator.number);
        for (int i = 1; i <= 11; i++) {
            System.out.println(generator.nextPower());
        }
    }
}
