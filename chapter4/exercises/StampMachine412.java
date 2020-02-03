package chapter4.exercises;


/**
 * @author LanXue
 */
public class StampMachine412 {

    public static final int FIRST_CLASS_STAMP_PRICE = 44;
    public static final int PENNIES_PER_DOLLAR = 100;
    private int balance;

    public StampMachine412() {
        balance = 0;
    }

    /**
     * Records the received dollars.
     * @param amount the received money
     */
    public void insertDollars(int amount) {
        balance += amount;
    }

    /**
     * Computes the number of stamps which should be given.
     * @return the number of stamps
     */
    public int giveFirstClassStamps() {
        int firstClassStamps = (int) (balance * PENNIES_PER_DOLLAR / FIRST_CLASS_STAMP_PRICE);
        return firstClassStamps;
    }

    /**
     * Computes the number of penny stamps.
     * @return the number of penny stamps that should be given
     */
    public int givePennyStamps() {
        int pennyStamps = balance * PENNIES_PER_DOLLAR - giveFirstClassStamps() * FIRST_CLASS_STAMP_PRICE;
        return pennyStamps;
    }
}
