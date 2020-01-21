package chapter3.codestudy;

import java.awt.*;
import javax.swing.*;

/**
 * This component draws an Italian flag.
 * @author Tracy
 */
public class ItalianFlagComponent extends JComponent{
    public void paintComponent(Graphics g) {
    	Graphics2D g2 = (Graphics2D) g;
    	
    	ItalianFlag flag = new ItalianFlag(100, 100, 900);
    	flag.draw(g2);
    	
    }
}
