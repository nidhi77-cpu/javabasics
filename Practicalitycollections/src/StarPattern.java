
/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */

import java.util.*;

public class StarPattern {
	public static void main(String[] args) {
		/*
		 * // to do the calculation // Scanner sc = new Scanner (System.in); int a =
		 * sc.nextInt(); int b = sc.nextInt();
		 * 
		 * int n=1;
		 * 
		 * switch(n) { case 1 : System.out.println(a+b); break; case 2 :
		 * System.out.println(a-b); break; case 3 : System.out.println(a*b); break; case
		 * 4 : System.out.println(a/b); break; case 5 : System.out.println(a%b); break;
		 * default : System.out.println("comedy nothing is working"); break;
		 * 
		 * }
		 */
		/*
		 * // to calclate some othe rproblem //
		 * 
		 * 
		 * Scanner sc = new Scanner (System.in); int number = sc.nextInt();
		 * 
		 * 
		 * 
		 * switch(number) { case 1 : System.out.println("Jan"); break; case 2 :
		 * System.out.println("Feb"); break; case 3 : System.out.println("mar"); break;
		 * case 4 : System.out.println("april"); break; case 5 :
		 * System.out.println("may"); break; default :
		 * System.out.println("comedy nothing is working"); break;
		 * 
		 * 
		 * 
		 * }
		 */
		// nested loops //

		int n = 5;

		/*
		 * for(int i=1; i<=n ; i++) { for( int j =1; j<=n ; j++) { if(i==1|| i==n ||
		 * j==1 ||j==n) { System.out.print("*"); } else { System.out.print(" "); } }
		 * System.out.println(); }
		 */
		int number = 1;
		// rombus problem //
	//	for (int i = n; i >= 1; i--) {
			/*
			 * 
			 * 
			 * for(int j =1; j<=n-i ; j++) { System.out.print(" "); }
			 * 
			 * for (int j = 1; j <= n - (n - i); j++) { System.out.print(" "); }
			 * 
			 * for (int j = 1; j <= n; j++) {
			 * 
			 * System.out.print(number+ " "); number++;
			 * 
			 * // always remeber the java will not allow the bodmas rule // first prefernce
			 * given to parentesiis boss // z
			 * 
			 * if( (i+j) % 2 ==0) { System.out.print("1 "); } else { System.out.print("0 ");
			 * }
			 * 
			 * 
			 * System.out.print("* ");
			 * 
			 * } for (int j = 1; j <= n - i; j++) { System.out.print(" "); }
			 * 
			 * System.out.println();
		//	 */
		// ending of rombis problem

		// starting of some random number s//

		/*
		 * for (int i = 1; i <= n; i++) {
		 * 
		 * 
		 * for (int j = 1; j <= n-i; j++) {
		 * 
		 * System.out.print(" ");
		 * 
		 * } for (int j = i; j >= 1; j--) {
		 * 
		 * System.out.print(j);
		 * 
		 * } for (int j = 2; j <= i; j++) {
		 * 
		 * System.out.print(j);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * System.out.println(); }
		 */
		
		/*
		 * // butterfly program // // first part : for(int i =1 ; i<=n ; i++) { // for
		 * counting first * // for (int j = 1; j <= i; j++) { System.out.print("*"); }
		 * // counting for spaces // for (int j = 1; j <= n - i; j++) {
		 * System.out.print(" "); }
		 * 
		 * // counting for spaces again // for (int j = 1; j <= n - i; j++) {
		 * System.out.print(" "); } // for counting first * // for (int j = 1; j <= i;
		 * j++) { System.out.print("*"); } System.out.println(); }
		 * 
		 * //butterfly program secomd part // for(int i =n ; i>=1 ; i--) { // for
		 * counting first * // for (int j = 1; j <= i; j++) { System.out.print("*"); }
		 * // counting for spaces // for (int j = 1; j <= n - i; j++) {
		 * System.out.print(" "); }
		 * 
		 * // counting for spaces again // for (int j = 1; j <= n - i; j++) {
		 * System.out.print(" "); } // for counting first * // for (int j = 1; j <= i;
		 * j++) { System.out.print("*"); } System.out.println(); }
		 */
		
		// rhobus program// first part //
		
		for(int i =1 ; i <= n ; i++)
		{
			for(int j =1 ; j <=n-i ; j++)
			{
			  System.out.print(" ");
			}
			for(int j =1 ; j <=i ; j++)
			{
			  System.out.print("*");
			}
			for(int j =2 ; j <=i ; j++)
			{
			  System.out.print("*");
			}
			for(int j =1 ; j <=n-i ; j++)
			{
			  System.out.print(" ");
			}
			System.out.println();
		}
		
		// rhobus program// second part //
		for(int i =n ; i >=1 ; i--)
		{
			for(int j =1 ; j <=n-i ; j++)
			{
			  System.out.print(" ");
			}
			for(int j =1 ; j <=i ; j++)
			{
			  System.out.print("*");
			}
			for(int j =2 ; j <=i ; j++)
			{
			  System.out.print("*");
			}
			for(int j =1 ; j <=n-i ; j++)
			{
			  System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}