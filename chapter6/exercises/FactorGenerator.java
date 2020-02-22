package chapter6.exercises;

/**
 * This program can print out all factors in increasing oder of a given integer.
 * @author LanXue
 * @date 2020-02-22 16:55
 */
public class FactorGenerator {

    int factor;
    int number;

    public FactorGenerator(int numberToFactor) {
        factor = 2;
        number = numberToFactor;
    }

    /**
     * Gets the next factor of the current number.
     * @return the next factor
     */
    public int nextFactor() {
        if (number % factor == 0) {
            number = number / factor;
        } else {
            while (number % factor != 0) {
                factor ++;
            }
            number = number / factor;
        }
        return factor;
    }

    /**
     * Test whether the curent number has more factors.
     * @return true if there are factors, false if there is no more factor
     */
    public boolean hasMoreFactors() {
        return number > 1;
    }

}
