import java.util.HashMap;

/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Encodingstring {

	
	public static void main(String[] args) {
		// writing the logic to encode stuff//
		
		String s = "abbdcaas";
		
		String si = stringEncode(s);
		System.out.println(si);
		
		

	}

	private static String stringEncode(String s) {
        
		/*
		 * int count =1; HashMap<Character, Integer> map = new HashMap<>(); for(int i =0
		 * ; i< s.length()-1 ; i++) { if(map.containsKey(s)) { map.put(s.charAt(i),
		 * count+1); } else { map.put(s.charAt(i), count); } }
		 * 
		 * return map;
		 */
		/*
		 *  aabbc abcd abbdcaas Sample Output 1 : a2b2c1 a1b1c1d1 a1b2d1c1a2s1
		 */
		int count=0;
		String latest = "";
		Character c ;
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length() ; j++) {

			

			}
			latest = latest+Character.toString(s.charAt(i))+String.valueOf(count);
			count=0;
		}
		
	
		
		
		

		return latest;
		
	}

}
