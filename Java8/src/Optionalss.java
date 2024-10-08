
/**
 * 
 */

import java.util.*;

/**
 * @author srinidhi.k
 *
 */
public class Optionalss {

	public static Optional<String> getname(String s) {

		
		return Optional.of("nidhi");
		

	}

	public static void main(String[] args) {
		Optional<String> op = getname("nidhi");
		
		/*
		 * if (name.isPresent()) { System.out.println(name.get()); }
		 */
		
		String nameTobeused = op.orElse("na");
		System.out.println(nameTobeused);
	//	op.orElseGet(()->"nidhi");
		op.ifPresent(System.out::println);
	      
	     
		
		Optional<String> as = null;
		as.ifPresent(x -> System.out.println(x.substring(0,3)));
		
		
		
	  
	}

}
