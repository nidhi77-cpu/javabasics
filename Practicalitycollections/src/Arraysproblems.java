import java.util.Scanner;

public class Arraysproblems {

	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		int[] a = new int[size];
//
//		// input for 2 d arrays //
//
//		int c[][] = new int[2][3];
//
//		// input for 2 d arrys//
//
//		for (int i = 0; i < size; i++) {
//			for (int j = 0; j < c.length - 1; i++) {
//				c[i][j] = sc.nextInt();
//			}
//		}
//
//		/*
//		 * // input for (int i = 0; i < size; i++) { a[i] = sc.nextInt(); }
//		 * 
//		 * 
//		 * 
//		 * 
//		 * int min = Integer.MAX_VALUE; int max = Integer.MIN_VALUE;
//		 * 
//		 * // output
//		 * 
//		 * for (int i = 0; i < a.length; i++) { System.out.println(a[i]); if(a[i] < min)
//		 * { min = a[i]; } if(a[i] > max) { max = a[i]; }
//		 * 
//		 * }
//		 * 
//		 * System.out.println("maximum number is" + max);
//		 * System.out.println("min number is" + min);
//		 * 
//		 * 
//		 * //Take an array of names as input from the user and print them on the
//		 * screen//
//		 * 
//		 * 
//		 * 
//		 * // ascending order
//		 * 
//		 * Eg : { 1, 2, 4, 7 } is sorted in ascending order. {3, 4, 6, 2} is not sorted
//		 * in ascending order.
//		 * 
//		 * 
//		 * boolean isAscending = true;
//		 * 
//		 * 
//		 * // we are taking from 0 -->>> n-1// for(int i =0 ; i< a.length-1 ; i++) {
//		 * if(a[i]>a[i+1]) { isAscending = false;
//		 * 
//		 * } } if(isAscending) { System.out.println("these is in ascending order"); }
//		 * else { System.out.println("these is logged in descending order"); }
//		 */
		/*
		 * int c=countYZ("!!day--yaz!!"); System.out.println(c);
		 */
		
		// sorting stuff//
		
		int a[] = {30,20 ,10};
		
		for(int i =0 ; i< a.length ; i++) {
          if(a[i] > a[i+1]) {
        	  int temp = a[i];
        	  a[i] = a[i+1];
        	  a[i+1] = temp;
          }
		}
		
		
		
		
		
	}
	public static int countYZ(String str) {
		  int length = str.length();
		  for (int i = 0; i < length; i++) {
		    if (!Character.isLetter(str.charAt(i))) {
		      str = str.replace(str.charAt(i), ' ');
		      length = length - 1;
		      i--;  // Decrement i to account for removed character
		    }
		  }
		    int count = 0;
		  str = str.toLowerCase();
		  String[] arr = str.split(" ");
		    for (int i = 0; i < arr.length; i++) {
		    
		    if (arr[i].charAt(arr[i].length() - 1) == 'y' || arr[i].charAt(arr[i].length() - 1) == 'z') {
		      count = count + 1;
		    }
		  }
		  return count;
		}



	
}
