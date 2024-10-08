/**
 * 
 */
package Collection_framwork;

import java.util.HashSet;

/**
 * @author srinidhi.k
 *
 */
public class Intersectionofarrays {

	
	public static void main(String[] args) {
		
		
		int arr1[] = {7,3,9};
		int arr2[] = {6,3,9,2,9,4};
        
		
		intersection(arr1 , arr2);
	}

	private static void intersection(int[] arr1, int[] arr2) {
		HashSet<Integer> hs = new HashSet<>();
		
		
		int count=0;
		for(int i =0 ; i<arr1.length ; i++) {
			hs.add(arr1[i]);
		}
		for(int j =0 ; j<arr2.length ; j++) {
			if(hs.contains(arr2[j])) {
				count++;
				hs.remove(arr2[j]);
			}
			
		}
		
		System.out.println(count);
		
		
		
	}

}
