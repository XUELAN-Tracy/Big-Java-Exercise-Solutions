package chapter3.exercises;

/**
 * An employee has a certain salary which can be raised.
 * @author xuelan
 */
public class Employee {

	private String name;
	private double salary;
	
	/**
	 * Constructs an employee with name, current salary.
	 * @param employeeName the name of the employee
	 * @param currentSalary the employee's salary
	 */
	public Employee(String employeeName, double currentSalary) {
		name = employeeName;
		salary = currentSalary;
	}
	
	/**
	 * Gets the employee's current salary.
	 * @return the employee's salary
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * Raise the employee's salary by exact percents.
	 * @param byPercent the extent of salary increase
	 */
	public void raiseSalary(double byPercent) {
		salary = salary + salary*(byPercent/100);
	}
}
