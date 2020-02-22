package chapter6.exercises;

/**
 * This program can throw darts for a thousand times and get the approximate value of PI.
 * @author LanXue
 * @date 2020-02-23 00:04
 */
public class DartSimulator {

    public static void main(String[] args) {

        int tryCount = 1000000;
        Dart dart = new Dart();


        for (int i = 1; i <= tryCount; i++) {
            dart.throwDart();
        }

        System.out.println("The hit count out of 1000000 is " +  dart.getHitCount());
        System.out.println("The approximate value of PI is: " + dart.getPi());
    }
}

// Why this is a better method for estimating PI than the Buffon needle program?

// In the Buffon needle program, every time we drop the needle, we calculate the yhigt as follows:
// yhigh = ylow + Math.sin(Math.toRadians(angle));
// However, the method Math.toRadians(angle) returns angle/180.0 * PI, which leads to a problem:
// we use the PI to estimate PI even though we should not have known it.
