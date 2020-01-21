package chapter3.exercises;

/**
 * A printer which can print the entire text of the letter.
 * @author xuelan
 */
public class LetterPrinter {

	/**
	 * Prints the letter from Mary to John.
	 * @param args not used
	 */
	public static void main(String[] args) {
		Letter letter = new Letter("Mary", "John");
		
		letter.addLine("I am sorry we must part.");
		letter.addLine("I wish you all the best.");
		
		String text = letter.getText();

		System.out.println(text);
	}
}
