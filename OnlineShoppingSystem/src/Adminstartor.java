/**
 * 
 */
import java.util.*;
/**
 * @author srinidhi.k
 *
 */
public class Adminstartor extends User {

	private List<Product> adminProducts;

	public List<Product> getAdminProducts() {
		return adminProducts;
	}

	public void setAdminProducts(List<Product> adminProducts) {
		this.adminProducts = adminProducts;
	}

	public List<User> getAdminUsers() {
		return adminUsers;
	}

	public void setAdminUsers(List<User> adminUsers) {
		this.adminUsers = adminUsers;
	}

	public Adminstartor(List<Product> adminProducts, List<User> adminUsers) {
		super();
		this.adminProducts = adminProducts;
		this.adminUsers = adminUsers;
	}

	private List<User> adminUsers;
	
	  // Methods to manage products
    public void addProduct(Product product) {
        adminProducts.add(product);
    }

    public void removeProduct(Product product) {
        adminProducts.remove(product);
    }

    // Methods to manage user accounts
    public void addUser(User user) {
        adminUsers.add(user);
    }

    public void removeUser(User user) {
        adminUsers.remove(user);
    }


}
