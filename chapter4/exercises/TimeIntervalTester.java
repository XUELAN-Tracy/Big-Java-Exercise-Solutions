package chapter4.exercises;

import java.util.Scanner;

/**
 * A class to test TimeInterval class.
 * @author LanXue
 */
public class TimeIntervalTester {

    /**
     * Tests the methods of TimeInterval class.
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Please enter the first time: ");
        String firstTime = in.nextLine();
        System.out.println(firstTime);


        System.out.print("Please enter the second time: ");
        String secondTime = in.nextLine();
        System.out.println(secondTime);

        TimeInterval myInterval = new TimeInterval(firstTime,secondTime);
        System.out.println(myInterval.getHours() + " hours " + myInterval.getMinutes() + " minutes");

    }

}
