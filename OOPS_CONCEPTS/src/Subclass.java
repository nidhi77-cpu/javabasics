import java.util.ArrayList;
import java.util.List;

public class Subclass  extends Superclass{
	
	
	int x1 = 10;
	
	
	public void display()
	{
		System.out.println("this is display method of the subclass guys");
	}


	/**
	 * @param x1
	 * @param x12
	 */
	public Subclass(int x1) {
		super(1);  // explaintaion of super statment :
		
	}
	
	// method overdidng were we can chnage our logic:
	
	@Override
	public void addtest()
	{
		
		 List<String> name = new ArrayList<>();
		 name.add("amma");
		 name.add("appa");
		 
		 for(String finals : name)
		 {
			System.out.println(finals);
		 }
		}

}