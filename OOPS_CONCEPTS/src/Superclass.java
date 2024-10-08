import java.util.ArrayList;
import java.util.List;

public class Superclass {
	
	int x1 = 10;
	
	public void test()
	{
		System.out.println("this is test method of super class");
	}

	/**
	 * @param x1
	 */
	public Superclass(int x1) {
		
		this.x1 = x1;
	}
	
	// method overdiidng :
	
	
	public void addtest()
	{
	 List<String> name = new ArrayList<>();
	 name.add("nidhi");
	 name.add("hari");
	 
	 for(String finals : name)
	 {
		System.out.println(finals);
	 }
	}

}
