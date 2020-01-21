package chapter2.exercises;

import java.awt.*;
import javax.swing.JFrame;

public class DarkerDemo {

	public static void main(String[] args) {
		Color myColor = Color.red;
        myColor = myColor.darker();
        myColor = myColor.darker();
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
