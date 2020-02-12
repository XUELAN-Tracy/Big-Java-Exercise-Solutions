package chapter5.exercises;

/**
 * A program that can give the total days of a given month.
 * @author LanXue
 * @date 2020-02-11 17:02
 */
public class Month {

    int month;

    /**
     * Constructs a program with a given month.
     * @param month the given month
     */
    public Month(int month) {
        this.month = month;
    }

    public int getDays() {
        int days = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 2) {
            days = 28;
        } else {
            days = 30;
        }
        return days;
    }
}
