import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class AllStuffs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Predicate<Integer> ps = x-> x%2==0;
		Function<String , Integer>  fun= s-> s.length();
		Consumer<String > con = s -> s.length();
		Supplier<Integer> supp = () -> 1;
		
		/*
		 * if(ps.test(supp.get())){ con.accept(fun.apply("nidhi")); }
		 */
		
		BiPredicate<Integer , Integer> bs = (x, y) -> x*x==0 && y*y==0;
		System.out.println(bs.test(2, 4));
		
		BiFunction<String, Integer, String> bss = (x,y) -> "nidhi" +1;
		
		System.out.println(bss.apply("nidhi", 2));
		
		
		// anayonums functions //
		int a = 10; 
		int b =20 ;
	//	int c = a+b;
	//	System.out.println(c);
		
		
	Run r = (int a , int b) -> {
		int c = a+b;
	
	};

	}

}