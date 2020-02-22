package chapter6.exercises;

/**
 * @author LanXue
 * @date 2020-02-22 21:20
 */
public class ExpApproximator {

    private double x;
    private double EPSILON = 1E-14;
    double result;


    public ExpApproximator(double x) {
        this.x = x;
        result = 0;
    }

    public double getValue() {
        double term = 1;
        int n = 1;
        while (term > EPSILON) {
            result += term;
            term = term * x / n;
            n ++;
        }
        return  result;
    }

    public static void main(String[] args) {
        ExpApproximator approx = new ExpApproximator(1);
        System.out.println(approx.getValue());
    }

}
