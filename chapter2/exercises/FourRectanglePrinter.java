package chapter2.exercises;

import java.awt.*;

public class FourRectanglePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle(0, 0, 10, 20);
		System.out.println(box);
		
		// Move the box to the right
		box.translate(10, 0);
		System.out.println(box);
		
		// Move the box to the lower right
		box.translate(10, 10);
		System.out.println(box);
		
		//Move the box to the lower left
		box.translate(0, 10);
		System.out.println(box);
	}

}
