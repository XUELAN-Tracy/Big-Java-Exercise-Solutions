package chapter5.exercises;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 * A circle can be drew anywhere.
 * @author LanXue
 * @date 2020-02-12 19:52
 */
public class Circle {

    private double xLeft, yLeft;
    private double radius;
    private Point2D.Double centerPoint;

    /**
     * Constructs a circle with given center point and radius.
     * @param centerPoint the center point
     * @param radius the length of radius
     */
    public Circle(Point2D.Double centerPoint, double radius) {
        this.centerPoint = centerPoint;
        this.radius = radius;
        this.xLeft = centerPoint.getX() - radius;
        this.yLeft = centerPoint.getY() - radius;
    }

    public void drawBig(Graphics2D g2, Color color) {
        Ellipse2D.Double circle = new Ellipse2D.Double(xLeft, yLeft, radius*2, radius*2);
        g2.draw(circle);
    }

    public void drawSmall(Graphics2D g2, Color color) {
        Ellipse2D.Double circle = new Ellipse2D.Double(xLeft, yLeft, radius*2, radius*2);
        g2.setColor(color);
        g2.draw(circle);
        g2.fill(circle);
    }

    /**
     * Tests if the given point is inside the circle
     * @param p
     * @return
     */
    public boolean isInside(Point2D.Double p) {
        double distanceToCenter = Math.sqrt(Math.pow(p.getX() - centerPoint.getX(), 2) + Math.pow(p.getY() - centerPoint.getY(), 2));
        return distanceToCenter < radius;
    }
}
