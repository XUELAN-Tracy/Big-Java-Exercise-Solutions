package chapter4.exercises;

/**
 * A program that can computes the number of hours and minutes between the two times.
 * @author LanXue
 */
public class TimeInterval {

    String firstTime;
    String secondTime;
    int firstHour;
    int secondHour;
    int firstMinutes;
    int secondMinutes;

    private final int HOURS_IN_DAY = 24;
    private final int MINUTES_IN_DAY = 60;

    /**
     * Constructs a program with given times.
     * @param first the first given time
     * @param second the second given time
     */
    public TimeInterval(String first, String second) {
        firstTime = first;
        secondTime = second;
        firstHour = Integer.parseInt(firstTime.substring(0,2));
        secondHour = Integer.parseInt(secondTime.substring(0,2));
        firstMinutes = Integer.parseInt(firstTime.substring(2,4));
        secondMinutes = Integer.parseInt(secondTime.substring(2,4));
    }

    /**
     * Computes the number of hours and returns it.
     * @return the number of hours
     */
    public int getHours() {

        int hours;
        if (secondHour < firstHour) {
            if (secondMinutes < firstMinutes) {
                hours = (HOURS_IN_DAY - firstHour + (secondHour - 1));
            } else {
                hours = (HOURS_IN_DAY - firstHour + secondHour);
            }
        } else {
            if (secondMinutes < firstMinutes) {
                hours = (secondHour - 1 - firstHour);
            } else {
                hours = secondHour - firstHour;
            }
        }
        return hours;
    }

    /**
     * Computes the number of minutes and returns it.
     * @return the number of minutes
     */
    public int getMinutes() {

        int minutes;
        if (secondMinutes < firstMinutes) {
            minutes = MINUTES_IN_DAY - firstMinutes + secondMinutes;
        } else {
            minutes = secondMinutes - firstMinutes;
        }
        return minutes;
    }
}
