package chapter2.exercises;

import java.awt.*;

public class IntersectionPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(0, 0, 20, 50);
		Rectangle r2 = new Rectangle(10, 25, 50, 20);

		System.out.println(r1);
		System.out.println(r2);
		
		// If the width or the height is not positive, the intersection is empty,
		Rectangle r3 =r1.intersection(r2);
		System.out.println(r3); 
		
		
	}

}
