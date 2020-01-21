package chapter3.codestudy;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.*;

/**
 * A car shape that can be positioned anywhere on the screen.
 */

public class CarLittle {
    private int xLeft;
    private int yTop;
    private Color color;
    private int size;
    
    /**
     * Construc a car with a given top left corner.
     * @param x the x coordinate of the top left corner
     * @param y the ycoordinate of the top left corner
     * @parma colorCar the color of the car
     * @parma sizeCar the length of the car
     */
    public CarLittle(int x, int y, Color colorCar, int sizeCar) {
    	xLeft = x;
    	yTop = y;
    	color = colorCar;
    	size = sizeCar;
    }
    
    /**
     * Draws the car.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
    	Rectangle body = new Rectangle(xLeft, yTop+size/6, size, size/6);
    	Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft+size/6, yTop+size/3, size/6, size/6);
    	Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft+2*size/3, yTop+size/3, size/6, size/6);
    	
    	// The points of the windshieds and the roof
    	Point2D.Double p1 = new Point2D.Double(xLeft+size/6, yTop+size/6);
    	Point2D.Double p2 = new Point2D.Double(xLeft+size/3, yTop);
    	Point2D.Double p3 = new Point2D.Double(xLeft+size*2/3, yTop);
    	Point2D.Double p4 = new Point2D.Double(xLeft+5*size/6, yTop+size/6);
    	
    	// The line of the windshieds and the roof
    	Line2D.Double frontWindShield = new Line2D.Double(p1, p2);
    	Line2D.Double roof = new Line2D.Double(p2, p3);
    	Line2D.Double rearWindShield = new Line2D.Double(p3, p4);
    	
    	g2.setColor(color);
    	g2.draw(body);
    	// g2.setColor(Color.orange);
    	g2.fill(body);
    	// g2.setColor(Color.black);
    	g2.fill(frontTire);
    	g2.fill(rearTire);
    	g2.draw(frontWindShield);
    	g2.draw(roof);
    	g2.draw(rearWindShield);
    }
}
