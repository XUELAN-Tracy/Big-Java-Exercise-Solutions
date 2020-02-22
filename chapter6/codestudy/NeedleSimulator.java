package chapter6.codestudy;

/**
 * This program simulates the Buffon needle experiment and prints the resulting approximations of pi.
 * @author LanXue
 * @date 2020-02-16 16:58
 */
public class NeedleSimulator {

    public static void main(String[] args) {

        Needle n = new Needle();
        final int TRIES1 = 1000;
        final int TRIES2 = 1000000;

        for (int i = 1; i <= TRIES1; i++) {
            n.drop();
        }
        System.out.printf("Tries = %d, Tries/Hits = %.5f\n", TRIES1, (double) n.getTries() / n.getHits());

        for (int i = 1; i <= TRIES2; i++) {
            n.drop();
        }
        System.out.printf("Tries = %d, Tries/Hits = %.5f\n", TRIES2, (double) n.getTries() / n.getHits());
    }
}
