/**
 * 
 */
import java.util.*;
/**
 * @author srinidhi.k
 *
 */
public class Loopproblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		/*
		 * int n = 10; // printing for the even number // for(int i=1; i<=n ; i++) {
		 * if(i%2==0) { System.out.println(i); } }
		 */
	//
	// 1 or 0  //
		
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	/*
	int marks = sc.nextInt();
	
	
 
     do 
     {
    	 
    	
    	if(marks>=90)
    		{
    			System.out.println(" this is good");
    		}
    	else if(marks>=70 )
    	{
    		System.out.println(" this is good as well");
    	}
    	else if(marks>=60 )
    	{
    		System.out.println(" this is good as well");
    	}
    	
     }while(a==1);
		
		// do - while loop //
		
	}*/
	
	
	// writing the program for prime numbers //
	//first 5 prime numbers are 2, 3, 5, 7, and 11.//
      boolean iprime = true;
	for(int  i = 2 ; i<=a/2 ; i++)
	{
		if(a%i==0)
		{
			iprime = false;
			break;
		}
		
		
	}
	
	if(iprime)
	{
		System.out.println("this is prime number boss");
	}
	
	else
	{
		System.out.println("this is not  prime number boss");
	}
	
	
	}

}