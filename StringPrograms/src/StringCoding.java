/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
import java.util.*;
public class StringCoding {

	public static int lengthOfLastWord(String s) {
		
		String[] a = s.split(" ");
		s=  a[a.length-1];
		int size = s.length();
		return size;

	}
	
	 public static void main(String[] args) {
		//lengthOfLastWord("Hello World");
		String strs[] = {"flower","flow","flight"};
		// longestCommonPrefix(strs); ;
	}

	private static String longestCommonPrefix(String []strs) {
	List<String> as = new ArrayList<>();
	
	if(strs.length==0) {
		return "";
	}
	
	if(strs.length==1) {
		
	}
		for(String s : strs) {
	     s = s.substring(0,2);
	     as.add(s);
		}
		return null;
		
		
		
	
	
		
		
			
			
			
			
	
		
	}

}
