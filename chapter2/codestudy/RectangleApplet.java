package chapter2.codestudy;
import java.awt.*;
import javax.swing.*;

public class RectangleApplet extends JApplet {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle box = new Rectangle(5, 10, 20, 20);
    	g2.draw(box);
    	
    	box.translate(15, 25);
    	g2.draw(box);
	}
}
