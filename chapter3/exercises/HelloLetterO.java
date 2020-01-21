package chapter3.exercises;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Letter O thatcan be positioned anywhere.
 * @author xuelan
 */
public class HelloLetterO {

	private int xLeft;
	private int yTop;
	private int size;
	
	/**
	 * Construct a letter O with a given position.
	 * @param x the x coordinate of the top left corner
	 * @param y the y coordinate of the top left corner
	 * @param sizeLetter the width of the letter
	 */
	public HelloLetterO(int x, int y, int sizeLetter) {
		xLeft = x;
		yTop = y;
		size = sizeLetter;
	}
	
	/**
	 * Draws the ) letter.
	 * @param g2 the graphics context
	 */
	public void draw(Graphics2D g2) {
		
		// Draws the letter O
		Ellipse2D.Double o = new Ellipse2D.Double(xLeft, yTop, size, size*2);
		g2.draw(o);
	}
}
