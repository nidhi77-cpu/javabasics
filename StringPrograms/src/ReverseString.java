
/**
 * 
 */
import java.util.*;
import java.util.Map.Entry;

/**
 * @author srinidhi.k
 *
 */
public class ReverseString {

	static String reverseStringWordWise(String input) {
		String[] arr = input.split(" ");
		String late = "";

		// base case level //
		if (arr.length == 1) {
			return input;
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			late = late + arr[i] + " ";
		}

		return late;

	}

	public static void main(String[] args) {
		/*
		 * String s = "nidhi"; String s1 = "";
		 * 
		 * for(int i=s.length()-1; i>=0 ;i--) { s1 = s1+s.charAt(i); }
		 * System.out.println(s1);
		 */
		/*
		 * Scanner sc = new Scanner(System.in); String input = sc.nextLine();
		 */
		// String ans = reverseStringWordWise(input);
		// String ans = reverseStringWord(input);
		/*
		 * String[] word1 = {"abc", "d", "defg"}; String[] word2 = {"abcddefg"}; //
		 * boolean ans = arrayStringsareEqual(word1, word2); System.out.println(ans);
		 */
		String s = "abc";
		int[] indices = {0,1,2};
		String ans = restoreString(s, indices);
	}

	private static String restoreString(String s, int[] indices) {

		Map<Integer, String> maps = new HashMap<>();

		String ch = "";
		for (int i = 0; i < s.length(); i++) {
			maps.put(indices[i], String.valueOf(s.charAt(i)));
		}
		for (Map.Entry<Integer, String> m : maps.entrySet()) {
			ch = ch + m.getValue();
		}

		return ch;
	}

	private static boolean arrayStringsareEqual(String[] word1, String[] word2) {

		String a = "";
		String b = "";

		// Concatenate all strings in the first array into a single string in the given
		// order, the same for the second array.//

		/*
		 * for (int i = 0; i < word1.length; i++) { a = a + word1[i].charAt(i); } for
		 * (int i = 0; i < word2.length; i++) { b = b + word2[i].charAt(i); }
		 */
		/*
		 * for (int i = 0; i < word1.length; i++) {
		 * 
		 * a = a + word1[i].charAt(i); }
		 * 
		 * for (int i = 0; i < word2.length; i++) {
		 * 
		 * b = b + word2[i].charAt(i); }
		 */

		/*
		 * a = String.valueOf(word1); b = String.valueOf(word2);
		 */
		for (int i = 0; i < word1.length; i++) {
			a = a + word1[i];
		}
		for (int j = 0; j < word2.length; j++) {
			b = b + word2[j];
		}

		if (a.equals(b)) {
			return true;
		}

		return false;
	}

	private static String reverseStringWord(String input) {
		String[] arr = input.split(" ");
		String late1 = "";
		// base case level //
		if (arr.length == 1) {
			return input;
		}

		/*
		 * for (int i = arr.length - 1; i >= 0; i--) { late1 = late1 + arr[i] + " "; }
		 */

		for (String s : arr) {

			for (int j = s.length() - 1; j >= 0; j--) {
				late1 = late1 + s.charAt(j);
			}
			late1 = late1 + " ";

		}

		return late1.trim();

	}

}