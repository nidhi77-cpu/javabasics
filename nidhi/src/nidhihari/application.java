package nidhihari;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import test.WebDriver;


public class application {
	
 // public static void aug()
 // {
//	  try
//	  {
//		  throw new ArithmeticException("dddd"); 
//	  }
//	catch(Exception e)
//	  {
//		System.out.println("good");
//	  }
  
 // }
	  


	//public static void main(String[] args) {
		
	//	aug();
//	}
//}
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "E:\\chromdriver\\chromedriver.exe");
//		WebDriver driver =  new ChromeDriver();
//		driver.get("https://www.selenium.dev/downloads/");
//		
//		try
//		
//		{
////			int a=0,b=10;
////			int c=b/a;
//		try
//		{
//			int[] a1 = new int[5];
//			a1[7]=9;
//			
//		}catch(Exception e)
//		{
//			System.out.println("mm");
//		}
//		
//		try
//		{
//
//			int a=0,b=10;
//		int c=b/a;
//		}
//		
//		catch(Exception e)
//		{
//			System.out.println("hhhh");
//		}
//		
//		finally
//		{
//			System.out.println("shutup");
//		}
//		}
//		catch(Exception e)
//		{
//			System.out.println("aaa");
//		}
//		
//		System.out.println("sss");
//	
//	
//	}
//	}
	
	//public  void main(String [] args)
	{
		ArrayList <String> list1 = new ArrayList<String>() ; // it can store only string objects
		ArrayList list2 = new ArrayList() ;
		list1.add("john");
		list1.add("oo");
		list1.add("jo");
		list1.add("joh");
		list2.add("shhan");
		
		System.out.println(list1);
	
		
		String name = list1.get(0); // to get the elements
		System.out.println(list2);
		System.out.println(name);
		
		// update element in list
		
	list1.set(0, "nidhi");
	System.out.println(list1);
	
	if(list1.contains("nidhi"))   // comtains
		
	{
		System.out.println("good");
	}
		
	
	
	
	// iterate using for each loop
	
	for(String str:list1)
	{
		System.out.println(str);
	}
	}
private Object list1;
// using iterator
	//Iterator<String> itr= list1.iterator;

//int a;
int b;

String s1 = "arrey";
String s2 = "waah";


//ArrayList list11 = new ArrayList();
//
//
//
//
//for(String str1: list1)
//{
//	System.out.println(list1);
//}
Hashtable table = new Hashtable(); // key, values

public static void add(int a ,int b)
{
	int sum = a+b;
	
	System.out.println(sum);
}

public static void mul(int a ,int b)
{
	int sum = a*b;
	
	System.out.println(sum);
}

public static void div(int a ,int b)
{
	int sum = a/b;
	
	System.out.println(sum);
}


public static void  tesy1(String a, String b)
{
	
String s1 = "arrey";
String s2 = "waah";

if(s1.contains("arre"))
		{
	System.out.println(s1);
		}
else
{
	System.out.println(s2);
}
	
}


public static void main1 (String[] args)
{
	tesy1("ebbb", "");
}

	
}
	




