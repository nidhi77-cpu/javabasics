/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */

import java.util.*;
public class StringsProblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		String name1 = sc.nextLine();
		
		
		combinedstring(name, name1);

	}

	private static void combinedstring(String name, String name1) {
		int res = 0;
		
		res = name.length() +name1.length();
		return;
		
	}

}
