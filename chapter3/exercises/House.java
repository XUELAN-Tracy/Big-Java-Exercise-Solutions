package chapter3.exercises;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * A house that can be positioned anywhere on the screen.
 */
public class House {
    
	private int xLeft;
	private int yTop;
	private int size;
	
	/**
	 * Constructs a house with a given top left corner.
     * @param x the x coordinate of the top left corner
     * @param y the ycoordinate of the top left corner
     * @param sizeHouse the width of the house
	 */
	public House(int x, int y, int sizeHouse) {
		xLeft = x;
		yTop = y;
		size = sizeHouse;
	}
	
	/**
	 * Draws the house.
	 * @param g2 the graphics context
	 */
	public void draw(Graphics2D g2) {
		
		//Sets the points of the roof
		Point2D.Double p1 = new Point2D.Double(xLeft+size/2, yTop);
		Point2D.Double p2 = new Point2D.Double(xLeft, yTop+size/2);
		Point2D.Double p3 = new Point2D.Double(xLeft+size, yTop+size/2);
		
		//Draws the roof
		Line2D.Double roofLeft = new Line2D.Double(p1, p2);
		Line2D.Double roofRight = new Line2D.Double(p1, p3);
		Line2D.Double roof = new Line2D.Double(p2, p3);
		Color purple = new Color(122, 66, 212);
		g2.setColor(purple);
		g2.draw(roofLeft);
		g2.draw(roofRight);
		g2.draw(roof);
			
		//Draws the walls and floor
		Rectangle2D.Double body = new Rectangle2D.Double(xLeft, yTop+size/2, size, size);
		g2.draw(body);
				
		// Draws the door
		Rectangle2D.Double door = new Rectangle2D.Double(xLeft+size/5, yTop+size*9/10, size/5, size*3/5);	
		g2.draw(door);

		
		// Draws the window
		Rectangle2D.Double window = new Rectangle2D.Double(xLeft+size*3/5, yTop+size, size/5, size/5);
		g2.draw(window);
		
	}
}
