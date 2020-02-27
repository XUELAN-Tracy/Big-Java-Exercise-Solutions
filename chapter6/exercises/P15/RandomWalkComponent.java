package chapter6.exercises.P15;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * @author LanXue
 * @date 2020-02-28 02:44
 */
public class RandomWalkComponent extends JComponent {

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Grid grid = new Grid(110, 50, 30, 20);
        grid.drawGrid(g2);

        double xInitial = (grid.xLeft + (grid.xLeft + (grid.numberOfStreets - 1) * grid.distance)) / 2.0;
        double yInitial =  (grid.yTop + (grid.yTop + (grid.numberOfStreets - 1) * grid.distance)) / 2.0;
        int distance = grid.distance;
        Drunkard man = new Drunkard(xInitial, yInitial, distance);
        man.draw(g2);
    }
}
