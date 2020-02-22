package chapter6.exercises;

import java.util.Random;

/**
 * This program can generate 100 random numbers between 0 and 1000
 * and print out the average and the maximum.
 * @author LanXue
 * @date 2020-02-22 21:53
 */
public class RandomDataAnalyzer {

    public static void main(String[] args) {

        Random generator = new Random();
        DataSetForRandom data = new DataSetForRandom();

        for (int i = 1; i <= 100; i++) {
            data.add(generator.nextInt(1001));
        }

        System.out.println("Count: " + data.getCount());
        System.out.printf("Average: %.2f\n", data.getAverage());
        System.out.println("Maximum: " + data.getMax());

    }
}
