package chapter3.exercises;

/**
 * A class to test Employee.
 * @author xuelan
 */
public class EmployeeTester {

	/**
	 * Tests the methods of the Employee class.
	 * @param args not used
	 */
	public static void main(String[] args) {
		Employee harry = new Employee("Hacker Harry", 5000);
		harry.raiseSalary(10);
		double salary = harry.getSalary();
		
		System.out.println(salary);
		System.out.println("The expected: 5500");
	}

}
