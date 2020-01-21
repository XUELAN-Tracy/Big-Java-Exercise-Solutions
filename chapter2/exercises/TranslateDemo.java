package chapter2.exercises;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TranslateDemo {

	public static void main(String[] args) {
		// Construct a frame and show it
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// Your work goes here
		// Construct a rectangle and set the frame bounds
		Rectangle box = new Rectangle(200, 200, 500, 300);
		frame.setBounds(box);
		
		JOptionPane.showMessageDialog(frame, "Click OK to continue");
		
		// Your work goes here
		// Move the rectangle and set the frame bounds again
		box.translate(100, 100);
		frame.setBounds(box);

	}

}
