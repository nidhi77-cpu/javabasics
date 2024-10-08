package understandopps;

import java.util.ArrayList;

public class Firstclass 

{
	int size=5;
	String name = "nidhi";
	String value = "hari";
	public Firstclass(int size, String name, String value)
	{
		// constructors declartions 
		this.size=size;
		this.name = name;
		}
	
	public String naaa()
	{
		return value;
	}
	
	public String haaa()
	{
		return(this.value);
	}
	public Firstclass(Firstclass c)
	{
		System.out.println("copy constructor called");
		size = c.size;
		name = c.name;
		
	}
	@Override
	public String toString()
	{
		return(name);
	}

   public static void main(String[] args)
   {
	 
	   Firstclass f = new Firstclass(5,"nidhi","nirllaa");
	   Firstclass f1 = new Firstclass(f);
	   Firstclass f2 =f1;
			   
	   System.out.println(f.naaa());
	   System.out.println(f.name);
	   System.out.println(f1);
	   System.out.println(f2);
	   // autoboxing 
	   char ch = 'a';
	   Character a = ch;
	   
	   ArrayList <Integer> arraylist = new  ArrayList <Integer>();
	   arraylist.add(25);
	   System.out.println(arraylist.get(0));
	   
	   
	   
	  
	   
//        int arr[] = new int[10];
//	    int z=10;
//	    int y=10;
//	    for(int i=0;i<=arr.length;i++)
//	    {
//	    	 System.out.print(z);
//	    }
       
//	   int a[] = {10,20,30,40};
//	   {
//		 int sum=0;
//		 for(int i=0; i<=a.length; i++)
//		 {
//			 System.out.println(a[i]);
//			 sum = sum+a[i];
//			 System.out.println(sum);
//		 }
//	   }
	   
	    
   }
}

