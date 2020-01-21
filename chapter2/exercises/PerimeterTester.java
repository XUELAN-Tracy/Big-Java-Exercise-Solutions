package chapter2.exercises;

import java.awt.*;

public class PerimeterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle(0, 0, 50, 35);
		double width = box.getWidth();
		double height = box.getHeight();
		double perimeter = (width + height) * 2;
		System.out.println("The perimeter is " + perimeter);
	}

}
