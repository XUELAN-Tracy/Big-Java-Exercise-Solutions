package chapter6.exercises;

/**
 * This program can guess the square root of a given number.
 * @author LanXue
 * @date 2020-02-22 17:58
 */
public class RootApproximator {

    double EPSILON;
    double a;
    double preGuess;
    double currentGuess;

    public RootApproximator(double a, double EPSILON) {
        this.a = a;
        this.EPSILON = EPSILON;
        preGuess = 1;
        currentGuess = a;
    }

    public double nextGuess() {
        preGuess = currentGuess;
        currentGuess = (preGuess + a / preGuess) / 2;
        return currentGuess;
    }

    public boolean hasMoreGuesses() {
        boolean result = true;
        if (Math.abs(currentGuess - preGuess) <= EPSILON) {
            result = false;
        }
        return result;
    }
}
