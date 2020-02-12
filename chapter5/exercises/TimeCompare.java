package chapter5.exercises;

import java.util.Scanner;

/**
 * A program that can prints the time that comes first.
 * @author LanXue
 * @date 2020-02-11 16:27
 */
public class TimeCompare {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first time(eg.0410): ");
        String time1 = in.next();
        System.out.print("Please enter the first time(eg.2315): ");
        String time2 = in.next();

        int hour1 = Integer.parseInt(time1.substring(0, 2));
        int minute1 = Integer.parseInt(time1.substring(2, 4));

        int hour2 = Integer.parseInt(time2.substring(0, 2));
        int minute2 = Integer.parseInt(time2.substring(2, 4));

        if (hour1 < hour2) {
            System.out.println("The first time comes first.");
        } else if (hour1 == hour2) {
            if (minute1 < minute2) {
                System.out.println("The first time comes first.");
            } else if (minute1 == minute2) {
                System.out.println("Two times are the same.");
            } else {
                System.out.println("The second time comes first.");
            }
        } else {
            System.out.println("The second time comes first.");
        }
    }
}
