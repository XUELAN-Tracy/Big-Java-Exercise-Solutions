package chapter5.exercises;

/**
 * A program that can sort 3 floating-point number.
 * @author LanXue
 */
public class Sorted {

    double num1;
    double num2;
    double num3;

    public Sorted(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public String getSorted() {
        String s = null;
        if (num1 <= num2 && num2 <= num3) {
            s = "The inputs in sorted order are: "
                    + "\n" + num1
                    + "\n" + num2
                    + "\n" + num3;
        } else if (num1 <= num3 && num3 <= num2) {
            s = "The inputs in sorted order are: "
                    + "\n" + num1
                    + "\n" + num3
                    + "\n" + num2;
        } else if (num2 <= num1 && num1 <= num3) {
            s = "The inputs in sorted order are: "
                    + "\n" + num2
                    + "\n" + num1
                    + "\n" + num3;
        } else if (num2 <=num3 && num3 <= num1) {
            s = "The inputs in sorted order are: "
                    + "\n" + num2
                    + "\n" + num3
                    + "\n" + num1;
        } else if (num3 <= num1 && num1 <= num2) {
            s = "The inputs in sorted order are: "
                    + "\n" + num3
                    + "\n" + num1
                    + "\n" + num2;
        } else {
            s = "The inputs in sorted order are: "
                    + "\n" + num3
                    + "\n" + num2
                    + "\n" + num1;
        }
        return s;
    }
}
