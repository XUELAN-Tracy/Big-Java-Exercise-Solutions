package chapter2.exercises;

import javax.swing.*;
import java.awt.*;

public class TwoSquareComponent extends JComponent{
    public void paintComponent(Graphics g) {
    	Graphics2D g2 = (Graphics2D) g;
    	
    	// Draw a pink square
    	Rectangle pinkSquare = new Rectangle(20, 20, 50, 50);
    	g2.setColor(Color.pink);
    	g2.fill(pinkSquare);
    	
    	// Draw a purple square
    	Rectangle purpleSquare = new Rectangle(80, 20, 50, 50);
    	Color purple = new Color(128, 0, 128);
    	g2.setColor(purple);
    	g2.fill(purpleSquare);
    	
    }
}
