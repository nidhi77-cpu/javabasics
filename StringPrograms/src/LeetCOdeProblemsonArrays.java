import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCOdeProblemsonArrays {

	public static void main(String[] args) {
		/*
		 * int[] nums = { 3,2,3 }; int target = 6; // twoSum(nums, target);
		 */
		// getConcatenation(nums);
		int num[] = {2,5,1,3,4,7};
		int n =3;
		shuffle(num , n);

	}

	private static int[] shuffle(int[] num, int n) {
		int n1 = num.length / 2;
		int[] result = new int[num.length];

		for (int i = 0; i < n1; i++) {
			result[2 * i] = num[i];
			result[2 * i + 1] = num[i + n1];
		}

		return result;

	}

	private static int[] twoSum(int[] nums, int target) {
     HashMap<Integer, Integer> mp = new HashMap<>();
		int[] total = new int[2];;
		for (int i = 0; i < nums.length-1; i++) {
			/*
			 * target = nums[i] + nums[i + 1]; as.add(i); as.add(i + 1);
			 */
			if(nums[i] +nums[i+1]== target) {
				mp.put(i, i+1);
			}
		}
	    
		for(Map.Entry<Integer, Integer> m : mp.entrySet()) {
			total[0] = m.getKey();
			total[1] = m.getValue();
		}
		return total;

	}

	private static int [] getConcatenation(int[] nums) {
		//ans[i] == nums[i] and ans[i + n] == nums[i]
        int [] sol = new int [2* nums.length];
		for (int i = 0; i < nums.length; i++) {
			sol[i] = nums[i];
			sol[i+nums.length] = nums[i];
		}
		
       return sol;
	}

}