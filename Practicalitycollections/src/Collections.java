import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

import javax.xml.stream.events.Characters;

public class Collections {
	
	
	
	
	public static void main(String[] args)
	{
		/*
		 * ArrayList<String> ar = new ArrayList<String>(5);
		 * 
		 * System.out.println(ar.stream());
		 */
		ArrayList<String> ar = new ArrayList<>();
		
		ar.add("nidhi");
		ar.add("amma");
		ar.add("appa");
		ar.add("hari");
		
		ar.stream().forEach(System.out::println);
		
		System.out.println("the end of arraylist------------------------->>>");
		
		// hashmap will not store duplicates and will not give in ascending order
		//treemap will sort in ascending order autoatically.
		
		Map<String, Integer> map1 = new HashMap<>();
		
		map1.put("nidhi", 3);
		map1.put("aidhi", 3);
		map1.put("bidhi", 3);
		map1.put("cidhi", 3);
		
		/*
		 * for(Map.Entry<String, Integer> mss : map1.entrySet()) {
		 * System.out.println(mss); }
		 */
		
		for(String keys : map1.keySet())
		{
			System.out.println(keys);
		}
		
		//using iterators:
		Iterator<Map.Entry<String, Integer>> it = map1.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry<String, Integer> set = it.next();
			System.out.println("key value is" + set.getKey());
			
			
			System.out.println("value is"+ set.getValue());
		}
		
		// 1st program  and 2 program
		
		ArrayList<String> asr = new ArrayList<>();
		asr.add("red");
		asr.add("white");
		asr.add("black");
		asr.add("green");
		asr.add("brown");
		
		/* asr.stream().forEach(System.out::println); */
		Iterator<String> itr = asr.iterator();
		
		
			
			for(String arr : asr)
			{
				System.out.println(arr);
			}
		
		
		// 3 rd program:
	  // write a java program to insert an element in an arraylist at the first position:
			
			List<String> arr = new ArrayList<>();
			arr.add("nidhi");
			arr.add("hari");
			arr.add("namma");
			//["rrr" ,"rte" , "esd"]
			arr.add(0, "amma");
			arr.stream().forEach(System.out::println);
			
        //4 th program java program to retrive the specific element from the arraylist:
			
			
			List<String> arr1 = new ArrayList<>();
		  arr1.add("sriiss");
		  arr1.add("sriissnidhis");
		  arr1.add("sriisshariss");
		  arr1.remove(0);
		  arr1.add("sriissharisss");
		  arr1.add("sriissharissss");
		  arr1.add("sriissharisssss");
		  
		  arr1.stream().forEach(System.out::println);
		  
		  // 5th program Write a Java program to update an array element by the given element.
		 System.out.println( arr1.get(1).replace("sriisshariss", "nidhi"));
		 
		// Write a Java program to search for an element in an array list to another array list :
		 boolean state = false;
		if(arr1.contains(arr))
		{
			state = true;
		}
		else 
		{
			state = false;
		}
		System.out.println();
		
		// reverse the elemnet in any array list:
		
	for(int i = arr1.size()-1; i>=0; i--)
	{
		System.out.println(java.util.Collections.singleton(arr1.get(i)));
	}
		
	//compare two arraylist:
	boolean state1 = false;
	if(arr.equals(arr1))
	{
		state1 = true;
	}
	else
	{
		state1 = false;
	}
	     
		
	}
// program of string where it prints only speical charcters:
	
// program to print other than special charcters:
	String name ="nidhi&##78";
	
	int count =0;
	// not a digit, not a white space , not a letter , then print the cunt++
	// give it to syso  and print count:::
	
	
	
	
    
}