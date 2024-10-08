/**
 * 
 */
package Collection_framwork;

import java.util.HashMap;

/**
 * @author srinidhi.k
 *
 */
public class Hashings {
  // in has map : keys will be always unqiue stuff bro //
	
	public static void main(String[] args) {
		// to find the majority of elements//
      int num[] = {1,3,2,5,1,3,1,5,1};
       majorityelement(num);
       
	}

	private static void majorityelement(int num[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i =0 ; i<num.length; i++) {
			if(map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i])+1 );
				
			}
			else
			{
				map.put(num[i], 1);
			}
		}
		
		for(int key : map.keySet()) {
			if(map.get(key)> num.length/3){
					System.out.println(key);
			}
		}
		
	}

}
