package chapter5.exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

/**
 * @author LanXue
 * @date 2020-02-12 22:05
 */
public class TwoCirclesComponent extends JComponent {

    private TwoCircles firstCircle, secondCircle;
    private Color color;

    public TwoCirclesComponent(double radius1, double radius2) {
        firstCircle =  new TwoCircles(new Point2D.Double(100, 200), radius1);
        secondCircle =  new TwoCircles(new Point2D.Double(200, 100), radius2);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (firstCircle.intersects(secondCircle)) {
            color = Color.green;
        } else {
            color = Color.red;
        }
        firstCircle.draw(g2, color);
        secondCircle.draw(g2, color);
    }
}
