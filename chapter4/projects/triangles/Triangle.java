package chapter4.projects.triangles;

/**
 * A program that can calculate the triangle properties with 3 corners in certain coordinates.
 * @author LanXue
 */
public class Triangle {

    private Coordinate a;
    private Coordinate b;
    private Coordinate c;
    private double sideAB;
    private double sideBC;
    private double sideAC;
    private double perimeter;

    public Triangle(Coordinate a, Coordinate b, Coordinate c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Computes the distance between point A and point B.
     * @return the distance
     */
    public double getSideAB() {
        double aX = a.getX();
        double aY = a.getY();
        double bX = b.getX();
        double bY = b.getY();
        sideAB = Math.sqrt(Math.pow(aX - bX, 2) + Math.pow(aY - bY, 2));
        return sideAB;
    }

    /**
     * Computes the distance between point B and point C.
     * @return the distance
     */
    public double getSideBC() {
        double bX = b.getX();
        double bY = b.getY();
        double cX = c.getX();
        double cY = c.getY();
        sideBC = Math.sqrt(Math.pow(bX - cX, 2) + Math.pow(bY - cY, 2));
        return sideBC;
    }

    /**
     * Computes the distance between point A and point C.
     * @return the distance
     */
    public double getSideAC() {
        double aX = a.getX();
        double aY = a.getY();
        double cX = c.getX();
        double cY = c.getY();
        sideAC = Math.sqrt(Math.pow(aX - cX, 2) + Math.pow(aY - cY, 2));
        return sideAC;
    }

    /**
     * Computes and returns the perimeter of the triangle.
     * @return the perimeter of the triangle
     */
    public double getPerimeter() {
        perimeter = sideAB + sideAC + sideBC;
        return perimeter;
    }

    /**
     * Computes and returns the area of the triangle.
     * @return the area of the triangle
     */
    public double getArea() {
        // Computes the half of perimeter
        double halfP = getPerimeter() / 2;
        double area = Math.sqrt(halfP * (halfP - sideAB) * (halfP - sideAC) * (halfP - sideBC));
        return area;
    }

    /**
     * Computes and returns the angle of corner A.
     * @return the angle of corner A.
     */
    public double getAngleA() {
        double cosA = (sideAC * sideAC + sideAB * sideAB - sideBC * sideBC) / (2 * sideAC * sideAB);
        double radiansA = Math.acos(cosA);
        double angleA = Math.toDegrees(radiansA);
        return angleA;
    }

    /**
     * Computes and returns the angle of corner B.
     * @return the angle of corner B.
     */
    public double getAngleB() {
        double cosB = (sideBC * sideBC + sideAB * sideAB - sideAC * sideAC) / (2 * sideBC * sideAB);
        double radiansB = Math.acos(cosB);
        double angleB = Math.toDegrees(radiansB);
        return angleB;
    }

    /**
     * Computes and returns the angle of corner C.
     * @return the angle of corner C.
     */
    public double getAngleC() {
        double cosC = (sideBC * sideBC + sideAC * sideAC - sideAB * sideAB) / (2 * sideBC * sideAC);
        double radiansC = Math.acos(cosC);
        double angleC = Math.toDegrees(radiansC);
        return angleC;
    }
}
