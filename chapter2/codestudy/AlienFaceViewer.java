package chapter2.codestudy;

import javax.swing.JFrame;

public class AlienFaceViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JFrame frame = new JFrame();
        frame.setSize(150, 250);
        frame.setTitle("An allien's face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AlienFaceComponent component = new AlienFaceComponent();
        frame.add(component);
        
        frame.setVisible(true);
	}

}
