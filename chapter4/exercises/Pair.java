package chapter4.exercises;

/**
 * A program that can prompts the users for two numbers and do some calculations.
 * @author LanXue
 */
public class Pair {

    private double firstValue;
    private double secondValue;

    /**
     * Constructs a pair.
     * @param aFirst the first value of the pair
     * @param aSecond the second value of the pair
     */
    public Pair(double aFirst, double aSecond) {
        firstValue = aFirst;
        secondValue = aSecond;
    }

    /**
     * Computes the sum of the values of this pair.
     * @return the sum of the pair
     */
    public double getSum() {
        double sum = firstValue + secondValue;
        return sum;
    }

    /**
     * Computes the difference of the values of this pair.
     * @return the difference of the pair
     */
    public double getDifference() {
        double difference = Math.abs(firstValue - secondValue);
        return difference;
    }

    /**
     * Computes the production of the values of this pair.
     * @return the production of the pair
     */
    public double getProduction() {
        double production = firstValue * secondValue;
        return production;
    }

    /**
     * Computes the average of the values of this pair.
     * @return the average of the pair
     */
    public double getAverage() {
        double average = (firstValue + secondValue) / 2;
        return  average;
    }

    /**
     * Computes the distance of the values of this pair.
     * @return the distance of the pair
     */
    public double getDistance() {
        double distance = Math.abs(firstValue - secondValue);
        return distance;
    }

    /**
     * Compares these two values and returns the bigger one.
     * @return the bigger of the two
     */
    public double getMax() {
        double max;
        if (firstValue >= secondValue) {
            max = firstValue;
        } else {
            max = secondValue;
        }
        return max;
    }

    /**
     * Compares these two values and returns the smaller one.
     * @return the smaller of the two
     */
    public double getMin() {
        double min;
        if (firstValue <= secondValue) {
            min = firstValue;
        } else {
            min = secondValue;
        }
        return min;
    }
}
