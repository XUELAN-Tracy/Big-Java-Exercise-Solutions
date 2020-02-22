package chapter6.exercises;

import java.util.Scanner;

/**
 * This program can check whether the credit card number is valid.
 * @author LanXue
 * @date 2020-02-21 19:25
 */
public class DigitCheck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please give me your credit card number (8 digits): ");
        String numbers = in.nextLine();

        int sum1 = 0;
        int sum2 = 0;
        int checkDigit = Integer.parseInt(numbers.substring(7));

        // Starts from the rightmost digits and plus every other digit.
        for (int i = 7; i > 0; i -= 2) {
            sum1 += Character.getNumericValue(numbers.charAt(i));
        }

        // Computes sum for digits not included in previous step.
        String s = "";
        for (int j = 6; j >= 0; j -=2) {
            int digit = Character.getNumericValue(numbers.charAt(j)) * 2;
            s += digit;
        }
        for (int k = 0; k < s.length(); k++) {
            int digit = Integer.parseInt(s.substring(k, k+1));
            sum2 += digit;
        }

        // Adds two sums of preceding steps
        int sum = sum1 + sum2;
        int remainder = sum % 10;
        if (remainder ==0) {
            System.out.println("The card is valid!");
        } else {
            if (checkDigit - remainder < 0) {
                checkDigit = checkDigit + (10 - remainder);
            } else {
                checkDigit = checkDigit - remainder;
            }
            System.out.println("Card is not valid. The check digit " + checkDigit + " can make it valid.");
        }

    }
}
