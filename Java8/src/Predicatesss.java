import java.util.function.Predicate;

/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Predicatesss {

	public static void main(String[] args) {
		/*
		 * Predicate<Integer> pred = (i) -> {
		 * 
		 * if (i == 0) { return false; } else { return true; } }; pred.test(2);
		 */
		
		Predicate<Integer> predsalary = x -> x>10000;
		System.out.println(predsalary.test(100));
		Predicate<Integer> even  = x -> x%2 ==0;
		int arr[] = { 1,2,3,4,5,6};
		even.test(3);
		
		Predicate<String> startswithv = x -> x.toLowerCase().charAt(0) =='v';
		
		Predicate<String> endswithl = x -> x.toLowerCase().charAt(x.length()-1) == 'l';
		
		// predicate-joining :: and //or//negate//
		Predicate<String>  and = startswithv.and(endswithl);
		Predicate<String>  or = startswithv.or(endswithl);
		Predicate<String>  negate = startswithv.negate();
		System.out.println("next it is starting with respect to java 8 predicates guys");
		System.out.println(and.test("vipul"));
		System.out.println(or.test("vipul"));
		System.out.println(negate.test("vipul"));
		// predicate with respect to the student class guyss//
		
		Student s = new Student("nidhi", 4);
		Student s1 = new Student("hari", 3);
		
		Predicate<Student> vipul = x -> x.getName().contains("hari");
		System.out.println(vipul.test(s1));
		
		
		
		

	}
	
	private static class Student
	{
		String name;
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
