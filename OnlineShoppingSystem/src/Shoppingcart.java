
/**
 * 
 */
import java.util.*;

/**
 * @author srinidhi.k
 *
 */
public class Shoppingcart {

	public Shoppingcart(List<Product> products) {
		super();
		this.products = products;
	}

	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	// Method to add a product to the shopping cart
	public void addProduct(Product product) {
		products.add(product);
	}

	// Method to remove a product from the shopping cart
	public void removeProduct(Product product) {
		products.remove(product);
	}

}
