package chapter3.exercises;

import java.awt.*;
import javax.swing.*;

/**
 * This component draws "HEELO".
 */

public class HelloComponent extends JComponent{

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		int size = 20;
		int x = 50;
		int y = 50;
		HelloLetterH h = new HelloLetterH(x, y, size);
		HelloLetterE e = new HelloLetterE(x+5+size, y, size);
		HelloLetterL l1 = new HelloLetterL(x+10+2*size, y, size);
		HelloLetterL l2 = new HelloLetterL(x+15+3*size, y, size);
		HelloLetterO o = new HelloLetterO(x+20+4*size, y, size);
		
		h.draw(g2);
		e.draw(g2);
		l1.draw(g2);
		l2.draw(g2);
		o.draw(g2);
	}
}
