package chapter4.exercises;

/**
 * A program that can break an integer into a sequence of numbers in reverse order.
 * @author LanXue
 */
public class DigitExtractor {

    int integer;
    String intString;

    /**
     * Constructs an integer with given number
     * @param anInteger the given number
     */
    public DigitExtractor(int anInteger) {
        integer = anInteger;
        intString = integer + "";
    }

    public int nextDigit() {
        int length = intString.length();
        int next = Integer.parseInt(intString.substring(length-1, length));
        intString = intString.substring(0, length-1);
        return next;
    }

}
