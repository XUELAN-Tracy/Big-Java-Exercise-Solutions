package chapter5.exercises;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 * @author LanXue
 * @date 2020-02-12 21:56
 */
public class TwoCircles {

    private double xTop, yLeft;
    private double xCenter, yCenter;
    private double radius;

    public TwoCircles(Point2D.Double centerPoint, double radius) {
        this.radius = radius;
        this.xTop = centerPoint.getX() - radius;
        this.yLeft = centerPoint.getY() - radius;
        xCenter = centerPoint.getX();
        yCenter = centerPoint.getY();
    }

    public void draw(Graphics2D g2, Color color) {
        Ellipse2D.Double circle = new Ellipse2D.Double(xTop, yLeft, radius*2, radius*2);
        g2.setColor(color);
        g2.draw(circle);
        g2.fill(circle);
    }

    /**
     * Returns the radius.
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Tests if the two circles intersect
     * @param another the another circle
     * @return
     */
    public boolean intersects(TwoCircles another) {
        double distance = Math.sqrt(Math.pow(xCenter - another.xCenter, 2) + Math.pow(yCenter - another.yCenter, 2));
        return (distance <= (radius + another.radius) && distance >= Math.abs(radius - another.radius));
    }
}
