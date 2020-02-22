package chapter6.codestudy;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

/**
 * @author LanXue
 * @date 2020-02-19 23:13
 */
public class Guess {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        int answer = generator.nextInt(10) + 1;
        int count = 0;
        boolean done = false;
        while (!done && count < 3) {
            System.out.print("Please guess a number between 1 and 10: ");
            int guess = in.nextInt();
            count ++;
            if (guess == answer) {
                done = true;
            }
        }
        if (done) {
            System.out.println("Congratulations! You get the right number!");
        } else {
            System.out.println("Sorry, you didn't get the right answer.");
        }

    }
}
