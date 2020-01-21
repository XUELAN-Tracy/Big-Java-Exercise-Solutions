package chapter3.exercises;

/**
 * A class to test Student.
 * @author xuelan
 */
public class StudentTester {
	
    /**
     * To test the methods of Student class.
     * @param args not used
     */
	public static void main(String[] args) {
		Student tracy = new Student("Tracy");
		
		tracy.addScore(90);
		tracy.addScore(96);
		
		String name = tracy.getName();
		int score = tracy.getTotalScore();
		int average = tracy.getAverageScore();
		
		System.out.println("The name of student is: " + name);
		System.out.println("The total score is: " + score);
		System.out.println("The average score is: " + average);
		
		System.out.println("The expected: Tracy, 186, 93");
	}

}
