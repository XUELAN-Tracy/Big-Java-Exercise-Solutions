package chapter5.exercises;

/**
 * A tax calculator to compute the U.S income tax of 1913.
 * @author LanXue
 * @date 2020-02-10 17:20
 */
public class TaxCalculator {

    private double income = 0;

    private final static double RATE_BLOW_LIMIT1 = 0.01;
    private final static double RATE_BLOW_LIMIT2 = 0.02;
    private final static double RATE_BLOW_LIMIT3 = 0.03;
    private final static double RATE_BLOW_LIMIT4 = 0.04;
    private final static double RATE_BLOW_LIMIT5  = 0.05;
    private final static double RATE_OVER_LIMIT5  = 0.06;

    private final static double INCOME_LIMIT1 = 50000;
    private final static double INCOME_LIMIT2 = 75000;
    private final static double INCOME_LIMIT3 = 100000;
    private final static double INCOME_LIMIT4 = 250000;
    private final static double INCOME_LIMIT5 = 500000;

    /**
     * Constructs a calculator with given income.
     * @param income the given income
     */
    public TaxCalculator(double income) {
        this.income = income;
    }

    /**
     * Computes the tax based on the income and returns it.
     * @return the tax needed to pay
     */
    public double getTax() {
        double tax;

        if (income <= INCOME_LIMIT1) {
            tax = income * RATE_BLOW_LIMIT1;
        } else if (income < INCOME_LIMIT2) {
            tax = INCOME_LIMIT1 * RATE_BLOW_LIMIT1 +
                    (income - INCOME_LIMIT1) * RATE_BLOW_LIMIT2;
        } else if (income < INCOME_LIMIT3) {
            tax = INCOME_LIMIT1 * RATE_BLOW_LIMIT1
                    + (INCOME_LIMIT2 - INCOME_LIMIT1) * RATE_BLOW_LIMIT2
                    + (income - INCOME_LIMIT2) * RATE_BLOW_LIMIT3;
        } else if (income < INCOME_LIMIT4) {
            tax = INCOME_LIMIT1 * RATE_BLOW_LIMIT1
                    + (INCOME_LIMIT2 - INCOME_LIMIT1) * RATE_BLOW_LIMIT2
                    + (INCOME_LIMIT3 - INCOME_LIMIT2) * RATE_BLOW_LIMIT3
                    + (income - INCOME_LIMIT3) * RATE_BLOW_LIMIT4;
        } else if (income < INCOME_LIMIT5) {
            tax = INCOME_LIMIT1 * RATE_BLOW_LIMIT1
                    + (INCOME_LIMIT2 - INCOME_LIMIT1) * RATE_BLOW_LIMIT2
                    + (INCOME_LIMIT3 - INCOME_LIMIT2) * RATE_BLOW_LIMIT3
                    + (INCOME_LIMIT4 - INCOME_LIMIT3) * RATE_BLOW_LIMIT4
                    + (income - INCOME_LIMIT4) * RATE_BLOW_LIMIT5;
        } else {
            tax = INCOME_LIMIT1 * RATE_BLOW_LIMIT1
                    + (INCOME_LIMIT2 - INCOME_LIMIT1) * RATE_BLOW_LIMIT2
                    + (INCOME_LIMIT3 - INCOME_LIMIT2) * RATE_BLOW_LIMIT3
                    + (INCOME_LIMIT4 - INCOME_LIMIT3) * RATE_BLOW_LIMIT4
                    + (INCOME_LIMIT5 - INCOME_LIMIT4) * RATE_BLOW_LIMIT5
                    + (income - INCOME_LIMIT5) * RATE_OVER_LIMIT5;
        }
        return tax;
    }
}
