package chapter5.exercises;

/**
 * A program that can test whether the given year is a leap year.
 * @author LanXue
 * @date 2020-02-11 16:49
 */
public class LeapYear {

    int year;

    /**
     * Constructs a new program with the given year.
     * @param year the given year
     */
    public LeapYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        boolean result = false;
        if (year % 4 == 0) {
            result = true;
        }
        if (year % 100 == 0) {
            result = false;
        }
        if (year % 400 == 0) {
            result = true;
        }
        return result;
    }
}
