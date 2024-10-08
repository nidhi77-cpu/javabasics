package oopsdpth;

public class cardriver {
	
	String name ;
	int bowl;
	
	// defult constructor
	 public cardriver()
	{
		System.out.println("good");
		
	}
	 public cardriver(String name, int bowl)
	 {
		this.name= name;
		this.bowl= bowl;
		System.out.println(name);
		System.out.println(bowl);
		 
	 }
   
	 public void start()
	 {
		 System.out.println("car starting  " + name);
	 }
	 public void bowl()
	 {
		 System.out.println("bowl correctly  " + bowl);
	 }
      
	 public void bowl(int size)
	 {
		 System.out.println("bowl correctly  " + bowl);
		 
		bowl= bowl+size;
		 System.out.println("bowl correctly  " + bowl);
		 
	 }
	

}
