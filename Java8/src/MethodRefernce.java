import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class MethodRefernce {
	public void hello(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		List<String> as = Arrays.asList("nidhi", "hari", "bob");
		/*
		 * MethodRefernce mr = new MethodRefernce(); as.forEach(mr::hello);
		 */
          as.stream().map(x-> new Student(x, 1)).collect(Collectors.toList());
		
		
	}
	
	private static  class Student
	{
		@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id + "]";
		}

		String name;
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
		
		
		public  Student(String name , Integer id) {
			this.id= id;
			this.name = name;
	}

}
}
