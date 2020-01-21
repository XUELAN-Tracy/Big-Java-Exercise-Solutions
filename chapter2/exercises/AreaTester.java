package chapter2.exercises;

import java.awt.*;

public class AreaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle(0, 0, 50, 35);
		double width = box.getWidth();
		double height = box.getHeight();
		double area = width * height;
		System.out.println("The area is " + area);
		

	}

}
