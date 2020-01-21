package chapter3.codestudy;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

/**
 * An Italian Flag can be positioned anywhere on the screen.
 * @author Tracy
 */

public class ItalianFlag {
    private double xLeft;
    private double yTop;
    private double aWidth;
    
    /**
     * Construc a flag with a given top left corner and width.
     * @param x the x coordinate of the top left corner
     * @param y the ycoordinate of the top left corner
     * @param width the width of the flag
     */   
    public ItalianFlag(double x, double y, double width) {
    	xLeft = x;
    	yTop = y;
    	aWidth = width/3;
    }
    
    /**
     * Draws the flag.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
        // Draws the left part of the flag
    	Rectangle2D.Double left = new Rectangle2D.Double(xLeft, yTop, aWidth, aWidth*2);
        Color myGreen = new Color(64,143,79);
    	g2.setColor(myGreen);
        g2.fill(left);
        
        // Draws the middle part of the flag
        Point2D.Double p1 = new Point2D.Double(xLeft+aWidth, yTop);
        Point2D.Double p2 = new Point2D.Double(xLeft+aWidth*2, yTop);
        Point2D.Double p3 = new Point2D.Double(xLeft+aWidth, yTop+aWidth*2);
        Point2D.Double p4 = new Point2D.Double(xLeft+aWidth*2, yTop+aWidth*2);
        Line2D.Double top = new Line2D.Double(p1, p2);
        Line2D.Double bottom = new Line2D.Double(p3, p4);
        g2.setColor(Color.black);
        g2.draw(top);
        g2.draw(bottom);
        
        // Draws the right part of the flag
        Rectangle2D.Double right = new Rectangle2D.Double(xLeft+aWidth*2, yTop, aWidth, aWidth*2);
        Color myRed = new Color(190,45,48);
        g2.setColor(myRed);
        g2.fill(right);      
    }   
}
