package chapter3.exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;
/**
 * Draws a bar chart as the answer to p3.22
 * @author xuelan
 */
public class BarChartComponent extends JComponent{

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		int xLeft = 50;
		int yTop = 50;
		
		// Draws the box
		RoundRectangle2D.Double box = new RoundRectangle2D.Double(xLeft, yTop,  340, 170, 20, 20);
		g2.setColor(new Color(243, 240, 218));
		g2.fill(box);
		
		// Sets the left data
		g2.setColor(new Color(40, 117, 174));
		g2.drawString("Bridge Name", xLeft+50, yTop+25);
		g2.setColor(Color.black);
		g2.drawString("Golden Gate", xLeft+50, yTop+59);
        g2.drawString("Brooklyn", xLeft+60, yTop+92);
        g2.drawString("Delaware Memorial", xLeft+30, yTop+126);
        g2.drawString("Mackinac", xLeft+60, yTop+160);
        
        // Sets the right data
        g2.setColor(new Color(40, 117, 174));
        g2.drawString("Longest Span (ft)", xLeft+200, yTop+25);
        g2.setColor(Color.black);
        g2.drawString("4,200", xLeft+230, yTop+59);
        g2.drawString("1,595", xLeft+230, yTop+92);
        g2.drawString("2,150", xLeft+230, yTop+126);
        g2.drawString("3,800", xLeft+230, yTop+160);
        
        // Draws the white line
        g2.setColor(Color.WHITE);
        Point2D.Double p1 = new Point2D.Double(xLeft, yTop+34);
        Point2D.Double p2 = new Point2D.Double(xLeft+340, yTop+34);
        Line2D.Double l1 = new Line2D.Double(p1, p2);
        g2.draw(l1);
        
        Point2D.Double p3 = new Point2D.Double(xLeft, yTop+68);
        Point2D.Double p4 = new Point2D.Double(xLeft+340, yTop+68);
        Line2D.Double l2 = new Line2D.Double(p3, p4);
        g2.draw(l2);
        
        Point2D.Double p5 = new Point2D.Double(xLeft, yTop+102);
        Point2D.Double p6 = new Point2D.Double(xLeft+340, yTop+102);
        Line2D.Double l3 = new Line2D.Double(p5, p6);
        g2.draw(l3);
        
        Point2D.Double p7 = new Point2D.Double(xLeft, yTop+136);
        Point2D.Double p8 = new Point2D.Double(xLeft+340, yTop+136);
        Line2D.Double l4 = new Line2D.Double(p7, p8);
        g2.draw(l4);
        
        Point2D.Double p9 = new Point2D.Double(xLeft+170, yTop);
        Point2D.Double p10 = new Point2D.Double(xLeft+170, yTop+170);
        Line2D.Double l5 = new Line2D.Double(p9, p10);
        g2.draw(l5);
        
        
		
        
	}
}
