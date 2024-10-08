import java.util.Scanner;

// how to copy one string to another string:

public class CopyString {
	
	public static void main(String [] args)
	{
		
		String s = "nidhi";
		
		char [] arr = s.toCharArray();
		
	    int size = arr.length;
	    
	   char [] arr2 = new char[size];
	   
	  
	   int i=0;
	   
	   while(i <  size)
	   { 
		   
		   
		   arr2[i] = arr[i];
		   i++;
	   }
	   
	   System.out.println(arr2);
	   
	    
	}
	    

}
