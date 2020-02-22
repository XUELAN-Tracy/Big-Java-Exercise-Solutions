package chapter6.exercises;

/**
 * Computes information about a set of data values.
 * @author LanXue
 * @date 2020-02-15 20:21
 */
public class DataSetForRandom {

    private double sum;
    private double maximum;
    private int count;

    public DataSetForRandom() {
        sum = 0;
        maximum = 0;
        count = 0;
    }

    /**
     * Adds a data value to the data set.
     * @param x data value
     */
    public void add(double x) {
        sum += x;
        if (count == 0 || maximum < x) {
            maximum = x;
            count ++;
        } else {
            count ++;
        }
    }

    /**
     * Gets the average of the added data.
     * @return the average or 0 if no data has been added
     */
    public double getAverage() {
        if (count == 0) {
            return 0;
        } else {
            return  sum / count;
        }
    }

    /**
     * Gets the largest of the added data.
     * @return the maximum or 0 if no data has been added.
     */
    public double getMax() {
        return maximum;
    }

    public double getCount() {
        return count;
    }
}
