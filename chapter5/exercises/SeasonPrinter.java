package chapter5.exercises;

import java.util.Scanner;

/**
 * A program that can print the relative season based on the given date.
 * @author LanXue
 * @date 2020-02-11 16:36
 */
public class SeasonPrinter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the month: ");
        int month = in.nextInt();
        System.out.print("Please enter the day: ");
        int day = in.nextInt();

        String season = "";
        if (month == 1 || month == 2 || month == 3) {
            season = "Winter";
        } else if (month == 4 || month == 5 || month == 6) {
            season = "Spring";
        } else if (month == 7 || month == 8 || month == 9) {
            season = "Summer";
        } else if (month == 10 || month == 11 || month == 12) {
            season = "Fall";
        }

        if (month % 3 == 0 && day >= 21) {
            if (season.equals("Winter")) {
                season = "Spring";
            } else if (season.equals("Spring")) {
                season = "Summer";
            } else if (season.equals("Summer")) {
                season = "Fall";
            } else {
                season = "Winter";
            }
        }

        System.out.println("This is " + season + ".");
    }
}
