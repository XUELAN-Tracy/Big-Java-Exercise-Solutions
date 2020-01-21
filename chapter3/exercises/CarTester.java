package chapter3.exercises;

/**
 * A class to test Car.
 * @author xuelan
 */
public class CarTester {
    /**
     * Tests the methods of Car class.
     * @param args not used
     */
	public static void main(String[] args) {
		Car myHybrid = new Car(50);
		myHybrid.addGas(20);
		myHybrid.drive(100);
		double gasLeft = myHybrid.getGasInTank();
		
		System.out.println(gasLeft);
		System.out.println("The expected: 18");

	}

}
