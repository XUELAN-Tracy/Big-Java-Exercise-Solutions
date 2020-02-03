package chapter4.exercises;

/** A program to computes the largest and smallest values in a sequence of numbers.
 * @author LanXue
 */
public class DataSet46 {

    private int smallest;
    private int largest;

    /**
     * Constructs a program with the default smallest and largest value.
     */
    public DataSet46() {
        smallest = 0;
        largest = 0;
    }

    /**
     * Records the smaller and larger value of every input.
     * @param x the input value
     */
    public void addValue(int x) {
        if (smallest == 0) {
            smallest  = x;
        } else {
            smallest = Math.min(smallest, x);
        }

        if (largest == 0) {
            largest = x;
        } else {
            largest = Math.max(largest, x);
        }
    }

    /**
     * Returns the largest value.
     * @return the largest value.
     */
    public int getLargest() {
        return largest;
    }

    /**
     * Returns the smallest value.
     * @return the smallest value.
     */
    public int getSmallest() {
        return smallest;
    }
}
