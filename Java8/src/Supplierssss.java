import java.util.function.Supplier;

/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Supplierssss {

	
	public static void main(String[] args) {
		
		
		Supplier<String> supplier = () ->
		{
			
			return "nidhi";
		};
		
		System.out.println(supplier.get());

	}

}
