package chapter3.exercises;

/**
 * A student has a name and a total quiz score
 */
public class Student {

	private String name;
	private int scoreTotal;
	private int number;
	
	/**
	 * Constructs a student with the given name.
	 * @param nameStudent
	 */
	public Student(String nameStudent) {
		name = nameStudent;
	}
	
	/**
	 * Gets the student's name.
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Adds the quiz's score to the total score
	 * @param score
	 */
	public void addScore(int score) {
		scoreTotal = scoreTotal + score;
		number += 1;
	}
	
	/**
	 * Gets the total score.
	 * @return the total score
	 */
	public int getTotalScore() {
		return scoreTotal;
	}
	
	/**
	 * Computes and returns the average score.
	 * @return the average score
	 */
	public int getAverageScore() {
		int average = scoreTotal / number;
		return average;
	}
}
