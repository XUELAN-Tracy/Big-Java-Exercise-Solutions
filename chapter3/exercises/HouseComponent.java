package chapter3.exercises;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

/**
 * This component draws one back circle where two whie circles are on it.
 * @author xuelan
 */
public class HouseComponent extends JComponent{

	public void paintComponent(Graphics g) {
		
        Graphics2D g2 = (Graphics2D) g;
		
		House house1 = new House(80,200,100);
		house1.draw(g2);
		
		House house2 = new House(220, 250, 50);
		house2.draw(g2);
		
		House house3 = new House(320, 50, 200);
		house3.draw(g2);
	}
}
