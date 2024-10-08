/**
 * 
 */
package Collection_framwork;

import java.util.HashMap;

/**
 * @author srinidhi.k
 *
 */
public class Iternatyfromtickets {

	
	public static void main(String[] args) {
		
		HashMap<String, String> tickets = new HashMap<>();
		
		tickets.put("Chennai", "bangalore");
		tickets.put("Mumbai", "Delhi");
		tickets.put("Goa", "Chennai");
		tickets.put("Delhi", "Goa");
		
		String start = getstart(tickets);
		
		while(tickets.containsKey(start)) {
			System.out.println(start);
			start = tickets.get(start);
		}
		
		
		System.out.println(start);
		

	}

	private static String getstart(HashMap<String, String> tick) {
		
		HashMap<String, String> revmap = new HashMap<>();
		
		for(String key : tick.keySet()) {
			revmap.put(tick.get(key) , key );
		}
		
		
		for(String key : tick.keySet()) {
			if(!revmap.containsKey(key)) {
				return key;
			}
		}
		
		return null;
		
		
		
	}

}
