import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringProgram {
	// string program to find the number if maxiumum charcter:
	
	public static int maxchar(String s1)
	{
	
		HashMap<Character , Integer> charcountMap = new HashMap<>();
		char[] characterarrays = s1.replaceAll("\\s", "").toCharArray();
		int count=0 ;
		for(char c : characterarrays)
		{
			if(charcountMap.containsKey(c))
			{
				charcountMap.put(c, charcountMap.get(c)+1);
			}
			else
			{
				charcountMap.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> maps : charcountMap.entrySet())
		{
		count=maps.getValue();
		char cs=maps.getKey();
			if(count > 0)
				{
				System.out.println(count);
				}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		/*String s1 = "Java";
	    String s= "";*/
	 //   maxchar("NIDHII");
		/*
		 * int counts = maxoccurence("NIDHII"); System.out.println(counts);
		 */
		
		/*
		 * String s =lastthreeletters(
		 * "hiefiueuiwuiuivivguicwdiciwciwicicidciwdciwdibwivbiwdciwvuiwdivwduivwuivbuwibvuiwbvui"
		 * ); System.out.println(s);
		 */
		String s = "nidhii";
		maxoccuringCharcter(s);
	   
	}

	private static void maxoccuringCharcter(String s) {

		int count = 0;

		HashMap<Integer, String> hs = new HashMap<>();
		List<String> as = new ArrayList<>();

		String ch[] = s.split("");

		for (int i = 0; i < ch.length; i++) {
			if (ch[i].equals(hs)) {
				hs.put(i=i+1, ch[i]);
			} else {
				hs.put(count = count+1, ch[i]);
			}
			count=0;
		}

		for (Map.Entry<Integer, String> map : hs.entrySet()) {
			Integer s1 = map.getKey();
			String c = hs.get(s1);
			as.add(c);
		}

		Collections.max(as);
	}

	private static String lastthreeletters(String string) {
		String late = null;
		if(string.length()==3) {
			late = string.toUpperCase();
		}
		
		else {
	 late = string.substring(string.length()-3, string.length());
		late = late.toUpperCase();
		}
		return late;
	}

	private static int  maxoccurence(String string) {
		
		int count=0;
		for(int i =0 ; i< string.length()-1 ; i++) {
			
			for(int j =0 ; j<string.length()-1; j++) {
				
			}
			
		}
		return count;
		
		
	}

}