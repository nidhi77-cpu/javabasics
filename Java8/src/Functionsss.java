/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
import java.util.*;
import java.util.function.Function;
public class Functionsss {

	
	public static void main(String[] args) {
		
		Function<String, Integer> function = x -> x.length();
		System.out.println(function.apply("nidhi"));
		Function<String, String> function1 = x -> x.substring(0, 3);
		System.out.println(function1.apply("nidhi"));
		Function<Integer, Integer> function3 = x -> 2*x;
		Function<Integer, Integer> function4 = x -> x*x*x;
		
		Function<String, String> function2 = x -> x.toUpperCase();
         Function<List<Student>, List<Student>>ls = li ->
         {
        	 ArrayList<Student> l = new ArrayList<>();
        	 
        	 for( Student s : li) {
        		 
        		if(function1.apply(s.getName()).equalsIgnoreCase("vip")) {
        			l.add(s);
        		}
        	 }
        	 
        	return l;
         };
         
         
         
			/*
			 * Function<List<Student>, List<Student>> f = liis -> { ArrayList<Student> ass =
			 * new ArrayList<>(); for(Student ss : liis) {
			 * if(ss.getName().equalsIgnoreCase("nahusha")) { ass.add(ss); } } return ass;
			 * };
			 */
         
         
         
         
			Student s = new Student("nidhi", 4);
			Student s1 = new Student("hari", 3);
			Student s2 = new Student("amma", 2);
			Student s3 = new Student("vip", 1);
			Student s4 = new Student("nahusha", 5);
     	
     	List<Student> filter = Arrays.asList(s, s1 , s2 , s3);
     	List< Student> filteredname = ls.apply(filter);
     	System.out.println(filteredname);	
     	
     	///////////////////////////////////////////////
     	//function cahining //
     	System.out.println(function1.andThen(function2).apply("vipul"));
     	
     	
     	///////////////////////////////////////////////////
     	System.out.println(function1.compose(function2).apply("vipul"));
	}
	
	
	
	private static class Student
	{
		String name;
		@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id + "]";
		}
		public Student(String name, Integer id) {
			super();
			this.name = name;
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		Integer id;
		
	
	}

}