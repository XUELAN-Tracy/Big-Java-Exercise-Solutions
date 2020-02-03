package chapter4.exercises;

/**
 * A program that can computes the volume, surface area and radius of the balloon.
 * @author LanXue
 */
public class Balloon {

    double airAmount;

    /**
     * Constructs a balloon with no air in it.
     */
    public Balloon() {
        airAmount = 0.0;
    }

    /**
     * Adds the given amount of air into the balloon.
     * @param amount the amount of air
     */
    public void addAir(double amount) {
        airAmount += amount;
    }

    /**
     * Computes the volume and returns it.
     * @return the volume
     */
    public double getVolume() {
        return airAmount;
    }

    /**
     * Computes the surface area and returns it.
     * @return the current surface area
     */
    public double getSurfaceArea() {
        double surfaceArea = 4 * Math.PI * (Math.pow(getRadius(), 2));
        return surfaceArea;

    }

    public double getRadius() {
        double volume = airAmount;
        double radius = Math.pow(((volume / Math.PI) * (3.0 / 4.0)), (1.0 / 3.0));
        return radius;
    }


}
