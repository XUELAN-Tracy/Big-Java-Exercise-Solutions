package chapter5.exercises;

import java.util.Scanner;

/**
 * A class to test Month class.
 * @author LanXue
 * @date 2020-02-11 17:23
 */
public class MonthTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a month (1-12): ");
        int month = in.nextInt();

        Month monthDays = new Month(month);
        System.out.println(monthDays.getDays() + " days");
    }
}
