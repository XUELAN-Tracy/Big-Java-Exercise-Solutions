package chapter5.exercises;

/**
 * A program that translates a letter grade into a number grade.
 * @author LanXue
 * @date 2020-02-09 19:47
 */
public class Grade {

    String gradeLetter;

    /**
     * Constructs a program with given letter grade.
     * @param aGrade the letter grade
     */
    public Grade(String aGrade) {
        gradeLetter = aGrade;
    }

    public String getNumericGrade() {
        String result = "Numeric value: ";
        if (gradeLetter.equals("A+")) {
            result += "4.0.";
        } else if (gradeLetter.equals("A")) {
            result += "4.0.";
        } else if (gradeLetter.equals("A-")) {
            result += "3.7.";
        } else if (gradeLetter.equals("B+")) {
            result += "3.3.";
        } else if (gradeLetter.equals("B")) {
            result += "3.0.";
        } else if (gradeLetter.equals("B-")) {
            result += "2.7.";
        } else if (gradeLetter.equals("C+")) {
            result += "2.3.";
        } else if (gradeLetter.equals("C")) {
            result += "2.0.";
        } else if (gradeLetter.equals("C-")) {
            result += "1.7.";
        } else if (gradeLetter.equals("D+")) {
            result += "1.3.";
        } else if (gradeLetter.equals("D")) {
            result += "1.0.";
        } else if (gradeLetter.equals("D-")) {
            result += "0.7.";
        } else if (gradeLetter.equals("F")) {
            result += "0.0.";
        } else {
            result = "Wrong input.";
        }
        return result;
    }
}
