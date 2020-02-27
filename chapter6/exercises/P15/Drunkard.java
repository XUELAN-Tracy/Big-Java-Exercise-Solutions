package chapter6.exercises.P15;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

/**
 * This program can stimulate a drunk man's walking trace.
 * @author LanXue
 * @date 2020-02-27 20:20
 */
public class Drunkard{

    double xInitial, yInitial;
    double xCurrent, yCurrent;

    int distance;
    Ellipse2D.Double InitialPoint, currentPoint;
    Random generator;


    public Drunkard(double xInitial, double yInitial, int distance) {
        generator = new Random();
        this.xInitial = xInitial;
        this.yInitial = yInitial;
        xCurrent = xInitial;
        yCurrent = yInitial;
        this.distance = distance;
        InitialPoint = new Ellipse2D.Double(xInitial - 5, yInitial - 5, 10, 10);
        currentPoint = new Ellipse2D.Double(xInitial - 2.5, yInitial - 2.5, 5, 5);
    }

    public void walk() {
        // East-0; West-1; North-2; South-3;
        int direction = generator.nextInt(4) + 1;
        if (direction == 1) {
            xCurrent += distance;
        } else if (direction == 2) {
            xCurrent -= distance;
        } else if (direction == 3) {
            yCurrent -= distance;
        } else if (direction == 4) {
            yCurrent += distance;
        }
        currentPoint = new Ellipse2D.Double(xCurrent - 2.5, yCurrent - 2.5, 5, 5);
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.red);
        g2.fill(InitialPoint);
        g2.setColor(Color.pink);
        for (int i = 1; i <= 100; i++) {
            walk();
            g2.fill(currentPoint);
        }
    }

}
