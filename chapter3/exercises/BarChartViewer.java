package chapter3.exercises;

import javax.swing.JFrame;

public class BarChartViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(450, 300);
		frame.setLocation(400, 250);
		frame.setTitle("A bar chart");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BarChartComponent component = new BarChartComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}
