package chapter3.exercises;

/**
 * A class constructs two products and manages their prices.
 * @author xuelan
 */
public class ProductPrinter {

	/**
	 * Prints the names and prices of these two products, then reduces their prices by $5.00 and print them agin.
	 * @param args not used
	 */
	public static void main(String[] args) {
		Product ipad = new Product("iPad", 3000);
		Product mac = new Product("Mac", 20000);
		
		System.out.println("Product1: "+ ipad.getName() + "\t"+ ipad.getPrice());
		System.out.println("Product2: "+ mac.getName() + "\t" + mac.getPrice());
		
		ipad.reducePrice(5);
		mac.reducePrice(5);
		
		System.out.println("\nafter the sale----");
		System.out.println("Product1: "+ ipad.getName() + "\t" + ipad.getPrice());
		System.out.println("Product2: "+ mac.getName() + "\t" + mac.getPrice());
	}
}
