package chapter3.exercises;

/**
 * A car has a certain fuel efficiency which can be changed with travelling miles.
 * @author xuelan
 */
public class Car {

	private int efficiency;
	private double fuel;
	
	/**
	 * Constructs a car with a given fuel efficiency.
	 * @param fuelEfficency the fuel will be used per miles
	 */
	public Car(int fuelEfficiency) {
		efficiency = fuelEfficiency;
	}
	
	/**
	 * Adds a certain amount of fuel.
	 * @param amount the amount of fuel
	 */
	public void addGas(int amount) {
		fuel = fuel + amount;
	}
	
	/**
	 * Drives the car for a certain miles and reduces the amount of fuel according to the efficiency.
	 * @param miles the distance of driving
	 */
	public void drive(int miles) {
		fuel = fuel - miles/50;
	}
	
	/**
	 * Gets the left fuel.
	 * @return the left fuel in the tank
	 */
	public double getGasInTank() {
		return fuel;
	}
}
