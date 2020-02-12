package chapter5.exercises;

import chapter5.exercises.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 * This component draws the circle whose color is decided by the position of the given point.
 * @author LanXue
 * @date 2020-02-12 20:14
 */
public class CircleComponent extends JComponent {

    private Circle circle;
    private Circle smallCircle;
    private Color color;
    Point2D.Double p;

    public CircleComponent(Point2D.Double p, double smallRadius) {
        this.p = p;
        circle = new Circle(new Point2D.Double(200, 200), 100);
        smallCircle = new Circle(new Point2D.Double(p.getX(), p.getY()), smallRadius);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        circle.drawBig(g2, Color.black);
        if (circle.isInside(p)) {
            color = Color.green;
        } else {
            color = Color.red;
        }
        smallCircle.drawSmall(g2, color);

    }

}
