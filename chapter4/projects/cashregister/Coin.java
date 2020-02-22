package chapter4.projects.cashregister;

/**
 * A class that can record the type of coins.
 * @author LanXue
 */
public class Coin {

    // American coins
    private static final double DOLLAR = 1;
    private static final double QUARTER_VALUE = 0.25;
    private static final double DIME_VALUE = 0.1;
    private static final double NICKEL_VALUE = 0.05;
    private static final double PENNY_VALUE = 0.01;

    // European coins
    private static final double EURO = 1;
    private static final double ONE_CENT = 0.01;
    private static final double TWO_CENT = 0.02;
    private static final double FIVE_CENT = 0.05;
    private static final double TEN_CENT = 0.1;
    private static final double TWENTY_CENT = 0.2;
    private static final double FIFTY_CENT = 0.5;

    private String coinName;

    public Coin(String name) {
        coinName = name;
    }

    public double getValue() {
        double value = 0;
        if (coinName.equals("DOLLAR")) {
            value = DOLLAR;
        } else if (coinName.equals("QUARTER")) {
            value = QUARTER_VALUE;
        } else if (coinName.equals("DIME")) {
            value = DIME_VALUE;
        } else if (coinName.equals("NICKEL")) {
            value = NICKEL_VALUE;
        } else if (coinName.equals("PENNY")) {
            value = PENNY_VALUE;
        } else if (coinName.equals("EURO")) {
            value = EURO;
        } else if (coinName.equals("ONE_CENT")) {
            value = ONE_CENT;
        } else if (coinName.equals("TWO_CENT")) {
            value = TWO_CENT;
        } else if (coinName.equals("FIVE_CENT")) {
            value = FIVE_CENT;
        } else if (coinName.equals("TEN_CENT")) {
            value = TEN_CENT;
        } else if (coinName.equals("TWENTY_CENT")) {
            value =TWENTY_CENT;
        } else if (coinName.equals("FIFTY_CENT")) {
            value = FIFTY_CENT;
        }
        return value;
    }
}
