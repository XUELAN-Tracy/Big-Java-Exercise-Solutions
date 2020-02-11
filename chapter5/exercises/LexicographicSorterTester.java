package chapter5.exercises;

import java.util.Scanner;

/**
 * A class test LexicographicSorter class.
 * @author LanXue
 * @date 2020-02-10 17:05
 */
public class LexicographicSorterTester {

    /**
     * Tests the methods of LexicographicSorter class.
     * @param args nor used
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter three strings: ");
        String s1 = in.next();
        String s2 = in.next();
        String s3 = in.next();

        LexicographicalSorter sorter = new LexicographicalSorter(s1, s2, s3);

        System.out.println(sorter.getSorted());
    }
}
