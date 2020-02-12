package chapter5.exercises;

/**
 * @author LanXue
 * @date 2020-02-12 19:42
 */
public class LineTester {

    public static void main(String[] args) {

        Line line1 = new Line(3);
        Line line2 = new Line(3);

        if (line1.intersects(line2)) {
            System.out.println("These two lines intersects.");
        } else {
            System.out.println("These two lines do not intersect.");
        }

        if (line1.equals(line2)) {
            System.out.println("These two lines are the same.");
        } else {
            System.out.println("These two lines are not the same.");
        }

        if (line1.isParallel(line2)) {
            System.out.println("These two lines are parallel");
        } else {
            System.out.println("These two lines are not parallel");
        }
    }
}
