package chapter3.exercises;

/**
 * A moth can fly towards the postion of the light.
 * @author xuelan
 */
public class Moth {

	private double position;
	
	/**
	 * Constructs a moth with an initial position
	 * @param initialPosition the initial position
	 */
	public Moth(double initialPosition) {
		position = initialPosition;
	}
	
	/**
	 * Moves the moth towards the light by the half distance bwtween the moth and the light.
	 * @param lightPosition the position of the light
	 */
	public void moveToLight(double lightPosition) {
		position = (position + lightPosition) / 2;
	}
	
	/**
	 * Gets the current position of the moth.
	 * @return the current position
	 */
	public double getPosition() {
		return position;
	}
}
