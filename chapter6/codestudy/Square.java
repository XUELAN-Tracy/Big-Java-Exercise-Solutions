package chapter6.codestudy;

/**
 * This class describes triangle objects that can be displayed as shape like this:
 * [][][]
 * [][][]
 * [][][]
 * @author LanXue
 * @date 2020-02-16 16:15
 */
public class Square {

    private int side;

    /**
     * Constructs a square
     * @param aSide the length of the sides
     */
    public Square(int aSide) {
        side = aSide;
    }

    /**
     * Computes a string representing the square.
     * @return a string consisting of [] and newline characters
     */
    @Override
    public String toString() {
        String r = "";
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <=side; j++) {
                r = r + "[]";
            }
            r = r + "\n";
        }
        return r;
    }
}
