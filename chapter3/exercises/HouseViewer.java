package chapter3.exercises;

import javax.swing.JFrame;
public class HouseViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 700);
		frame.setLocation(250, 150);
		frame.setTitle("Bull's eye");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HouseComponent component = new HouseComponent();
		frame.add(component);
		frame.setVisible(true);

	}

}
