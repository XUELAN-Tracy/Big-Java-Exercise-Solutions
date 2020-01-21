package chapter2.exercises;

import javax.swing.*;
import java.awt.*;

public class ColorNameComponent extends JComponent{
    public void paintComponent(Graphics g) {
    	Graphics2D g2 = (Graphics2D) g;
    	
    	// Draw 12 strings with 12 standard colors
    	g2.setColor(Color.black);
    	g2.drawString("black", 125, 30);
    	
    	g2.setColor(Color.blue);
    	g2.drawString("blue", 125, 50);
    	
    	g2.setColor(Color.cyan);
    	g2.drawString("cyan", 125, 70);
    	
    	g2.setColor(Color.darkGray);
    	g2.drawString("dark gray", 125, 90);
    	
    	g2.setColor(Color.gray);
    	g2.drawString("gray", 125, 110);
    	
    	g2.setColor(Color.green);
    	g2.drawString("green", 125, 130);
    	
    	g2.setColor(Color.lightGray);
    	g2.drawString("light gray", 125, 150);
    	
    	g2.setColor(Color.magenta);
    	g2.drawString("magenta", 125, 170);
    	
    	g2.setColor(Color.orange);
    	g2.drawString("orange", 125, 190);
    	
    	g2.setColor(Color.pink);
    	g2.drawString("pink", 125, 210);
    	
    	g2.setColor(Color.red);
    	g2.drawString("red", 125, 230);
    	
    	g2.setColor(Color.yellow);
    	g2.drawString("yellow", 125, 250);
    	    	
    }
}
