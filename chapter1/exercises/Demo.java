package chapter1.exercises;
import java.awt.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0, 0);
        double x = box.getX();
        double y = box.getY();
        System.out.println(x);
        System.out.println(y);
        
	}

}
