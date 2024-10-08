/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Constructors {
	
	String name ;
	int id;
	

	public Constructors(String name , int id) {
		this.name = name;
		this.id = id;
		System.out.println(name);
		System.out.println(id);
	}
	
	
	public Constructors(String name)
	{
		this(10.00); // explaintion of this stament in construcotrs:
		System.out.println("this is argumented  constructor");
	}
	
	public Constructors()
	{
		this(10);
		
		System.out.println("this is zero argument constructor");
	}
	
	public Constructors(double a)
	{
		System.out.println("this is double argument constructor");
	}
	public Constructors(int a)
	{
		System.out.println("this is double argument constructor");
	}

}
