package chapter3.exercises;

/**
 * A class which simulates a population with 10 roaches.
 * @author xuelan
 */
public class RoachSimulation {

	public static void main(String[] args) {
		RoachPopulation roaches = new RoachPopulation(10);
		roaches.breed();
		roaches.spray();
		System.out.println("The number of roaches is: " + roaches.getRoaches());
		System.out.println("The expected: 18");
		
		roaches.breed();
		roaches.spray();
		System.out.println("\nThe number of roaches is: " + roaches.getRoaches());
		System.out.println("The expected: 32");
		
		roaches.breed();
		roaches.spray();
		System.out.println("\nThe number of roaches is: " + roaches.getRoaches());
		System.out.println("The expected: 57");
	}
}
