package chapter2.codestudy;
import java.awt.Component;

import javax.swing.JFrame;

public class RectangleViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);
        frame.setTitle("some graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        RectangleComponent component = new RectangleComponent();
        frame.add(component);
        
        frame.setVisible(true);
	}

}