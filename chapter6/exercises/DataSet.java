package chapter6.exercises;

/**
 * @author LanXue
 * @date 2020-02-22 16:29
 */
public class DataSet {

    int count;
    double sum;
    double sumSquares;
    double mean;

    public DataSet() {
        count = 0;
        sum = 0.0;
        sumSquares = 0.0;
        mean = 0.0;
    }

    public void addValue(double value) {
        count ++;
        sum += value;
        sumSquares += Math.pow(value, 2);
    }

    public  int getCount() {
        return count;
    }

    public double getMean() {
        mean = sum / count;
        return mean;
    }

    public double getStandardDeviation() {
        double standardDeviation = Math.sqrt((sumSquares - Math.pow(sum, 2) / count) / (count - 1));
        return standardDeviation;
    }
}
