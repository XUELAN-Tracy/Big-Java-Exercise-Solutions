package chapter6.exercises;

/**
 * This program can generate the all prime numbers before a given integer.
 * @author LanXue
 * @date 2020-02-22 17:10
 */
public class PrimeGenerator {

    int number;
    int currentNumber;

    public PrimeGenerator(int number) {
        this.number = number;
        currentNumber = 1;
    }

    /**
     * Tests whether a number is prime or not.
     * @param value the number
     * @return true if it's prime, false if it's not
     */
    public boolean isPrime(int value) {
        boolean done = true;
        if (value == 1) {
            done = false;
        } else if (value == 2) {
            done = true;
        } else {
            for (int i = 2; i < value; i++) {
                if (value % i == 0 ) {
                    done = false;
                }
            }
        }
        return done;
    }

    /**
     * Gets the next prime number.
     * @return the next prime number
     */
    public int nextPrime() {
        int prime = 0;
        while (!isPrime(currentNumber)) {
            currentNumber ++;
        }
        prime = currentNumber;
        currentNumber ++;
        return prime;
    }

}
