package chapter2.exercises;

import java.awt.*;
import javax.swing.*;

public class NameComponent extends JComponent {
	public void paintComponent(Graphics g) {
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw the blue rectangle
		Rectangle box = new Rectangle(20, 20, 100, 50);
		g2.setColor(Color.blue);
		g2.fill(box);
		
		// Draw the name in red
		g2.setColor(Color.red);
		g2.drawString("Tracy", 53, 50);
	}
}
