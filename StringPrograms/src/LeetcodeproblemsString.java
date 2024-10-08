import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map.Entry;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import javax.swing.text.Utilities;

public class LeetcodeproblemsString {

	public static void main(String[] args) {
		/*
		 * String[] sent = {"alice and bob love leetcode", "i think so too",
		 * "this is great thanks very much"}; mostwordfound(sent);
		 */

		/*
		 * String s = "chopper is not a tanuki"; int k = 4;
		 * 
		 * truncateSentence(s, k);
		 * 
		 * 
		 */
		/*
		 * String s = "is2 sentence4 This1 a3";
		 * 
		 * sortsentence(s);
		 */
		/*
		 * String word = "rzwuktxcjfpamlonbgyieqdvhs"; Character ch = 's';
		 * //"shvdqeiygbnolmapfjcxtkuwzr"// : excepted//
		 * //"rzwuktxcjfpamlonbgyieqdvhs"// : output// reversePrefix(word, ch);
		 */
		/*
		 * String s = "poiinter"; // opiopnter finalstring(s);
		 */
		/*
		 * String[] words = { "abc","bcd","aaaa","cbc" }; Character x = 'a';
		 * 
		 * findWordsContaining(words, x);
		 * 
		 */

		/*
		 * String[] as = { "phone", "blue", "pixel" }; String[] as1 = { "computer",
		 * "silver", "lenovo" }; String[] as2 = { "phone", "gold", "iphone" };
		 * 
		 * List<String[]> items = new ArrayList<>(); items.add(as); items.add(as1);
		 * items.add(as2);
		 * 
		 * String ruleKey = "color"; String ruleValue = "silver";
		 * 
		 * countMatches(items, ruleKey, ruleValue);
		 */

		/*
		 * String sentence = "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.";
		 * countValidWords(sentence);
		 */
		/*
		 * String s = "ab"; String goal = "ba"; buddyStrings(s, goal);
		 */
		/*
		 * String address = "1.1.1.1"; defangIPaddr(address);
		 */

		/*
		 * String jewels = "aA"; String stones = "aAAbbbb"; numJewelsInStones(jewels ,
		 * stones);
		 */
		/*
		 * String command = "G()()()()(al)"; interpret(command);
		 */
		/*
		 * String [] words = {"abc","car","ada","racecar","cool"};
		 * firstPalindrome(words);
		 */

		/*
		 * String word ="abc"; palindrome(word);
		 */

		/*
		 * // {"alice","bob","charlie"}; List<String> words = new ArrayList<>();
		 * words.add("an"); words.add("apple"); // words.add("charlie");
		 * 
		 * Arrays.asList(words); String s = "a"; isAcronym(words,s);
		 */

		/*
		 * String[] opeartions = { "--X", "X++", "X++" };
		 * finalValueAfterOperations(opeartions); }
		 */
		/*
		 * String word1 = "ab"; String word2 = "pqrs"; mergeAlternately(word1, word2);
		 */

		/*
		 * String[] as = { "London","New York" }; String[] as1 = { "New York","Lima" };
		 * String[] as2 = { "Lima","Sao Paulo" };
		 * 
		 * List<String[]> items = new ArrayList<>(); items.add(as); items.add(as1);
		 * items.add(as2);
		 * 
		 * destCity();
		 */
		/*
		 * String sen =
		 * "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
		 * checkIfPangram(sen);
		 */
		/*
		 * char[] ch = { 'h', 'e', 'l', 'l', 'o' }; reverseCharacter(ch);
		 */
		/*
		 * String[] names =
		 * {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf",
		 * "WSpmqvb"}; int[] heights = {17233,32521,14087,42738,46669,65662,43204,8224};
		 * sortPeople(names, heights);
		 */

		/*
		 * String r = "lEetcOde"; sortVowels(r);
		 */

		/* String s ="aaabb"; areOccurrencesEqual(s); */
		/*
		 * String s ="Hello, my name is John"; countSegments(s);
		 */

		/*
		 * String word =
		 * "2393706880236110407059624696967828762752651982730115221690437821508229419410771541532394006597463715513741725852432559057224478815116557380260390432211227579663571046845842281704281749571110076974264971989893607137140456254346955633455446057823738757323149856858154529105301197388177242583658641529908583934918768953462557716z97438020429952944646288084173334701047574188936201324845149110176716130267041674438237608038734431519439828191344238609567530399189316846359766256507371240530620697102864238792350289978450509162697068948604722646739174590530336510475061521094503850598453536706982695212493902968251702853203929616930291257062173c79487281900662343830648295410";
		 * numDifferentIntegers(word);
		 */
		
		//stack problems//
		/*
		 * String s= "(()())(())"; removeOuterParentheses(s);
		 */
		
		 printDuplicateCharacters("Programming");
//	how to remove the duplicate character from String? (solution)
//	How to find the maximum occurring character in given String? (solution)
		
		
	}

	

	private static void printDuplicateCharacters(String string) {
		HashMap<Character, Integer> hs = new HashMap<>();
		char[] ch = string.toCharArray();
		for (Character c : ch) {
             if(hs.containsKey(c)) {
            	 hs.put(c, hs.get(c)+1);
             }
             else {
            	 hs.put(c,1);
             }
		}
		
		for(Map.Entry<Character, Integer> map : hs.entrySet()) {
			if(map.getValue()==1) {
				System.out.printf("%s : %d %n" ,map.getKey(), map.getValue());
			}
		}
	}

	private static String removeOuterParentheses(String s) {
	  Stack<Character> st = new Stack();
	  //lifo
	   StringBuilder sb = new StringBuilder();
	   
		for (Character c : s.toCharArray()) {
			if (c == '(') {
				if (!st.isEmpty()) {
					sb.append(c);
				}
				st.push(c);
			} else if (c == ')') {
				st.pop();

				if (!st.isEmpty()) {
					sb.append(c);
				}
			}

		}
		
		return sb.toString();
	}

	private static int numDifferentIntegers(String word) {

		String name = "0123456789";
		char[] ch = word.toCharArray();
		String a[] = new String[word.length()];
		Map<Double, String> hs = new TreeMap<>();
		// Set<Double> hs = new HashSet<>();
		// int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (!name.contains(String.valueOf(word.charAt(i)))) {
				ch[i] = ' ';
			}
		}
		String names = new String(ch);

		String[] split1 = names.trim().split(" ");

		for (int i = 0; i < split1.length; i++) {
			if (split1[i].isEmpty()) {
				continue;
			}

			/*
			 * if (!hs.containsKey(split1[i])) { hs.put(count = count + 1, split1[i]); }
			 */
			hs.put(Double.parseDouble(split1[i]), split1[i]);

		}

		return (int) hs.size();

	}

	private static int countSegments(String s) {
		int count = 0;
		String split[] = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (split[i].isEmpty()) {
				continue;
			}
			count++;
		}

		return count;

	}

	private static boolean areOccurrencesEqual(String s) {

		/* String s1[] = s.split(""); */
		int count = 0;
		HashMap<String, Integer> hs = new HashMap<>();
		boolean status = false;
		List<Integer> as = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					hs.put(String.valueOf(s.charAt(j)), count = count + 1);
				}

			}
			count = 0;
		}

		for (Map.Entry<String, Integer> ms : hs.entrySet()) {
			as.add(ms.getValue());
		}

		for (int i = 0; i < as.size() - 1; i++) {
			if (as.get(i) == as.get(i + 1) && i + 1 < as.size()) {
				status = true;
			} else {
				status = false;
			}
		}
		return status;
	}

	private static String sortVowels(String r) {
		/*
		 * r.equalsIgnoreCase(r); int asci = 0; List<Integer> as = new ArrayList<>();
		 * List<Integer> ass = new ArrayList<>(); Map<Integer, Integer> hs = new
		 * HashMap<>(); int i=0; for (i = 0; i < r.length() - 1; i++) { if (r.charAt(i)
		 * == 'a' ||r.charAt(i) == 'A' || r.charAt(i) == 'e' ||r.charAt(i) == 'E'||
		 * r.charAt(i) == 'i' ||r.charAt(i) == 'I'|| r.charAt(i) == 'o' ||r.charAt(i) ==
		 * 'O' || r.charAt(i) == 'u' ||r.charAt(i) == 'U') { asci = (int) r.charAt(i);
		 * // as.add(asci); hs.put(i,asci ); } } // Collections.sort(as);
		 * for(Map.Entry<Integer, Integer> m : hs.entrySet()) {
		 * 
		 * as.add(m.getValue()); } Collections.sort(as);
		 * 
		 * for(int a : as) {
		 * 
		 * }
		 */
		// lEetcOde//
		char[] ch = r.toCharArray();
		String s = "AEIOUaeiou";
		List<Integer> as = new ArrayList<>();
		List<Character> ass = new ArrayList<>();

		for (int i = 0; i < r.length(); i++) {
			if (s.contains(String.valueOf(r.charAt(i)))) {
				as.add(i);
				ass.add(r.charAt(i));

			}
		}
		Collections.sort(ass);
		for (int i = 0; i < as.size(); i++) {
			ch[as.get(i)] = ass.get(i);
		}

		String a = new String(ch);
		return a;
	}

	public static String[] sortPeople(String[] names, int[] heights) {
		List<String> result = new ArrayList<>();
		String[] s = new String[names.length];

		String name = "";
		int height = 0;
		List<String> as = new ArrayList<>();

		/* Map<Integer, String> map = new MultiMa */
		ListMultimap<Integer, String> map = ArrayListMultimap.create();
		for (int i = 0; i < names.length; i++) {
			name = names[i].trim();
			height = heights[i];
			map.put(height, name);

		}

		/*
		 * for (Entry<Integer, String> m : map.entries()) {
		 * 
		 * as.add(m.getValue()); Collections.sort(as); }
		 * 
		 * Collections.reverse(as); for (int i = 0; i < s.length; i++) { s[i] =
		 * as.get(i); }
		 */
		List<Integer> sortedHeights = new ArrayList<>(map.keySet());
		Collections.sort(sortedHeights, Collections.reverseOrder());

		for (int height1 : sortedHeights) {
			List<String> namesAtHeight = map.get(height1);
			Collections.sort(namesAtHeight);
			result.addAll(namesAtHeight);
		}

		return result.toArray(new String[0]);

	}

	private static char[] reverseCharacter(char[] s) {

		/*
		 * Character[] c = new Character[s.length]; String s = ""; int j = 0; for (int i
		 * = s.length - 1; i >= 0; i--) { // s = s+String.valueOf(ch[i]); c[j] = s[i];
		 * j++; } return c;
		 */
		String s1 = s.toString();
		String res = "";
		for (int i = s.length - 1; i >= 0; i--) {
			res = res + String.valueOf(s[i]);
		}
		s = res.toCharArray();
		return s;
	}

	private static boolean checkIfPangram(String sen) {
		HashMap<String, Integer> map = new HashMap<>();
		int count = 0;
		String ch = "";
		String split[] = sen.split("");
		for (int i = 0; i < split.length; i++) {
			map.put(String.valueOf(sen.charAt(i)), count++);
		}
		for (Map.Entry<String, Integer> m : map.entrySet()) {

			ch = ch + m.getKey();

		}

		if (ch.length() >= 26) {
			return true;
		}
		return false;
	}

	private static void destCity() {
		// TODO Auto-generated method stub

	}

	private static String mergeAlternately(String word1, String word2) {
		String result = "";
		String word1extra = "";
		String word2extra = "";
		if (word1.length() > word2.length()) {
			word1extra = word1.substring(word2.length(), word1.length());
			for (int i = 0; i < word2.length(); i++) {
				result = result + word1.charAt(i) + word2.charAt(i);
			}
			result = result + word1extra;
		} else if (word2.length() > word1.length()) {
			word2extra = word2.substring(word1.length(), word2.length());
			for (int i = 0; i < word1.length(); i++) {
				result = result + word1.charAt(i) + word2.charAt(i);
			}
			result = result + word2extra;
		} else {
			for (int i = 0; i < word1.length() - 1; i++) {
				result = result + word1.charAt(i) + word2.charAt(i);
			}
		}
		return result;

	}

	private static int finalValueAfterOperations(String[] opeartions) {

		int X = 0;

		for (int i = 0; i < opeartions.length; i++) {
			if (opeartions[i].equals("--X")) {
				X = X - 1;
			}
			if (opeartions[i].equals("X--")) {
				X = X - 1;
			}
			if (opeartions[i].equals("++X")) {
				X = X + 1;
			}
			if (opeartions[i].equals("X++")) {
				X = X + 1;
			}

		}
		return X;
	}

	public static int matchOpartors(String s) {
		int X = 0;

		int s1 = Integer.parseInt(s);

		if (s1 == --X) {
			return 1;
		}
		if (s1 == X++) {
			return 2;
		}

		switch (s1) {
		case 1:
			s1 = s1 + 1;
			return s1;

		case 2:
			s1 = s1 + 1;
			return s1;

		case 3:
			s1 = s1 - 1;
			return s1;

		case 4:
			s1 = s1 - 1;
			return 0;

		default:
			return 0;

		}

	}

	private static boolean isAcronym(List<String> words, String s) {
		int i = 0;
		String newst = "";
		for (String s2 : words) {
			newst = newst + s2.charAt(i);
		}

		if (s.equals(newst)) {
			return true;
		}
		return false;

	}

	private static boolean palindrome(String word) {
		int length = word.length();

		// Check if the characters from the beginning and end are equal
		for (int i = 0; i <= length / 2; i++) {
			if (word.charAt(i) != word.charAt(length - 1 - i)) {
				return false; // Not a palindrome
			}
		}

		return true; // It's a palindrome

	}

	private static boolean firstPalindrome(String[] words) {
		String first = "";
		String rev = "";

		for (String s : words) {
			// lopping to see first occurence //
			for (int i = 0; i <= s.length() - 1; i++) {
				first = first + s.charAt(i);
			}
			for (int j = s.length() - 1; j >= 0; j--) {
				rev = rev + s.charAt(j);
			}
		}
		if (first.equalsIgnoreCase(rev)) {
			return true;
		}
		return false;
	}

	private static String interpret(String command) {

		String split[] = command.split("");

		String newst = "";
		for (int i = 0; i < split.length; i++) {

			if (split[i].equals("(")) {
				for (int j = 0; j < split.length; j++) {

				}
			}
		}
		return newst;

		/*
		 * command = command.replace("()", "o"); command = command.replace("(al)",
		 * "al");
		 */

		/* return command; */
	}

	private static int numJewelsInStones(String jewels, String stones) {

		String split[] = stones.split("");
		int count = 0;
		for (int i = 0; i < split.length; i++) {
			if (jewels.contains(split[i])) {
				count++;
			}
		}
		return count;
	}

	private static String defangIPaddr(String address) {

		String split[] = address.split("");
		String newst = "";
		for (int i = 0; i < split.length; i++) {
			if (split[i].equals(".")) {
				newst = newst + split[i].replace(".", "[.]");
			} else {
				newst = newst + split[i];
			}
		}
		return newst;
	}

	private static boolean buddyStrings(String s, String goal) {
		String split[] = s.split("");
		String split1[] = goal.split("");
		// a b // b a//
		int i = 0;
		int j = 0;
		for (i = 0; i < s.length(); i++) {

			for (j = 0; j < goal.length(); j++) {

				if (split[i] != split1[j]) {
					split1[j] = split[i];
					split1[i] = split[j];
				}
			}

		}
		if (goal == split[i] + split[j]) {
			return true;
		}

		return false;

	}

	private static int countValidWords(String sentence) {

		int count = 0;
		sentence = sentence.toLowerCase().trim();
		String split[] = sentence.split(" ");
		for (int i = 0; i < split.length; i++) {
			// Check if the word contains "!", "|", ".", digits, or is an empty string
			if (split[i].contains("!") || split[i].contains("|") || split[i].contains(".")
					|| split[i].matches(".*\\d.*") || split[i].equals("")) {
				continue; // Skip this word if it contains any of the specified characters
			}
			// Check if there is at most one hyphen and it is surrounded by lowercase
			// characters
			if (split[i].contains("-") && (split[i].startsWith("-") || split[i].endsWith("-"))) {
				continue; // Skip this word if the hyphen placement is incorrect
			}
			count++;
		}
		return count;
	}

	private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		// Iterate on each item, and check if each one matches the rule according to the
		// statement.
		int count = 0;

		for (List<String> item1 : items) {
			if (matchesRules(item1, ruleKey, ruleValue)) {
				count++;
			}
		}
		return count;
	}

	private static boolean matchesRules(List<String> item1, String ruleKey, String ruleValue) {
		int index;
		switch (ruleKey) {
		case "type":
			index = 0;
			break;
		case "color":
			index = 1;
			break;
		case "name":
			index = 2;
			break;
		default:
			return false;
		}

		return item1.get(index).equals(ruleValue);
	}

	private static List<Integer> findWordsContaining(String[] words, Character x) {
		List<Integer> as = new ArrayList<>();

		String s1 = String.valueOf(x);

		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(s1)) {
				as.add(i);
			}
		}

		return as;
	}

	private static void finalstring(String s) {

		/*
		 * int j =0; int k =0; for (int i = 0; i < s.length() ; i++) {
		 * if(s.charAt(i)=='i') { j=i;
		 * 
		 * for(k=j-1 ; k>=0 ; k--) {
		 * 
		 * latest= latest+s.charAt(k);
		 * 
		 * } s=s.replace(s.substring(0,j), latest); }
		 * 
		 * 
		 * 
		 * 
		 * } latest = latest+s.substring(j+1, s.length()); return latest.trim();
		 * 
		 * 
		 * String s = "poiinter"; //opiopnter
		 * 
		 * 
		 * // String latest = "";
		 * 
		 * 
		 * int j = 0; int k = 0; StringBuilder sb ; for (int i = 0; i < s.length(); i++)
		 * { if (s.charAt(i) == 'i') { new StringBuilder(); continue;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * String latest = ""; String split[] = s.split("i"); StringBuilder sb = null;
		 * 
		 * for (int i = 0; i < split.length; i++) { sb = new
		 * StringBuilder(split[i]).reverse(); }
		 * 
		 * /// latest = latest + s.substring(j + 1, s.length()); return latest + sb;
		 * 
		 * }
		 * 
		 * private static String reversePrefix(String word, Character ch) { /* String s
		 * = String.valueOf(ch); String num = String.valueOf(ch);
		 */
		/*
		 * String latest = ""; int j = 0; for (int i = 0; i < word.length(); i++) {
		 * 
		 * if (word.charAt(i) == ch) { j = i; break; }
		 * 
		 * }
		 * 
		 * for (int i = j; i >= 0; i--) { latest = latest + word.charAt(i); }
		 * 
		 * latest = latest + word.substring(j + 1, word.length()); return latest.trim();
		 */

	}

	private static String sortsentence(String s) {

		String latest = "";
		String split[] = s.split(" ");
		HashMap<String, String> map = new HashMap<>();
		for (String s1 : split) {
			String num = s1.substring(s1.length() - 1);
			s1 = s1.substring(0, s1.length() - 1);

			map.put(num, s1);

		}

		for (Map.Entry<String, String> m : map.entrySet()) {
			latest = latest + m.getValue() + " ";
		}
		return latest.trim();
	}

	private static String truncateSentence(String s, int k) {
		// HashMap<Integer, String> map = new HashMap<>();
		String split[] = s.split(" ");
		String latest = "";
		for (int i = 0; i < k; i++) {
			latest = latest + split[i] + " ";
		}
		return latest;
	}

	private static Integer mostwordfound(String[] sent) {

		int countLength = 0;
		ArrayList<Integer> as = new ArrayList<>();

		for (String s : sent) {

			String split[] = s.split(" ");
			countLength = split.length;
			as.add(countLength);
		}

		Integer ass = Collections.max(as);

		return ass;

	}

}
