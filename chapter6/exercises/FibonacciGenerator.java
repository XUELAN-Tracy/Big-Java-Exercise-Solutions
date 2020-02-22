package chapter6.exercises;

/**
 * This program can generate a series of Fibonacci numbers.
 * @author LanXue
 * @date 2020-02-21 23:35
 */
public class FibonacciGenerator {

    int fold1;
    int fold2;
    int fnew;
    int n;


    public FibonacciGenerator() {
        fold1 = 1;
        fold2 = 1;
        n = 1;
    }

    public int nextNumber() {
        if (n <= 2) {
            fnew = 1;
        } else {
            fnew = fold1 + fold2;
            fold1 = fold2;
            fold2 = fnew;
        }
        n++;
        return fnew;
    }
}
