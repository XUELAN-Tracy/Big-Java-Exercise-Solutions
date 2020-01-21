package chapter2.exercises;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.*;

public class FaceComponent extends JComponent {
    public void paintComponent(Graphics g) {
    	Graphics2D g2 = (Graphics2D) g;
    	
    	// Draw the head
    	Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 100);
    	g2.setColor(Color.blue);
		g2.draw(head);
		
		// Draw the eyes
		Ellipse2D.Double eye1 = new Ellipse2D.Double(23, 40, 15, 15);
		g2.draw(eye1);
		Ellipse2D.Double eye2 = new Ellipse2D.Double(73, 40, 15, 15);
		g2.draw(eye2);
				
		// Draw the mouth
		Line2D.Double mouth = new Line2D.Double(30, 80, 85, 80);
		g2.draw(mouth);
    }
}
