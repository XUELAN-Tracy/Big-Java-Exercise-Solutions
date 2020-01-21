package chapter3.projects;

/**
 * A class to test greeter
 * @author xuelan
 */
public class GreeterTester {

	/**
	 * Tests the methods of Greeter class.
	 * @param args not used
	 */
	public static void main(String[] args) {
		Greeter greeter = new Greeter("Dave");
		greeter.sayHello();
		greeter.sayGoodbye();
		greeter.refuseHelp();
	}

}
