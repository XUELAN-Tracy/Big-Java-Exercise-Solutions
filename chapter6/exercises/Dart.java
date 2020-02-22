package chapter6.exercises;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

/**
 * This program can determine the approximate value for Pi by simulating darts throw.
 * @author LanXue
 * @date 2020-02-22 23:28
 */
public class Dart {

    private Ellipse2D.Double circle;
    private double x;
    private double y;
    private int hitCount;
    private int tryCount;

    public Dart() {
        hitCount = 0;
        tryCount = 0;
        circle = new Ellipse2D.Double(-1, -1, 2.0, 2.0);
    }

    /**
     * Checks whether the point is in the circle or not.
     * @return true if it is in the circle, false if it's nor
     */
    public boolean isInside() {
        return circle.contains(x, y);
    }

    /**
     * Throws a dart and record whether it hits.
     */
    public void throwDart() {
        x = Math.random() * 2 - 1;
        y = Math.random() * 2 - 1;
        if (isInside()) {
            hitCount ++;
        }
        tryCount ++;
    }

    public int getHitCount() {
        return hitCount;
    }

    public double getPi() {
        double PI = ((double) hitCount / tryCount) * 4.0;
        return PI;
    }
}
