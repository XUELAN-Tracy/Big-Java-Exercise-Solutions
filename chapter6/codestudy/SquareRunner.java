package chapter6.codestudy;

/**
 * This program prints two square.
 * @author LanXue
 * @date 2020-02-16 16:19
 */
public class SquareRunner {

    public static void main(String[] args) {
        Square small = new Square(3);
        System.out.println(small.toString());

        Square large = new Square(6);
        System.out.println(large.toString());
    }
}
