package chapter5.exercises;

import java.util.Scanner;

/**
 * A class to test LeapYear class.
 * @author LanXue
 * @date 2020-02-11 16:55
 */
public class LeapYearTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = in.nextInt();

        LeapYear leap = new LeapYear(year);
        if (leap.isLeapYear()) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
