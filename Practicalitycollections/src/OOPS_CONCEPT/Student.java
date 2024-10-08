/**
 * 
 */
package OOPS_CONCEPT;

/**
 * @author srinidhi.k
 *
 */
public class Student {
     
	 String name ;
	 Integer rollnumber;
	
	public Student(String name , Integer rollnumber)
	{
		this.name = name;
		this.rollnumber = rollnumber;
		System.out.println(name);
		System.out.println(rollnumber);
	}
	
	public Student(Student s1) {
		// TODO Auto-generated constructor stub
	}
	
	public void marks()
	{
		System.out.println(" these method gives the dummy marks ");
		
	}
	
	public void address()
	{
		System.out.println("these method gives the dummy address");
	}

	public static void main(String[] args) {
		
     Student s = new Student("nidhi", 21);
     Student s1 = new Student("juauua", 22);
     Student s2 = new Student(s1);
	}

}
