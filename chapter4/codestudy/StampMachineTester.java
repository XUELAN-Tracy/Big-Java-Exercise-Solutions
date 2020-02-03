package chapter4.codestudy;

/**
 * A class to test StampMachine.
 * @author xuelan
 */
public class StampMachineTester {

	/**
     * Tests the methods of the StampMachine class.
     * @param args not used
     */
	public static void main(String[] args) {
		
		StampMachine machine = new StampMachine();
		machine.insert(1);
		System.out.println("First class stamps: " + machine.giveFirstClassStamps());
		System.out.println("The expected: 2");
		System.out.println("Penny Stamps: " + machine.givePennyStamps());
		System.out.println("The expected: 12");
	}
}
