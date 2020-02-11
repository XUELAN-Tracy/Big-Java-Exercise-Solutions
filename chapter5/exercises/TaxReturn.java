package chapter5.exercises;

/**
 * A tax return of a taxpayer.
 * @author LanXue
 */
public class TaxReturn {

    public static final int SINGLE = 1;
    public static final int MARRIED = 2;

    private static final double RATE1 = 0.10;
    private static final double RATE2 = 0.25;
    private static final double RATE_SINGLE_LIMIT = 32000;
    private static final double RATE_MARRIED_LIMIT = 64000;

    private double income;
    private int status;

    /**
     * Constructs a TaxReturn object for a given income and marital status.
     * @param income the taxpayer income
     * @param status either SINGLE or MARRIED
     */
    public TaxReturn(double income, int status) {
        this.income = income;
        this.status = status;
    }

    /**
     * Computes and returns the tax needed to pay
     * @return the tax
     */
    public double getTax() {
        double tax = 0.0;
        double rate1Limit;

        if (status == SINGLE) {
            rate1Limit = RATE_SINGLE_LIMIT;
        } else {
            rate1Limit = RATE_MARRIED_LIMIT;
        }

        if (income <= rate1Limit) {
            tax = income * RATE1;
        } else {
            tax = rate1Limit * RATE1 + (income - rate1Limit) * RATE2;
        }
        return tax;
    }
}
