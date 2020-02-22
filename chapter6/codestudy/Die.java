package chapter6.codestudy;

import java.util.Random;

/**
 * This class models a die that, when cast, lands on a random face.
 * @author LanXue
 * @date 2020-02-16 16:43
 */
public class Die {

    private Random generator;
    private int sides;

    /**
     * Constructs a die with a given number of sides.
     * @param s the number f sides, e.g., 6 fo a normal die
     */
    public Die(int s) {
        sides = s;
        generator = new Random();
    }

    /**
     * Simulates a throw of the die
     * @return the face of the die
     */
    public int cast() {
        return 1 + generator.nextInt(sides);
    }
}
