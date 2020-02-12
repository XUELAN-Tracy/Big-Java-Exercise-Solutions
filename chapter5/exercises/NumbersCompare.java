package chapter5.exercises;

/**
 * A program that can compare two floating-point numbers.
 * @author LanXue
 * @date 2020-02-11 17:29
 */
public class NumbersCompare {

    double num1;
    double num2;

    /**
     * Constructs a new program with the given numbers.
     * @param num1 the first number
     * @param num2 the second number
     */
    public NumbersCompare(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public boolean isSame() {
        num1 = Math.round(num1 * 100) / 100;
        num2 = Math.round(num2 * 100) / 100;
        if (Math.abs(num1 - num2) < 0.01) {
            return true;
        } else {
            return false;
        }
    }

    public String getResult() {
        String result = "";
        if (isSame()) {
            result = "They are the same when rounded to two decimal places." +
                    "\nThey differ by less than 0.01.";
        } else {
            result = "They are the different when rounded to two decimal places." +
                    "\nThey differ by equal or more than 0.01.";
        }
        return result;
    }
}
