package chapter6.exercises;

import java.util.Scanner;

/**
 * @author LanXue
 * @date 2020-02-22 00:11
 */
public class FibonacciRunner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        FibonacciGenerator fg = new FibonacciGenerator();

        for (int i = 1; i <= n; i++) {
            System.out.println(fg.nextNumber());
        }
    }
}
