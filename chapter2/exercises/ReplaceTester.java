package chapter2.exercises;

public class ReplaceTester {

	public static void main(String[] args) {
		String message = "Mississippi";
		message = message.replace("i", "!");
		message = message.replace("s", "$");
		System.out.println("The expected result is M!$$!$$!pp!");
		System.out.println("The actual result is " + message);
	
	}

}
