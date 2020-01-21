package chapter2.exercises;

import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class EllipseComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, getWidth(), getHeight());
		
		g2.draw(ellipse);
		g2.setColor(Color.orange);
		g2.fill(ellipse);
	}

}
