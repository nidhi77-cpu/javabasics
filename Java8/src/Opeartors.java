import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Opeartors {

	
	public static void main(String[] args) {
	
		UnaryOperator<Integer>unn = x-> x*x;
		System.out.println(unn.apply(2));
	//	
	//	BinaryOperator<Integer> bnn = s -> s*s;
	}

}
