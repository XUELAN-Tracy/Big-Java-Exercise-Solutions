package chapter4.projects.triangles;

public class Coordinate {

    double x;
    double y;

    /**
     * Constructs a point with given coordinate x and coordinate y.
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Gets the x-coordinate of the point.
     * @return
     */
    public double getX() {
        return x;
    }

    /**
     * Gets the y-coordinate of the point.
     * @return
     */
    public double getY() {
        return y;
    }

}
