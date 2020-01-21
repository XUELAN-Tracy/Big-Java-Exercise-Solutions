package chapter3.exercises;

import javax.swing.JFrame;

public class OlympicRIngViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("The Olympic Ring");
		frame.setLocation(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		OlympicRingComponent component = new OlympicRingComponent();
		frame.add(component);
		
		frame.setVisible(true);
		

	}

}
