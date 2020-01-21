package chapter3.exercises;

/**
 * A class to test Moth
 * @author xuelan
 */
public class MothTester {

	/**
	 * Tests the methods of Moth class
	 * @param args not used
	 */
	public static void main(String[] args) {
		Moth moth = new Moth(40);
		moth.moveToLight(80);
		
		System.out.println(moth.getPosition());
		System.out.println("The expected: 60");
	}
}
