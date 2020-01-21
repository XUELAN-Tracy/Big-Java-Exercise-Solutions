package chapter3.codestudy;

import java.awt.*;
import javax.swing.*;

/**
 * This component draws two car shapes.
 */

public class CarComponent extends JComponent{
    public void paintComponent(Graphics g) {
    	Graphics2D g2 = (Graphics2D) g;
    	
    	int size = 60;
    	Color color1 = new Color(122, 66, 212);
    	CarLittle car1 = new CarLittle(0, 0, color1, size);
    	
    	int x = getWidth() - size*2;
    	int y = getHeight() - size;
    	
    	Color color2 = new Color(212, 121, 66);
    	CarLittle car2 = new CarLittle(x, y, color2, size*2);
    	
    	car1.draw(g2);
    	car2.draw(g2);
    			
    }
}
