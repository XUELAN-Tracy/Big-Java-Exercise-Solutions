package chapter6.exercises.P15;

import chapter5.exercises.Line;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 * A grid of 20 streets horizontally and 20 streets vertically, which can be drew on the screen.
 * @author LanXue
 * @date 2020-02-27 20:56
 */
public class Grid {

    int xLeft;
    int yTop;
    int distance;
    // vertical or horizontal
    int numberOfStreets;

    public Grid(int xLeft, int yTop, int distance, int numberOfStreets) {
        this.xLeft = xLeft;
        this.yTop = yTop;
        this.distance = distance;
        this.numberOfStreets = numberOfStreets;
    }

    public void drawGrid(Graphics2D g2) {

        Line2D.Double horizontal = new Line2D.Double(xLeft, yTop, xLeft + distance * (numberOfStreets - 1), yTop);
        Line2D.Double vertical = new Line2D.Double(xLeft, yTop, xLeft, yTop + distance * (numberOfStreets - 1));
        g2.setColor(Color.GRAY);
        g2.draw(horizontal);
        g2.draw(vertical);

        // Draws the horizontal lines
        int yCurrent = yTop;
        for (int i=1; i <= numberOfStreets - 1; i++) {
            yCurrent += distance;
            horizontal = new Line2D.Double(xLeft, yCurrent, xLeft + distance*19, yCurrent);
            g2.draw(horizontal);
        }

        // Draws the vertical lines
        int xCurrent = xLeft;
        for (int j=1; j <= numberOfStreets - 1; j++) {
            xCurrent += distance;
            vertical = new Line2D.Double(xCurrent, yTop, xCurrent, yTop + distance*19);
            g2.draw(vertical);
        }

    }


}
