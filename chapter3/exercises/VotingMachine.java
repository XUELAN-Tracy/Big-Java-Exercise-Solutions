package chapter3.exercises;

import java.util.*;

/**
 * A voting machine which can be used to vote for Democraf and Republican.
 * @author xuelan
 */
public class VotingMachine {
    
	private int voteDemo;
	private int voteRepu;
	
	/**
	 * Constructs a new machine with zero point for two parties.
	 */
	public VotingMachine() {
		voteDemo = 0;
		voteRepu = 0;
	}
	
	/**
	 * Adds credits to Democrat according to the voting time
	 */
	public void voteDemocrat() {
		voteDemo += 1;
	}
	
	/**
	 * Adds credits to Republican according to the voting time
	 */
	public void voteRepublican() {
        voteRepu += 1;
	}
	
	/**
	 * Gets the current credits of Democrat.
	 * @return the total votes for Democrat
	 */
	public int getDemo() {
		return voteDemo;
	}
	
	/**
	 * Gets the current credits of Republican.
	 * @return the total votes for republican
	 */
	public int getRepu() {
		return voteRepu;
	}
	
	/**
	 * Determines if the voting time is in the special period.
	 * @return true or false
	 */
	public boolean isSpecial(GregorianCalendar time) {
		// Gets the date
		int date = time.get(Calendar.DAY_OF_MONTH);
		// Gets the month
		int month = time.get(Calendar.MONTH);
		// Gets the day of the week, SUNDAY==1, MONDAY==2...
		int day = time.get(Calendar.DAY_OF_WEEK);
        int hour = time.get(Calendar.HOUR_OF_DAY);
        
        if (month == 10) {
        	if (date <8 && day == 3) {
        		if (hour >=20) {
        			return true;
        		}
        	}
        }
        return false;
	}
	
	/**
	 * Get the selection result.
	 * @return the result
	 */
	public String getResult() {
		String result = "";
		GregorianCalendar tallyTime = new GregorianCalendar();
		// GregorianCalendar cheatTime = new GregorianCalendar(2014,10,4,21,50);
		if (isSpecial(tallyTime) == true) {
			result = result + "The tally time is: " + tallyTime.getTime()
				     + "\nThe votes for Democrat: " + voteDemo
				     + "\nThe votes for Republican: " + voteRepu
				     + "\nThe final winner is Demorat!"
				     + "\nBecasau the votes are tallied after 8 P.M. on the first Tuesday in November";
		} else if (voteDemo > voteRepu) {
			result = result + "The tally time is: " + tallyTime.getTime()
					 + "\nThe votes for Democrat: " + voteDemo
				     + "\nThe votes for Republican: " + voteRepu
					 + "\nThe final winner is Democrat!";
		} else if (voteDemo < voteRepu) {
			result = result + "The tally time is: " + tallyTime.getTime()
					 + "\nThe votes for Democrat: " + voteDemo
					 + "\nThe votes for Republican: " + voteRepu
					 + "\nThe final winner is Republican!";
		} else {
			result = result +"The tally time is: " + tallyTime.getTime()
			         + "\nThe votes for Democrat: " + voteDemo
			         + "\nThe votes for Republican: " + voteRepu
					 + "\nThe votes for two parties are equal.";
		}
		return result;
	}
	
	/**
	 * Resets the machine.
	 */
	public void reset() {
		voteDemo = 0;
		voteRepu = 0;
	}
}
