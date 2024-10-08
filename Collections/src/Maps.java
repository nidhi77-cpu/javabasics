/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
import java.util.*;
public class Maps {

	public static void main(String[] args) {

		  Map<String, Integer> m = new HashMap<String, Integer>();
       
		  
		  for(String a : args)
		  {
			  Integer i = m.get(a);
			  
			  m.put(a , i==null ? 1 : i+1);
		  }
	
	}
}
