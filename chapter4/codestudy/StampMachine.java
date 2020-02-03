package chapter4.codestudy;

/**
 * @author LanXue
 */
public class StampMachine {

	public static final double FIRST_CLASS_STAMP_PRICE = 44;
	private int balance;
	
	/**
	 * Constructs a stamp machine with balance 0.
	 */
	public StampMachine() {
		balance = 0;
	}
	
	/**
	 * Records the received dollars and converts it into cents.
	 * @param dollars the receved money
	 */
	public void insert(int dollars) {
		balance = balance + dollars * 100;
	}
	
	/**
	 * Computes the number of stamps which should be given.
	 * @return the number of stamps
	 */
	public int giveFirstClassStamps() {
		int firstClassStamps = (int) (balance / FIRST_CLASS_STAMP_PRICE);
		balance = (int) (balance - firstClassStamps * FIRST_CLASS_STAMP_PRICE);
		return firstClassStamps;
	}
	
	/**
	 * Computes the number of penny stamps.
	 * @return the number of penny stamps that should be given
	 */
	public int givePennyStamps() {
		int pennyStamps = balance;
		balance = 0;
		return pennyStamps;
	}
}
