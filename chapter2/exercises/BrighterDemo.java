package chapter2.exercises;

import java.awt.*;
import javax.swing.JFrame;

public class BrighterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Color myColor = new Color(50, 100, 150);
        myColor = myColor.brighter();    
        System.out.println(myColor.getRed());
        System.out.println(myColor.getGreen());
        System.out.println(myColor.getBlue());
        
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}

}
