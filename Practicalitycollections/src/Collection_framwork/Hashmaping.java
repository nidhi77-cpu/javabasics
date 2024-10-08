/**
 * 
 */
package Collection_framwork;
import java.util.*;

/**
 * @author srinidhi.k
 *
 */
public class Hashmaping {

	
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map  = new HashMap<>();
		// adding //
		map.put(1, "nidhi");
		map.put(2, "hari");
		map.put(3, "pagalla");
		map.put(4, "kkssosos");
		
		System.out.println(map);
		
		// searching//
		if(map.containsKey(1) && map.containsKey(2)) {
			System.out.println("these key is present");
		}
		else
		{
			System.out.println(" there is no key which u are specifiying");
		}
		
		map.get(1);
		map.get(2);
		map.get(3);
		
		// Iteartion stuffs //
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			m.getKey();
			m.getValue();
		}

	}

}
