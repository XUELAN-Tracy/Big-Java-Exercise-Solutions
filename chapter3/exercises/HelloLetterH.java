package chapter3.exercises;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Letter H thatcan be positioned anywhere.
 * @author xuelan
 */
public class HelloLetterH {

	private int xLeft;
	private int yTop;
	private int size;
	
	/**
	 * Construct a letter H with a given position.
	 * @param x the x coordinate of the top left corner
	 * @param y the y coordinate of the top left corner
	 * @param sizeLetter the width of the letter
	 */
	public HelloLetterH(int x, int y, int sizeLetter) {
		xLeft = x;
		yTop = y;
		size = sizeLetter;
	}
	
	/**
	 * Draws the H letter.
	 * @param g2 the graphics context
	 */
	public void draw(Graphics2D g2) {
		
		// Sets the points of the letter
		Point2D.Double p1 = new Point2D.Double(xLeft, yTop);
		Point2D.Double p2 = new Point2D.Double(xLeft, yTop+2*size);
		Point2D.Double p3 = new Point2D.Double(xLeft+size, yTop);
		Point2D.Double p4 = new Point2D.Double(xLeft+size, yTop+2*size);
		Point2D.Double p5 = new Point2D.Double(xLeft, yTop+size);
		Point2D.Double p6 = new Point2D.Double(xLeft+size, yTop+size);
		
		// Draws the letter
		Line2D.Double l1 = new Line2D.Double(p1, p2);
		Line2D.Double l2 = new Line2D.Double(p3, p4);
		Line2D.Double l3 = new Line2D.Double(p5, p6);
		
		g2.draw(l1);
		g2.draw(l2);
		g2.draw(l3);	
	}
}
