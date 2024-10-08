/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */

import java.util.*;
import java.util.Collections;
public class LinkedListss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
		Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.*/

		LinkedList<Integer> ls = new LinkedList<>();
		  ls.add(10);
		  ls.add(25);
		  ls.add(37);
		  ls.add(43);
		  ls.add(38);
		  ls.add(22);
		  ls.add(43);
		  System.out.println(ls);
		for(int i =0 ; i< ls.size() ; i++) {
			/*
			 * if(ls.get(i)==7) { System.out.println(i); }
			 */
			
			if(ls.get(i)>25) {
				ls.remove(i);
			}
		}
		System.out.println(ls);

}
}
