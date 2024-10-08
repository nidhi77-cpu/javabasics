package Exception;
// the line were the exception comes it goes directly to the catch 
public class Blur {
	
	
	
	public static void main(String [] args)
	{
	try
	{
		int a= 100;
		int b= 0;
		int c;
		c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		
	System.out.println("we cant divide sorry");
	}

}
}
