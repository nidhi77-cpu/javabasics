/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
import java.util.*;
public class Functions {

	public static void  factorialnumber(int number)
	{
		int factorial =1;
		for(int i = number ; i>=1 ; i--)
			{
			
			factorial = factorial*i;
			  
			}
		System.out.println(factorial);
		
	}
	
	public static void evenoroddnumber(int number)
	{
		
			if(number%2==0)
			{
				System.out.println("number is  even number"+ number);
			}
			else
			{
				System.out.println("the numbe ris odd number" +number);
			}
		
	}
	
	
	
	public static void primenumber(int num)
	{
		boolean isprime = true;
		
		for(int i =2; i<= num/2 ;i++)
		{
			if(num%i==0)
			{
				isprime = false;
				System.out.println("this is not a prime number"+num);
				break;
			}
			else
			{
				System.out.println("these is prime number" + num);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
		/* int num1 = sc.nextInt(); */
		/*
		 * int num2 = sc.nextInt(); int num3 = sc.nextInt();
		 */
     
   //  factorialnumber(number);
  //   evenoroddnumber(number);
   //  primenumber(num);
//	sumofallnumbers(num); /*---->>> logic is still missing */
	//sumofalloddnumber(num);
    // countofnumber(num , num1 , num2 , num3);
    // exponentianl(num , num1);
    // gcd(num, num1);
     fibanociseries(num);
     
     
	}

	public static void fibanociseries(int num) {
		int a =0;
		int b =1;
		
		int c;
		for(int i= 2; i<= num ; i++)
		{
			c = a+b;
			System.out.println(c);
			a = b;
			System.out.println(a);
			b=c;
			System.out.println(b);
		}
		
		
	}

	public static void gcd(int num, int num1) {
		int gcd = 0;
		for(int i =1 ; i<= num && i <= num1 ; i++)
		{
			if(num % i == 0 && num1 % i == 0 )
			{
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

	public static int exponentianl(int num, int num1) {
		int result;
		
		result = Math.multiplyExact(num, num1);
		
		System.out.println(result);
		return result;
		
	}

	public static void countofnumber(int num , int num1 , int num2 , int num3) {
	
		if(num >0 | num1>0 | num2> 0 | num3>0)
		{
			System.out.println("this all nubers i spotive guys enjayy");
		}
		
	}

	public  static void sumofallnumbers(int num) {
	 
		int number=0;
		for(int i =1; i<=num ; i++) {
			
			number = number+i;
			
		}
		System.out.println(number);
			
	}
	public  static void sumofalloddnumber(int num) {
		 
		int number=0;
		for(int i =1; i<=num ; i++) {
			if(i%2  !=0)
			{
				number = number+i;
			}
			
			
		}
		System.out.println(number);
			
	}

}