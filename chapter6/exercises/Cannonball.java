package chapter6.exercises;

/**
 * This program can calculate the distance the cannonball has travelled.
 * @author LanXue
 * @date 2020-02-21 23:08
 */
public class Cannonball {

    public static void main(String[] args) {

        double deltaT = 0.01;
        double g = 9.81;
        double initialV = 100;
        double s = 0;

        double currentV = initialV;

        for (int i = 1; i <= 100; i++) {
            s = s + currentV * deltaT;
            currentV = currentV - g * deltaT;
        }

        double sFromFormula = -0.5 * g * 1 + initialV;

        System.out.printf("Distance calculated from the simulation is : %.3f\n",  s);
        System.out.printf("Distance calculated from the formula is: %10.3f\n", sFromFormula);

    }
}
