package chapter2.exercises;

import javax.swing.JFrame;

public class FaceViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JFrame frame = new JFrame();
        frame.setSize(250, 250);
        frame.setTitle("An unhappy face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FaceComponent component = new FaceComponent();
        frame.add(component);
        
        frame.setVisible(true);
	}

}
