package chapter3.exercises;

import javax.swing.JFrame;

public class BullseyeViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 250);
		frame.setLocation(550, 350);
		frame.setTitle("Bull's eye");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BullseyeComponent component = new BullseyeComponent();
		frame.add(component);
		frame.setVisible(true);

	}

}
