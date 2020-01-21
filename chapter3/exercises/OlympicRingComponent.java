package chapter3.exercises;

import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.*;
/**
 * Draw an Olympic ring.
 * @author xuelan
 */
public class OlympicRingComponent extends JComponent {

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		int xLeft = 120; // the x coordinate of the top left corner
		int yTop = 90; // the y coordinate of the top left corner
		int size = 100; // the diameter of the ring
		
		// Sets the circle
		Ellipse2D.Double circle = new Ellipse2D.Double(xLeft, yTop, size, size);
		BasicStroke width = new BasicStroke(5);
		g2.setStroke(width);
		// Draws the blue ring
		
		Color blue = new Color(9, 129, 189);
		g2.setColor(blue);
		g2.draw(circle);
		
		// Draws the black ring
		Color black = new Color(0, 0, 0);
		g2.translate(size+5, 0);
		g2.setColor(black);
		g2.draw(circle);
		
		// Draws the red ring
		Color red = new Color(231, 50, 76);
		g2.translate(size+5, 0);
		g2.setColor(red);
		g2.draw(circle);
		
		// Draws the yellow ring
		Color yellow = new Color(244, 172, 50);
		g2.translate(-1.5*size, 0.5*size);
		g2.setColor(yellow);
		g2.draw(circle);
		
		// Draws the green ring
		Color green = new Color(29, 135, 59);
		g2.translate(size, 0);
		g2.setColor(green);
		g2.draw(circle);
		
		
	}
}
