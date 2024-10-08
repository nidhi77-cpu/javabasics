/**
 * 
 */
package Collection_framwork;
import java.util.*;

/**
 * @author srinidhi.k
 *
 */
public class HashSetss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 HashSet<Integer> hs = new HashSet<>();
		 // add element //
		 hs.add(1);
		 hs.add(2);
		 hs.add(3);
		 hs.add(4);
		 
		 // size//
		 hs.size();
		 
		 //search//
		 if(hs.contains(4)){
			 System.out.println("it is present paa");
		 }
		 else {
			 System.out.println("it is not present kotiis");
		 }
		 
		 // Iteration //
		 
		 Iterator<Integer> it = hs.iterator();
		 // iteratot has 2 types ----> has next  and next() ----->>>
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		
		 
	}

}
