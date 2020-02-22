package chapter6.codestudy;

/**
 * This class describes triangle objects that can be displayed as shape like this:
 * []
 * [][]
 * [][][]
 * @author LanXue
 * @date 2020-02-16 16:02
 */
public class Triangle {

    private int width;

    /**
     * Constructs a triangle
     * @param aWidth
     */
    public Triangle(int aWidth) {
        width = aWidth;
    }

    /**
     * Computes a string representing the triangle.
     * @return a string consisting of [] and newline characters
     */
    @Override
    public String toString() {
        String r = "";
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <=i; j++) {
                r = r + "[]";
            }
            r = r + "\n";
        }
        return r;
    }
}
