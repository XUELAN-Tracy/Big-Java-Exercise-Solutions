package chapter4.exercises;

/**
 * A program that can compute the area, perimeter and diagonal.
 * @author LanXue
 */
public class Square {

    double length;

    /**
     * Constructs the square with the given length of the sides.
     * @param aLength the given length
     */
    public Square(double aLength) {
        length = aLength;
    }

    /**
     * Computes the area of the square and returns it.
     * @return the area of the square
     */
    public double getArea() {
        return Math.pow(length, 2);
    }

    /**
     * Computes the perimeter of the square and returns it.
     * @return the perimeter of the square
     */
    public double getPerimeter() {
        return length * 4;
    }

    /**
     * Computes the diagonal of the square and returns it.
     * @return the diagonal of the square
     */
    public double getDiagonal() {
        return Math.sqrt(length * length + length * length);
    }
}
