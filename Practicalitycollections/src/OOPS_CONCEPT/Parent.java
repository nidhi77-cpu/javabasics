package OOPS_CONCEPT;

public class Parent extends Student {
  // inhertiance // stuff
	public Parent(String name, Integer rollnumber) {
		super(name, rollnumber);
		// TODO Auto-generated constructor stub
	}
	
	// method overloading //
	
	public void status() {
		
	}
	
	
	public void status(int attdenace, int overallstuff)
	{
		
	}
	
	public void status(int pa , double paa) {
		
	}
	
	@Override
	public void marks()
	{
	  System.out.println("huraau i have been overdiided enjayy ");
		
	}
	
	
	
	public static void main(String [] args)
	{
	   Parent p = new Parent("hari", 25);
	   p.address();
	   p.marks();
	}

}
