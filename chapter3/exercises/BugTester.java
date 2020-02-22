package chapter3.exercises;

/**
 * A class to test Bug.
 * @author xuelan
 */
public class BugTester{

	/**
	 * Tests the methods of Bug class.
	 * @param args not used
	 */
	public static void main(String[] args) {
		
		Bug bugsy = new Bug(10);
		bugsy.move();
		bugsy.turn();
		bugsy.move();
		bugsy.move();
		bugsy.move();
		bugsy.turn();
		bugsy.move();
		
		int position = bugsy.getPosition();
		System.out.println("The current position is: " + position);
		System.out.println("The expected: 9");

	}
}
