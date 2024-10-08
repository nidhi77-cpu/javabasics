/**
 * 
 */
package Collection_framwork;

import java.util.HashSet;

/**
 * @author srinidhi.k
 *
 */
public class Uniontwoarays {

	
	public static void main(String[] args) {
		//  checking method of 2 union arrays //
		int arr1[] = {7,3,9};
		int arr2[] = {6,3,9,2,9,4};
		
		union(arr1, arr2);

	}

	private static void union(int[] arr1, int[] arr2) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i =0 ; i<arr1.length ; i++) {
			hs.add(arr1[i]);
		}
		for(int j =0 ; j<arr2.length ; j++) {
			hs.add(arr2[j]);
		}
		
		System.out.println(hs.size());
	   
		
		
	}

}
