package chapter2.exercises;

import javax.swing.*;

public class EllipseViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
	    frame.setSize(150, 200);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    EllipseComponent component = new EllipseComponent();
	    frame.add(component);

	    frame.setVisible(true);

	}

}
