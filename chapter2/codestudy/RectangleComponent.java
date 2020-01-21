package chapter2.codestudy;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g) {
    	//recover Graphics2D
    	Graphics2D g2 = (Graphics2D) g;
    	
    	//construct a rectangle and draw it
    	Rectangle box = new Rectangle(5, 10, 20, 20);
    	g2.draw(box);
    	
    	//move rectangle 15 units to the right and 25 units down
    	//box.translate(15, 25);
    	
    	//construct another rectangle and fill it with orange
    	box = new Rectangle(20, 35, 20, 20);
    	g2.setColor(Color.orange);
    	g2.fill(box);
    	
    	//draw moved rectangle
    	//g2.draw(box);
    	
    	//construct an ellipse and draw it
    	Ellipse2D.Double ellipse = new Ellipse2D.Double(5, 10, 80, 50);
    	g2.setColor(Color.blue);
    	g2.draw(ellipse);
    	
    	//construct a circle and draw it
    	Ellipse2D.Double circle = new Ellipse2D.Double(5, 10, 100, 100);
    	g2.setColor(Color.lightGray);
    	g2.draw(circle);
    	
    	//construct a line and draw it
    	Line2D.Double segment = new Line2D.Double(5, 10, 100, 100);
    	g2.setColor(Color.red);
    	g2.draw(segment);
    	
    	//construct a text and draw it
    	g2.setColor(Color.green);
    	g2.drawString("Hello, Tracy!", 5, 130);
    	
    }
}
