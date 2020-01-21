package chapter2.codestudy;
import javax.swing.JFrame;

public class EmptyFrameViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JFrame frame1 = new JFrame();
        frame1.setSize(400,400);
        frame1.setTitle("Hello, World!");
        
        JFrame frame2 = new JFrame();
        frame2.setSize(400,400);
        frame2.setTitle("This greeting is from Tracy!");
        
        // when the user closes the frame, the program automatically exits
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame1.setVisible(true);
        frame2.setVisible(true);
	}
}
