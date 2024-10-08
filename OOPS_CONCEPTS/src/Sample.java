/**
 * 
 */

/**
 * @author srinidhi.k
 *
 */
public class Sample {
	
	String name;
	int rollno;
	int id;
	/**
	 * @param name
	 * @param rollno
	 * @param id
	 */
	public Sample(String name, int rollno, int id) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.id = id;
	}
	
	public void showdetials()
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(id);
	}

}
