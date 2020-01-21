package chapter3.exercises;

/**
 * A product has a name and a price which can be changed.
 * @author xuelan
 */
public class Product {

	private String name;
	private double price;
	
	/**
	 * Constructs a new product with a given name and price.
	 * @param nameProduct the name of the product
	 * @param priceProduct the price of the product
	 */
	public Product(String nameProduct, double priceProduct) {
		name = nameProduct;
		price = priceProduct;
	}
	
	/**
	 * Reduces the price by a certain amount.
	 * @param amount amount of reduction
	 */
	public void reducePrice(double amount) {
		price = price - amount;
	}
	
	/**
	 * Gets the name of the product.
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the price pf the product.
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
}
