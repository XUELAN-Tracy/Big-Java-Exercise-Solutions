package chapter6.codestudy;

/**
 * This program simulates casting a die ten times.
 * @author LanXue
 * @date 2020-02-16 16:46
 */
public class DieSimulator {

    public static void main(String[] args) {
        Die die = new Die(6);
        final int TRIES = 10;
        for (int i = 1; i <= TRIES; i++) {
            int n = die.cast();
            System.out.print(n + " ");
        }
    }
}
