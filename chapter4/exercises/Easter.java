package chapter4.exercises;

/**
 * A program to compute the Easter Sunday in a given year.
 * @author LanXue
 */
public class Easter {

    private int year;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int g;
    private int h;
    private int j;
    private int k;
    private int m;
    private int r;
    private int n;

    /**
     * Constructs a new program with given year.
     * @param year the given year
     */
    public Easter(int year) {
        this.year = year;
    }

    /**
     * Computes the month number and returns it.
     * @return the month number
     */
    public int getEasterSundayMonth() {
        a = year % 19;
        b = year / 100;
        c = year % 100;
        d = b / 4;
        e = b % 4;
        g = (8 * b + 13) /  25;
        h = (19 * a + b - d - g + 15) % 30;
        j = c / 4;
        k = c % 4;
        m = (a + 11 * h) / 319;
        r = (2 * e + 2 * j - k - h  + m + 32) % 7;
        n = (h - m + r + 90) / 25;
        return n;
    }

    /**
     * Computes the date and returns it.
     * @return the date
     */
    public int getEasterSundayDay() {
        int p = (h - m + r + n + 19) % 32;
        return p;
    }

}
