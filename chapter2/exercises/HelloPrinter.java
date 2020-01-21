package chapter2.exercises;

public class HelloPrinter {

	public static void main(String[] args) {
		String greeting = "Hello, World!";
		
		greeting = greeting.replace("e", "@");
		greeting = greeting.replace("o", "$");
		greeting = greeting.replace("@", "o");
		greeting = greeting.replace("$", "e");
		System.out.println(greeting);
		
	}

}
