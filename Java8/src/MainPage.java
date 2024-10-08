import java.util.function.Function;
import java.util.function.Predicate;
import java.util.*;

/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class MainPage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		dosomethingpagalla();

		/*
		 * // using object creation // Threading th = new Threading();
		 * 
		 * Thread thh = new Thread(th); th.run();
		 * 
		 * // using the THreading stuffs //
		 */
		
		/*
		 * Runnable runnable = () -> { for(int i =0 ; i<=10 ; i++) {
		 * System.out.println(i); } }; runnable.run();
		 */
		
		Runnable runnable = () ->
		{
			for(int i =0 ; i<10 ; i++) {
				System.out.println(i);
			}
		};
		
		runnable.run();
		
		
		List<Integer> ls = new ArrayList<>();
		
		ls.add(1);
		ls.add(3);
		ls.add(4);
		ls.add(2);
		
		// lambda expresiion in compartor for , sort method //
		Collections.sort(ls ,(a, b)-> b-a);
	
		
	// interfce if we create the object we will gate the anyinmous class daa//	
	Sampleguyss s = new Sampleguyss() {
		int x = 10;
		@Override
		public String getname() {
		    
			
			System.out.println(this.x);
			
			return "chuill maryee";
		}
	};
	
	// or we can use the lambda expression guys //
	
	 
		
		
		
		
	}
	
	

	private static void dosomethingpagalla() {
		 int a = 10;
		 Sampleguyss s1 = () -> 
		
		  {
			
			 return "nodho"; 
		  };
		
	}

}
