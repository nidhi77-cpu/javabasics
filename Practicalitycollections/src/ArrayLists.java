/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */


import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	/**
	 * @param args
	 * 
	 * ArrayList<String> as = new ArrayList<>();
	 */
	
	 public static void main(String[] args) {
	        // Creating a generic ArrayList of Strings
	        ArrayList<String> stringList = new ArrayList<>();

	        // Adding elements to the ArrayList
	        stringList.add("Hello");
	        stringList.add("World");

	        // Accessing elements
	        for (String str : stringList) {
	            System.out.println(str);
	        }
	        
	        Collections.sort(stringList);
	    }
		


		

	}

