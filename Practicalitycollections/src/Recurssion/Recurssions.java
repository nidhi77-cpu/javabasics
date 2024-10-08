/**
 * 
 */
package Recurssion;

/**
 * @author srinidhi.k
 *
 */
public class Recurssions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// writing for the recrussion //
		// print the numbers from 1-5
		// printNumbers(1);
		 
		// sumofNaturalNumbers(1,5,0);
		//factorialofNumbers(5);
		/*
		 * int a =0; int b =1 ; int c = a+b; System.out.println(c); int n =7;
		 * fibannociSeries(a,b,n-2);
		 */
		// it is good have these logic in mind//
		//towerofHonnai(2, "S" ,"H", "D");
		
		/*
		 * String name = "nidhi"; revereString(name , name.length()-1);
		 */
		int x = 2 , n=5;
		int out = exponentinal(2,5);
		System.out.println(out);
		

	}

	private static int exponentinal(int x, int n) {
		
		if(n==0) {
			return 1;
		}
		
		
	int x1 = exponentinal(x, n-1);
	int  xn = x*x1;
	return xn;
    
		
		
	}

	private static void revereString(String name, int i) {
		 if(i==0) {
			 System.out.println(name.charAt(i));
			 return;
		 }
		 System.out.println(name.charAt(i));
		revereString(name, i-1);
		
		
		 
	}

	private static void towerofHonnai(int n, String src ,String helper , String dest) {
	  if(n==1) {
		  System.out.println("transfer disk from"+ n +"from"+src+"to"+dest);
		  return;
	  }
	  towerofHonnai(n-1, src, dest, helper);
	  System.out.println("transfer disk from"+ n +"from"+src+"to"+dest);
	  towerofHonnai(n-1, helper, src, dest);
		
	}

	private static void fibannociSeries(int a, int b, int n) {

		if (n == 0) {
			return;
		}

		int c = a + b;
		System.out.println(c);
		fibannociSeries(b, c, n - 1);

	}

	private static int factorialofNumbers(int n) {

		if (n == 1) {
			return 1;
		}
		int facnm1 = factorialofNumbers(n - 1);
		int facortial = n * facnm1;
        
		
		System.out.println(facortial);
		return facortial;

	}

	private static void sumofNaturalNumbers(int i , int n , int sum) {
		
		
		if(i==n) {
			sum = sum+i;
			System.out.println(sum);
			return;
		}
		
		sum = sum+i;
		sumofNaturalNumbers(i+1, n, sum);
		
	}

	private static void printNumbers(int number) {
		
		if(number==5) {
			return;
		}
		System.out.println(number);
		printNumbers(number+1);
		
		
	}

}
