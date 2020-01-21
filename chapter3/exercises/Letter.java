package chapter3.exercises;

/**
 * A letter has the sender's name, the recipient's name and the content which can be read and modified.
 * @author xuelan
 */
public class Letter {

	private String sender;
	private String recipient;
	private String content;
	
	/**
	 * Constructs a letter with the given sender and recipient.
	 * @param from the sender's name
	 * @param to the recipient's name
	 */
	public Letter(String from, String to) {
		sender = from;
		recipient = to;
		content = "";
	}
	
	/**
	 * Writes contents in the letter.
	 * @param line one of the lines of the contents
	 */
	public void addLine(String line) {
		//content =  content + "\n" + line;
		content = content.concat(line + "\n");
	}
	
	/**
	 * Gets the entire text of the letter.
	 * @return text the text of the letter
	 */
	public String getText() {
		String letter = "Dear " + recipient + " :\n\n";
		letter = letter + content + "\n";
		letter = letter + "Sincerely," + "\n\nMary";
		return letter;
	}
}
