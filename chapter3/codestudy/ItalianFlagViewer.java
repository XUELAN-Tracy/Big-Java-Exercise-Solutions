package chapter3.codestudy;

import javax.swing.JFrame;

public class ItalianFlagViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1200, 1800);
		frame.setTitle("Italian Flag");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ItalianFlagComponent component = new ItalianFlagComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}

}
