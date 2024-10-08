package Collection_framwork;
import java.util.ArrayList;
import java.util.Collections;


// array list //
//linked list//
//stack//
//queue//
//set//
//map//
//trees//
//graphs//

public class ArrayLists {
	
	
	
	public static void main(String [] args) {
		 ArrayList<String> as = new ArrayList<>();
		 
		 as.add("nidhi");
		 as.add("comedy");
		 as.add("peace guyss");
		 
		 
			
			  for(String s : as) { System.out.println(s); }
			 
		 
		 
		System.out.println(as.clone()); 
		 Collections.sort(as);
	}

}
