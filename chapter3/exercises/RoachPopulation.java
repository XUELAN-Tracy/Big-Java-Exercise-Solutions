package chapter3.exercises;

/**
 * A roach population which can be increased by breeding and reduced by insecticide.
 * @author xuelan
 */
public class RoachPopulation {
	
	private int size;
	
	/**
	 * Construcs a roach population with an initial size.
	 * @param initialSize the initial size of the population
	 */
	public RoachPopulation(int initialSize) {
		size = initialSize;
	}
	
	/**
	 * Doubles the size of the population by breeding.
	 */
	public void breed() {
		size = size * 2;
	}
	
	/**
	 * Reduce the size of population by 10% with insecticide.
	 */
	public void spray() {
		size = (int) (size * 0.9);
	}
	
	/**
	 * Gets the size of population.
	 * @return the number of roaches
	 */
	public int getRoaches() {
		return size;
	}
}
