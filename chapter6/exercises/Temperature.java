package chapter6.exercises;

import java.util.Scanner;

/**
 * This program can read twelve temperatures values and gets the month with the highest value.
 * @author LanXue
 * @date 2020-02-21 19:06
 */
public class Temperature {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double highestTemp = in.nextDouble();
        int highestMonth = 1;

        for (int currentMonth = 2; currentMonth <= 12; currentMonth++) {
            System.out.print("Enter the temperature: ");
            double currentTemp = in.nextDouble();
            if (currentTemp > highestTemp) {
                highestTemp = currentTemp;
                highestMonth = currentMonth;
            }
        }
        System.out.println("The highest temperature is " + highestTemp + " and the month is " + highestMonth);
    }
}
