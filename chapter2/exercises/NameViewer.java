package chapter2.exercises;

import javax.swing.JFrame;

public class NameViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLocation(500, 300);
		frame.setSize(300, 200);
		frame.setTitle("my name printer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NameComponent component = new NameComponent();
		frame.add(component);
		
		frame.setVisible(true);

	}

}
