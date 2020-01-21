package chapter3.exercises;

/**
 * A bug wuth an intial postition can be moved along a horizontal line.
 * @author xuelan
 */
public class Bug {

	private int position;
	
	/**
	 * Constructs a bug with a given position.
	 * @param initialPosition the position where the bug at in the first place
	 */
	public Bug(int initialPosition) {
		position = initialPosition;
	}
	
	/**
	 * Moves the bug by one unit.
	 */
	public void move() {
		position += 1;
	}
	
	/**
	 * Turns the bug around.
	 */
	public void turn() {
		position = position * (-1);
	}
	
	/**
	 * Gets the current position of the bug.
	 * @return the final position
	 */
	public int getPosition() {
		return position;
	}
	
}
