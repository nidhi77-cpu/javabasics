
/**
 * 
 */
import java.util.*;

/**
 * @author srinidhi.k
 *
 */
public class OnlineShoppingMainMethod {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		User userManager = new User(null, null, null, null);
		Product productManager = new Product(null, 0, null, null);
		Shoppingcart shoppingCartManager = new Shoppingcart(null);
		Order orderManager = new Order(null, 0);
		Adminstartor administrator = new Adminstartor(null, null);
	}

}
