package chapter4.exercises;

/**
 * A program that can compute the volume and surface area of a soda can.
 * @author LanXue
 */
public class SodaCan {

    double height;
    double diameter;

    /**
     * Constructs a soda can with given height and diameter.
     * @param aHeight the given height
     * @param aDiameter the given diameter
     */
    public SodaCan(double aHeight, double aDiameter) {
        height = aHeight;
        diameter = aDiameter;
    }

    /**
     * Computes the volume of the soda can and returns it.
     * @return the volume
     */
    public double getVolume() {
        double baseArea = Math.PI * Math.pow(diameter,2);
        return baseArea * height;
    }

    public double getSurfaceArea() {
        double baseArea = Math.PI * Math.pow(diameter,2);
        double basePerimeter = 2 * Math.PI * diameter;
        double sideArea = basePerimeter * height;
        return 2 * baseArea + sideArea;
    }
}
