package chapter5.exercises;

import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

/**
 * A class to test Horoscope class.
 * @author LanXue
 * @date 2020-02-10 18:13
 */
public class HoroscopeTester {

    /**
     * Tests the methods of Horoscope class.
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your birthday (month and day): ");
        String input = in.nextLine();

        int month = 0;
        int day = 0;
        if (input.length() == 3) {
            month = Integer.parseInt(input.substring(0, 1));
            day = Integer.parseInt(input.substring(2, 3));
        } else if (input.length() == 4 && input.substring(1, 2).equals(" ")) {
            month = Integer.parseInt(input.substring(0, 1));
            day = Integer.parseInt(input.substring(2, 4));
        } else if (input.length() == 4 && input.substring(2, 3).equals(" ")) {
            month = Integer.parseInt(input.substring(0, 2));
            day = Integer.parseInt(input.substring(3, 4));
        } else if (input.length() == 5) {
            month = Integer.parseInt(input.substring(0, 2));
            day = Integer.parseInt(input.substring(3, 5));
        }

        Horoscope horoscope = new Horoscope(month, day);
        String zodiac = horoscope.getZodiac();

        System.out.println(horoscope.getSign(zodiac));
    }
}
