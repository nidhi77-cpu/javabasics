import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Streams {

	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		
		
		int sum = Stream.of(a , b)
				.reduce(0, Integer::sum);
		
		
	//	int arr[] = {1,2,3,4};
		
		/*
		 * int sum = Arrays.stream(arr).filter(n->n%2==0); System.out.println(sum);
		 */
		/*
		 * IntStream sum = Arrays.stream(arr).filter(x->x%2==0); System.out.println();
		 */
		
		List<String> list = Arrays.asList("nidhi", "hari" ,"amma");
		Stream<String> listss= list.stream();
		
		/*
		 * String [] arr = {"appa" , "chikappa" ,"chikamma"}; Stream<String> veggies =
		 * Arrays.stream(arr); Stream.of(veggies);
		 */
		/*
		 * Stream<Integer> number = Stream.of(1,2,3); Stream <Integer> number1 =
		 * Stream.iterate(0, n-> n+1).limit(100); System.out.println(number1);
		 */
		
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 23, 2, 4, 54, 32, 101 , 112 , 1132);
		List<Integer> num1= num.stream()
				.filter(x -> x % 2 == 0)
				.map(x->x/2)
				.distinct()
				.sorted((a,b)->b-a)
				.limit(4)
				.skip(1)
				.collect(Collectors.toList());
		System.out.println(num1);
		//num1.stream().map(x->x/2).collect(Collectors.toList());
		
		List<Integer> num2 = Stream.iterate(0, x->x+100).limit(10).skip(1).collect(Collectors.toList());
		System.out.println(num2);
		
		 
	        
		List<Integer> as1 = Arrays.asList(1,2,3,4,5,6,7,8);
		
		as1.stream()
		.filter(x->x%2==0)
		.map(x->x/2)
		.distinct()
		.limit(2)
		.sorted((a,b)->b-a)
		.collect(Collectors.toList());
		
		
		
		List<Integer> ass = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 23, 2, 4, 54, 32, 101);
		ass.stream().filter(x -> x%2==0).map(x-> x/2).distinct()
		.limit(2)
		.sorted((a,b)->b-a)
		.skip(1)
		.collect(Collectors.toList());
		System.out.println(ass);
		
		
		
	
		
	}

}