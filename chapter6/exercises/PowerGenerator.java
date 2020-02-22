package chapter6.exercises;

/**
 * This program can print the powers of a given number.
 * @author LanXue
 * @date 2020-02-21 23:21
 */
public class PowerGenerator {

    double factor;
    double number;

    /**
     * Constructed a power generator.
     * @param aFactor the number that will be multiplied by itself
     */
    public PowerGenerator(double aFactor) {
        factor = aFactor;
        number = 1;
    }

    public double nextPower() {
        number = number * factor;
        return number;
    }

}
