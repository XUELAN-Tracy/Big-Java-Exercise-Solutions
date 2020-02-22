package chapter6.codestudy;

/**
 * This program prints two triangles.
 * @author LanXue
 * @date 2020-02-16 16:07
 */
public class TriangleRunner {
    public static void main(String[] args) {
        Triangle small = new Triangle(3);
        System.out.println(small.toString());

        Triangle large = new Triangle(15);
        System.out.println(large.toString());
    }
}
