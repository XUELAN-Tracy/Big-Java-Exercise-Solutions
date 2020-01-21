package chapter2.codestudy;

import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.*;

public class AlienFaceComponent extends JComponent {
	public void paintComponent(Graphics g) {
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		//Draw the head
		Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150);
		g2.draw(head);
		
		//Draw the eyes
		g2.setColor(Color.green);
		Rectangle eye = new Rectangle(25, 70, 15, 15);
		g2.fill(eye);
		eye.translate(50, 0);
		g2.fill(eye);
		
		
		//Draw the mouth
		g2.setColor(Color.red);
		Line2D.Double mouth = new Line2D.Double(30, 110, 80, 110);
		g2.draw(mouth);
		
		//Draw the greeting
		g2.setColor(Color.blue);
		g2.drawString("Hello, World!", 15, 175);	
		
	}
}
