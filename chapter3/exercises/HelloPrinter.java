package chapter3.exercises;

import javax.swing.*;

public class HelloPrinter {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setLocation(600,500);
		frame.setTitle("HELLO Printer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HelloComponent component = new HelloComponent();
		frame.add(component);
		frame.setVisible(true);
	}

}
