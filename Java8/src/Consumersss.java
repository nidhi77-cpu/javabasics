import java.util.function.Consumer;
import java.util.*;
/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Consumersss {

	// predicate ---//boolean valued function ///
	// function -----// performs some actionss/////
	
	//consumers//--------// it will consume item , consumers never return anything //
	
	public static void main(String[] args) {
		Consumer<String> cosmer = x -> System.out.println(x.substring(0, 3));
		cosmer.accept("vipul");

		Consumer<List<Integer>> ls = li -> {
			for (Integer i : li) {
				System.out.println(i + 100);
			}
		};

		Consumer<List<Integer>> l1s = li -> {
			for (Integer i : li) {
				System.out.println(i);
			}
		};

		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		ls.accept(list);
		l1s.andThen(ls).accept(list);

		Consumer<List<String>> lss = liiies -> {
			for (String s : liiies) {
				System.out.println(s.concat("hellowords"));
			}
		};

	}

}