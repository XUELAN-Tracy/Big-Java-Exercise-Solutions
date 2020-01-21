package chapter3.exercises;

import java.awt.*;

import javax.swing.JComponent;
/**
 * This component draws one back circle where two whie circles are on it.
 * @author xuelan
 */
public class BullseyeComponent extends JComponent{
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		BullsEye eye = new BullsEye(80,50);
		eye.draw(g2);
			
	}
}
