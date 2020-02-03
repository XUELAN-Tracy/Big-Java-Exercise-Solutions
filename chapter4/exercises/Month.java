package chapter4.exercises;

/**
 * A program taht can match numbers with months.
 * @author LanXue
 */
public class Month {

    private int index;
    private final String months = "January   " +
            "February  " +
            "March     " +
            "April     " +
            "May       " +
            "June      " +
            "July      " +
            "August    " +
            "September " +
            "October   " +
            "November  " +
            "December  ";

    /**
     * Constructs a new class with a given month number.
     * @param monthNumber the number of the month
     */
    public Month(int monthNumber) {
        index = (monthNumber - 1) * 10;
    }

    /**
     * Matches the month with the given number and returns it.
     * @return the month
     */
    public String getName() {
        String monthName = months.substring(index, index+10);
        return monthName;
    }
}
