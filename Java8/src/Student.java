import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Student {

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	String name;
	Integer id;
	
	
	public  Student(String name , Integer id) {
		this.id= id;
		this.name= name;
	}
	
	public static void main(String[] args) {
	Student s = new Student("nidhi", 4);
	Student s1 = new Student("hari", 3);
	Student s2 = new Student("amma", 2);
	Student s3 = new Student("appa", 1);
	
	List<Student> ls = new ArrayList<>();
	  ls.add(s);
	  ls.add(s1);
	  ls.add(s2);
	  ls.add(s3);
	  
	  Collections.sort(ls , (a , b)-> a.id - b.id);
	  System.out.println(ls);
	  
	
	

	}

}
