package chapter4.exercises;

import javax.xml.crypto.Data;

/**
 * A program that can computes the sum and the average of a sequence of integers.
 * @author LanXue
 */
public class DataSet {

    private int sum;
    private int count;

    /**
     * Constructs the program with default sum and count.
     */
    public DataSet() {
        sum = 0;
        count = 0;
    }

    /**
     * Adds the value to the sum.
     * @param x the value
     */
    public void addValue(int x) {
        sum += x;
        count += 1;
    }

    /**
     * Gets the sum
     * @return the sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * Computes the average and returns it.
     * @return the average
     */
    public double getAverage() {
        double average = (double) sum / count;
        return  average;
    }

}
