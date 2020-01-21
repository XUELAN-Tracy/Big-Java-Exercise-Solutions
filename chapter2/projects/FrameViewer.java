package chapter2.projects;

import java.awt.Color;
import javax.swing.*;

import java.net.MalformedURLException;
import java.net.URL;

public class FrameViewer {

	public static void main(String[] args) throws MalformedURLException {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		
		URL imageURL = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1574168320771&di=9c4732fd46c3f529e98cdbb60772e650&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fq_70%2Cc_zoom%2Cw_640%2Fimages%2F20171011%2F60c5220aa59543c9b050d7230cbfad95.gif");
		
        JLabel label = new JLabel("Hello, Tracy"); 
		label.setIcon(new ImageIcon(imageURL));

		label.setOpaque(true); 
		
		Color paleGreen = new Color(152, 251, 152);
		label.setBackground(paleGreen);
		frame.add(label); 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);

	}

}
