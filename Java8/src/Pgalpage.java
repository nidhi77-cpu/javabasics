/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
import java.util.*;
public class Pgalpage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// set -- Tree set is used for automatic sorting //
		Set<Integer> s = new TreeSet<>();
		s.add(23);
		s.add(21);
		s.add(50);
		
		System.out.println("before java 8"+s);
		
		Set<Integer> s1 = new TreeSet<>((a, b) -> a-b);
		s1.add(23);
		s1.add(21);
		s1.add(50);
		
		System.out.println("after java 8"+s1);

	}

}
