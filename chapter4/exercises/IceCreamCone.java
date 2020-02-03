package chapter4.exercises;

/**
 * An ice cream cone whose surface can be calculated.
 * @author LanXue
 */
public class IceCreamCone {

    private double height;
    private double radius;

    public IceCreamCone() {
        height = 4;
        radius = 3;
    }

    /**
     * Computes the surface area of the cone.
     * @return the surface area of the cone
     */
    public double getSurfaceArea() {
        double slant = Math.sqrt(height * height + radius * radius);
        double surfaceArea = Math.PI * radius * slant;
        return surfaceArea;
    }

    /**
     * Computes the volume of the cone.
     * @return the volume of the cone
     */
    public double getVolume() {
        double volume = (Math.PI * radius * radius * height) / 3;
        return volume;
    }

    public static void main(String[] args) {
        IceCreamCone cone = new IceCreamCone();
        System.out.println("The surface of the ice cream cone is: " + cone.getSurfaceArea());
        System.out.println("The expected surface is 47.12");
        System.out.println("The volume of the ice cream cone is: " + cone.getVolume());
        System.out.println("The expected volume is 37.69");
    }
}
