package chapter2.exercises;

import javax.swing.JFrame;

public class ColorNameViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setLocation(500, 300);
		frame.setTitle("12 colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ColorNameComponent component = new ColorNameComponent();
		frame.add(component);
		
		frame.setVisible(true);
		

	}

}
