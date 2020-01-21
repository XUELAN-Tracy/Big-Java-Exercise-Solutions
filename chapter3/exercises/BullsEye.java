package chapter3.exercises;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * A bull's eye that can be positioned anywhere on the screen.
 */
public class BullsEye {

	private int xLeft;
	private int yTop;
	
    /**
     * Construc a bull's eye with a given top left corner.
     * @param x the x coordinate of the top left corner
     * @param y the ycoordinate of the top left corner
     */
	public BullsEye(int x, int y) {
		xLeft = x;
		yTop = y;
	}
    
    /**
     * Draws the bull's eye.
     * @param g2 the graphics context
     */
	public void draw(Graphics2D g2) {
		// Draws the biggest black circle
		Ellipse2D.Double black1 = new Ellipse2D.Double(xLeft, yTop, 100, 100);
		g2.setColor(Color.black);
	    g2.fill(black1);
				
		// Draws the biggest white circle
		Ellipse2D.Double white1 = new Ellipse2D.Double(xLeft+10,yTop+10, 80, 80);
		g2.setColor(Color.white);
		g2.fill(white1);
				
		// Draws the second biggest black circle
		Ellipse2D.Double black2 = new Ellipse2D.Double(xLeft+20,yTop+20, 60, 60);
		g2.setColor(Color.black);
		g2.fill(black2);
				
		//Draw the smallest white circle
		Ellipse2D.Double white2 = new Ellipse2D.Double(xLeft+30,yTop+30, 40, 40);
		g2.setColor(Color.white);
		g2.fill(white2);
				
		// Draws the smallest black circle
		Ellipse2D.Double black3 = new Ellipse2D.Double(xLeft+40,yTop+40,20, 20);
		g2.setColor(Color.black);
		g2.fill(black3);
	}
}
