/**
 * 
 */
import java.util.*;
/**
 * @author srinidhi.k
 *
 */
public class Order {

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	private List<Product> products;

	public Order(List<Product> products, double totalAmount) {
		super();
		this.products = products;
		this.totalAmount = totalAmount;
	}

	private double totalAmount;
	
	  // Method to calculate the total amount of the order
    private void calculateTotalAmount() {
        totalAmount = 0.0;
        for (Product product : products) {
            totalAmount += product.getPrice();
        }
    }

}
