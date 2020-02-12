package chapter5.exercises;

import javax.swing.*;
import java.awt.geom.Point2D;

/**
 * @author LanXue
 * @date 2020-02-12 21:04
 */
public class CircleViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Circle Viewer");
        frame.setSize(600, 600);
        frame.setLocation(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String input = JOptionPane.showInputDialog("x: ");
        double x = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("y: ");
        double y = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("the radius of small circle: ");
        double smallRadius = Double.parseDouble(input);
        Point2D.Double p = new Point2D.Double(x, y);

        CircleComponent component = new CircleComponent(p, smallRadius);
        frame.add(component);

        frame.setVisible(true);

    }
}
