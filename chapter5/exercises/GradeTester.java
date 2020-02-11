package chapter5.exercises;

import java.util.Scanner;

/**
 * A class to test Grade class.
 * @author LanXue
 * @date 2020-02-09 20:05
 */
public class GradeTester {

    /**
     * Tests the methods of Grade class.
     * @param args not used
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a letter grade: ");
        String gradeLetter = in.next();
        Grade grade = new Grade(gradeLetter);
        System.out.println(grade.getNumericGrade());
    }
}
