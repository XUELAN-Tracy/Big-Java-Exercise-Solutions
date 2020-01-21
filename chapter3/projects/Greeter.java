package chapter3.projects;

/**
 * A greeter which can say "Hello" to you.
 * @author xuelan
 */
public class Greeter {

	private String name;
	
	/**
	 * Construct a greeter with a given name.
	 * @param name the name of the person whom you will say "hello" to
	 */	
	public Greeter(String name) {
		this.name = name;
	}
	
	/**
	 * A method to say hello.
	 */
	public void sayHello() {
		System.out.println("Hello, " + name);
	}
	
	/**
	 * A method to say goodbye.
	 */
	public void sayGoodbye() {
		System.out.println("Goodbye, " + name);
	}
	
	public void refuseHelp() {
		System.out.println("I am sorry, " + name +". I am afraid I can't do that.");
	}
	
	
}
