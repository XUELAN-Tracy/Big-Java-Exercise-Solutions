package chapter2.exercises;

import javax.swing.JFrame;

public class TwoSquareViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 200);
		frame.setLocation(500, 300);
		frame.setTitle("Two squares with different colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TwoSquareComponent component = new TwoSquareComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}

}
